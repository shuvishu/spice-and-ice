package org.spiceandice.app.dbservice;

import org.spiceandice.app.model.QuickSupport;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBServiceUtilMySql implements DBServiceUtill{
	
	private Connection con;
	private PreparedStatement statement;
	public  DBServiceUtilMySql() {
		DBConnection val = new DBConnection();
		 this.con = val.getConnection();
	}

	@Override
	public boolean saveObject(QuickSupport objectToSave) {
		int flag = 0;
		String insertQuery = "INSERT INTO Booking_Status(name, email, bookingNumber, booking_status, comments) values(?, ?, ?, ?, ?);";
		try {
			statement = con.prepareStatement(insertQuery);
			statement.setString(1, objectToSave.name);
			statement.setString(2, objectToSave.email);
			statement.setString(3, objectToSave.bookingNumber);
			statement.setString(4, objectToSave.status);
			statement.setString(5, objectToSave.comments);
			flag = statement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(flag > 0)
			return true;
		return false;
		
	}

	@Override
	public QuickSupport retreiveObject(String bookingNumber, String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
