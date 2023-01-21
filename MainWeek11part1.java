import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
/**
* Program used to create schema and a table for comics
* there is a class DBConnection that handles the calls  
* <p>
* this class will also print out what is in the table if desired. 
*
* @param  none
* @return      nothing
* @see         console output and write to a local file
*/
public class MainWeek11part1 {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		
DBConnection connectTest = new DBConnection();
//  this query will show what is in the table
 // String query3= "select * from comics.spiderman"; connectTest.Result_set(query3);
 
  //this query creates the schema comic and is the first to run
  //String query1="CREATE SCHEMA comics"; connectTest.Create_stmt(query1);

  //this query creates the spiderman table 
 /*String query1="CREATE TABLE comics.spiderman(name varchar(40)," +
 "issueNum int NOT NULL, " + "issueDate varchar(12)," +
 "issueName varchar(40)," + "issueValue double NOT NULL," +
 "mintCond varchar(3))" ; 
 connectTest.Create_stmt(query1);
 */
 
//this query inserts and item into the table, i ran this multiple times.
 //it would be beneficial to have the ouput file created be read back in as input
 //String query2=
 //"insert into comics.spiderman(name,issueNum,issueDate,issueName,issueValue,mintCond)"
 //+ "values('Amazing SM',89, '10/1/70','Doc Ock Lives',6.50, 'No')";
 //+ "values('Spectacular SM', 92,'7/1/84','What is the answer',4.50, 'No')";
 //+ "values('Web Of SM', 35, '2/1/88','You Can Go Home Again',4.00,'No')";
 //+ "values('Amazing SM', 382, '10/1/93','Emerald Rage',4.00,'Yes')";
 
	//connectTest.Create_stmt(query2);
 
 //creates an output file so you can see whats on the table
String query3= "select * from comics.spiderman"; connectTest.Result_set(query3); 
String filename = "C:\\Users\\flamn\\eclipse-workspace\\Spiderman\\output.txt";
String newvar = ""; 
FileWriter fw = null;
try {
	fw = new FileWriter(filename);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//go through the resultset
try {
while(connectTest.rs.next())
{
 
	System.out.println(connectTest.rs.getString(1) + " " + connectTest.rs.getInt(2)+ " "+connectTest.rs.getString(3)
	+ " "+connectTest.rs.getString(4)+ " "+connectTest.rs.getDouble(5)+ " "+connectTest.rs.getString(6));
	newvar = connectTest.rs.getString(1) + " " + connectTest.rs.getInt(2)+ " "+connectTest.rs.getString(3)
	+ " "+connectTest.rs.getString(4)+ " "+connectTest.rs.getDouble(5)+ " "+connectTest.rs.getString(6);
		System.out.println("this is the newvar: " + newvar + "after");
		fw.write(newvar + System.getProperty( "line.separator" ));
		newvar = "";
	}

	
	
}  catch (IOException e) { // TODO Auto-generated catch block
	  e.printStackTrace(); } fw.close(); 
	  }
}



	

/*
  String query4=
  "update ballers SET pos='DH' where pos='1B' and name like 'Remi%'";
  connectTest.Create_stmt(query4);
	}
}*/



