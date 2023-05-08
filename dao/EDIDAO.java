package com.remichel.edi.dao;

import java.util.Set;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.remichel.core.dao.AbstractDAO;
import com.remichel.core.db.DBConnectionFactory;
import com.remichel.core.db.result.DBResult;
import com.remichel.core.db.util.Query;
import com.remichel.core.exception.ValidationException;
import com.remichel.core.util.Util;
import com.remichel.edi.model.EDI;
import com.remichel.edi.model.EDIEmailAddress;


@Repository
public class EDIDAO extends AbstractDAO {
	@Inject
	private EDIEmailAddressDAO ediEmailDAO;
	
	private static String SQL_EDI_RECS = "SELECT * FROM [BranchOps].[dbo].[EDI] WHERE [Active] = 1 ";

	
	public DBResult<EDI> populateObjectGraph(DBResult<EDI> dbResult) throws Exception {
		Set<Long> seqNums = dbResult.getResultSet().stream().map(EDI::getSeqNum).collect(Collectors.toSet());
		DBResult<EDIEmailAddress> emailDBResult = ediEmailDAO.getEmail(seqNums);
		
		dbResult.getResultSet().stream().forEach(o -> o.setEdiEmails(emailDBResult.getResultSet().stream().filter(m -> m.getEdiSeqNum() == o.getSeqNum()).collect(Collectors.toList())));
		
		return dbResult;
	}	
	
	public DBResult<EDI> getAll() throws Exception {		
		Query sqlQuery 		= new Query(SQL_EDI_RECS);
		DBResult<EDI> recs 	= getRecords(DBConnectionFactory.DBType.SQL_SERVER_DB, EDI.class, sqlQuery);
		return populateObjectGraph(recs);
	}
	
	public EDI get(final String tradingPartnerName) throws Exception {
    	if (Util.isStringEmpty(tradingPartnerName)) {
    		throw new ValidationException("Unknown EDI trading partner name (" + tradingPartnerName + ")."); 
    	}

		Query sqlQuery = new Query(SQL_EDI_RECS + " AND UPPER([NAME]) = UPPER(?)");
		sqlQuery.addParmValue(tradingPartnerName);
		
		return getRecord(DBConnectionFactory.DBType.SQL_SERVER_DB, EDI.class, sqlQuery).getRecord();		
	}		
}