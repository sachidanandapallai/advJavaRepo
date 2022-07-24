import java.sql.*;
class ConnTest
{
	public static void main(String[] args) throws Exception 
	{
	//Activate oracle thin driver registering jdbc driver
	//class object with DriverManager service
	//create jdbc driver class object 
	oracle.jdbc.driver.OracleDriver driver= new oracle.jdbc.driver.OracleDriver();
	//register with driverManager Service
	DriverManager.registerDriver(driver);
	//establish the connection with oracle DB s/w
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","manager");

	if(con==null)
		System.out.println("connection is not established");
	else 
		System.out.println("connection is established");
	}
}
