package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class Dao implements IdbUtil,AutoCloseable{
	private Connection connection;
	
	public Dao() throws SQLException
	{
		connection=IdbUtil.getConnection();
		}
	


	public void insertBugs(Bugs s) throws SQLException {
		String sql = "INSERT INTO bugs (title,description,status,assigned_to,created) VALUES(?,?,?,?,now())";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, s.getTitle());
			stmt.setString(2, s.getDescription());
			stmt.setString(3, s.getStatus());
			stmt.setInt(4, s.getAssigned_to());
			
			stmt.executeUpdate();
			System.out.println("inserted bugs successfully ");
		}
	}
	
	public List<Members> getAllMembers() throws SQLException {
		String sql = "SELECT * FROM members;";
		List<Members> slist = null;
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			slist = new ArrayList<Members>();
			while (rs.next()) {
				Members obj = new Members();
				obj.setId((rs.getInt(1)));
				obj.setName((rs.getString(2)));
				obj.setDesignation((rs.getString(3)));
				slist.add(obj);
				
			}
		}
		
		System.out.println("Bugs loaded successfully");
		return slist;
	}
	
	

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		if(connection!=null)
		{
			connection.close();
		}
		
	}
	
}