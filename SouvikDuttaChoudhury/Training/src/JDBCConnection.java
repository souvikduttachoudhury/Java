import java.sql.*;
public class JDBCConnection {
	public static void main(String args[]){
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.106.20.63:1521:dexter","training5","training5");
	    PreparedStatement ps=con.prepareStatement("Select * from product_souvik");
	    ResultSet rs=ps.executeQuery();
	    while(rs.next()){
	    	System.out.print(rs.getString(1)+"  ");
	    	System.out.print(rs.getString(2)+"  ");
	    	System.out.print(rs.getString(3)+"  ");
	    	System.out.println();
	    }
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
