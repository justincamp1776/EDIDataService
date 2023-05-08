package com.remichel.edi.dao;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import com.remichel.core.dao.AbstractDAO;
import com.remichel.core.db.DBConnectionFactory;
import com.remichel.core.db.util.Query;
import com.remichel.core.exception.ValidationException;
import com.remichel.edi.model.EDIMichaelSons;

@Repository
public class EDIMichaelSonDAO extends AbstractDAO {
	private static final String SELECT_MS_ACCT_DETAIL = " SELECT * "
			+ " From [BranchOps].[dbo].[EDI_MICHAEL_SON_COMPANY_CODES] "
			+ " Where [CompanyCode] = ? ";
	
	
	public EDIMichaelSons getCustomerID(String companyCode) throws Exception {				
        if (StringUtils.isEmpty(companyCode)) {
        	throw new ValidationException("Unable to identify the Company Code.");
        } 
        
    	Query sqlQuery = new Query(SELECT_MS_ACCT_DETAIL);
		sqlQuery.addParmValue(companyCode);   
		            
		return getRecord(DBConnectionFactory.DBType.SQL_SERVER_DB, EDIMichaelSons.class, sqlQuery).getRecord(); 	
	} 
	
}