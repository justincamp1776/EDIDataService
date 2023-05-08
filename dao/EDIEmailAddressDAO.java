package com.remichel.edi.dao;

import java.util.Set;

import org.springframework.stereotype.Repository;

import com.remichel.core.dao.AbstractDAO;
import com.remichel.core.db.DBConnectionFactory;
import com.remichel.core.db.result.DBResult;
import com.remichel.core.db.util.Query;
import com.remichel.edi.model.EDIEmailAddress;

@Repository
public class EDIEmailAddressDAO extends AbstractDAO {

	private static String SELECT_CUST_EMAIL_BY_SEQNUM = "SELECT * FROM [BranchOps].[dbo].[EDI_EMAIL_ADDRESS] WHERE EDI_SEQNUM = ?";

	private static String SELECT_CUST_EMAIL_BY_SEQNUMS = "SELECT * FROM [BranchOps].[dbo].[EDI_EMAIL_ADDRESS] WHERE EDI_SEQNUM IN (" + Query.Token.REPLACE_TOKEN.getSQLToken() + ")";

	public EDIEmailAddress getEmail(final long seqNum) throws Exception {    
		Query sqlQuery = new Query(SELECT_CUST_EMAIL_BY_SEQNUM);
		sqlQuery.addParmValue(seqNum);
		
		return getRecord(DBConnectionFactory.DBType.SQL_SERVER_DB, EDIEmailAddress.class, sqlQuery).getRecord();
	}	
	
	public DBResult<EDIEmailAddress> getEmail(final Set<Long> seqNums) throws Exception {
		Query sqlQuery = new Query(SELECT_CUST_EMAIL_BY_SEQNUMS);
		
		return getRecords(DBConnectionFactory.DBType.SQL_SERVER_DB, EDIEmailAddress.class, sqlQuery, seqNums);	
	}
}