package org.tnsif.repository;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.tnsif.entities.Student;

public interface StudentRepo1 {
	/*The Statement object used for executing a static 
	 * SQL statementand returning the results it produces. 
	 */
	CallableStatement makeStatement();
	PreparedStatement createPrepareStatement(String query);
	public int addQuery(String query,Student student);
	public int updateQuery(String query,Student student);
	public int deleteQuery(String query);
	public ResultSet retrieveQuery(String query);


	

}