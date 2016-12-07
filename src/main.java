
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

	public static void main(String[] args) {

		  Connection connect = null;
		  Statement statement = null;
		  ResultSet resultSet = null;
		  
		  try{
			  
			  Class.forName("com.mysql.jdbc.Driver");
		      //connect = DriverManager.getConnection("jdbc:mysql://localhost/javaproject?user=root&password=");
			  connect = DriverManager.getConnection("jdbc:mysql://mahtlemcen.org/mahtlemc_java?user=mahtlemc_java&password=^HN8ZwIHnT,r");
		      statement = connect.createStatement();
		      
		      //Write
		      connect.prepareStatement("insert into user(username,password) values('me2','0000')").executeUpdate();
		      
		      //Read
		      resultSet = statement.executeQuery("select * from user");
		      while(resultSet.next()){
		    	  String username = resultSet.getString("username");
		    	  String password = resultSet.getString("password");
		    	  System.out.println("Username: "+ username + " Password: " + password);
		      }
			  
		  }catch(Exception e){
			  e.printStackTrace();
		  }
		  
	}

}
