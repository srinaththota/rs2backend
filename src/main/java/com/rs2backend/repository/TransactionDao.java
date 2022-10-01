package com.rs2backend.repository;



import java.sql.Types;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.rs2backend.entities.TransactionDetails;

@Repository
public class TransactionDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	private final DataSource dataSource;
	
	public TransactionDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }
/*
	public int insertTransactions(int userid , int productid) {
		//return jdbcTemplate.update("insert into TRANSACTION_DETAILS values(?,?,?)", new Object[] {1,userid,productid});
		String query = "insert into TRANSACTION_DETAILS values(?,?)";
		return jdbcTemplate.update(query, userid,productid);
	}
*/
	/*
	public int insertTransactions(int userid , int productid) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		String query = "insert into TRANSACTION_DETAILS values(?,?)";
		return jdbcTemplate.update(connection -> {
	        PreparedStatement ps = connection
	                .prepareStatement(query);
	                ps.setInt(1, userid);
	                ps.setInt(2, productid);
	                return ps;
	              }, keyHolder);
	}
	*/
	public int insertTransactions(int userid , int productid) {
	
		System.out.println("userid is "+userid);
		int[] types = {Types.INTEGER, Types.INTEGER, Types.INTEGER};
		int count = jdbcTemplate.queryForObject("select count(*) from TRANSACTION_DETAILS", Integer.class);
		//return jdbcTemplate.update("insert into TRANSACTION_DETAILS values(?,?,?)", new Object[] {count+1,userid,productid},types);
		return jdbcTemplate.update("insert into TRANSACTION_DETAILS values(?,?,?)",count+1,userid,productid);
		
	}
}
