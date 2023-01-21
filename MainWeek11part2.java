import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Formatter;
/**
* Program used to perform updates to spiderman table
* there is a class DBConnection that handles the calls  
* <p>
* this class will also print out what is in the table if desired. 
*
* @param  none
* @return      nothing
* @see         console output and write to a local file
*/
public class MainWeek11part2 {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		
DBConnection connectTest = new DBConnection();

/*
String query2=
"insert into comics.spiderman(name,issueNum,issueDate,issueName,issueValue,mintCond)"
//+ "values('Amazing SM',400, '4/1/95','A Death In The Family',5.00, 'Yes')";
//+ "values('Spectacular SM', 37,'12/1/79','Into The Hive',6.00, 'No')";
//+ "values('Amazing SM', 194, '7/1/79','Never Let The Black Cat Cross Your Path',10.00,'No')";
  + "values('Web Of SM', 125, '6/1/95','Searching',4.00,'Yes')";

connectTest.Create_stmt(query2);
*/

//first query for incorrect data entry

/*String query4=
 "update comics.spiderman SET issueDate='12/1/79' where issueDate='7/1/79' and name like 'Spectacular%' and issueValue = 6.0"
 ; connectTest.Create_stmt(query4);
*/



//first query for incorrect data entry
//Amazing SM 89 10/1/70 Doc Ock Lives 6.5 No

/*update issue value
 String query4=
 "update comics.spiderman SET issueValue=7.0 where name='Amazing SM' and issueName like 'Doc%' and issueNum = 89"
 ; connectTest.Create_stmt(query4);
 */

 //Change the Issue Value of Comic Name Spectacular SM that has Issue Number 92 to $5.00.
//Spectacular SM 92 7/1/84 What is the Answer 4.5 No
/* 
String query4=
  "update comics.spiderman SET issueValue=5.0 where name='Spectacular SM' and issueName like 'What is%' and issueNum = 92"
  ; connectTest.Create_stmt(query4);
 */

//Change the Issue Name of
//Comic Name Spectacular SM that has Issue Number 92 to What Is The Answer? (put in
//the Question Mark).
//		Spectacular SM 92 7/1/84 What is the Answer 5.0 No

/*
 String query4=
 "update comics.spiderman SET issueName='What is the Answer?' where name='Spectacular SM' and issueName like 'What is%' and issueNum = 92"
 ; connectTest.Create_stmt(query4);
 */

//o delete Comic Name Amazing SM with Issue
//Number 382
//Amazing SM 382 10/1/93 Emerald Rage 4.0 Yes
			/*String query4=
						 "delete from comics.spiderman where  name='Spectacular SM' and issueName like 'Emerald%' and issueNum = 382"
						 ; connectTest.Create_stmt(query4);		
						 */
//						 Add a record at the bottom of the table for Comic Name Amazing SM with your name in
//						 the Issue Name field, 0 as the Issue Number, and an Issue Value of $5.00. Use today=s
//						 date as the Issue Date and you are in Mint Condition
			/*
			 String query4=
			 "insert into comics.spiderman(name,issueNum,issueDate,issueName,issueValue,mintCond)"
			 + "values('Amazing SM',0, '3/28/22','Nancy is Awesome',5.00,'Yes')";
			 connectTest.Create_stmt(query4);
		*/
//delete insert me
			 /*String query4=
			 "insert into comics.spiderman(name,issueNum,issueDate,issueName,issueValue,mintCond)"
			 + "values('Amazing SM',0, '3/28/22','Nancy is Awesome',5.00,'Yes')";
			 connectTest.Create_stmt(query4);
			*/
						 
	//this query creates the schema comic and is the first to run
    //String query1="CREATE SCHEMA comics"; connectTest.Create_stmt(query1);
 
	//this query creates the spiderman table 
	/*String query1="CREATE TABLE comics.spiderman(name varchar(40)," +
	"issueNum int NOT NULL, " + "issueDate varchar(12)," +
    "issueName varchar(40)," + "issueValue double NOT NULL," +
    "mintCond varchar(3))" ; connectTest.Create_stmt(query1);
 */

/*  this query inserts and item into the table, i ran this multiple times.
 * it would be beneficial to have the ouput file created be read back in as input
  */
/*
 String query2=
 "insert into comics.spiderman(name,issueNum,issueDate,issueName,issueValue,mintCond)"
 + "values('Web of SM',125, '6/1/95','Searching',4.00,'Yes')";
 connectTest.Create_stmt(query2)
 ;
 */

//this query will show what is in the table
 // (use column headings, field widths to line
//		 up fields, ex. money on the right, etc.)
String query3= "select * from comics.spiderman"; connectTest.Result_set(query3);

 //creates an output file so you can see whats on the table
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
	 ResultSetMetaData meta = connectTest.rs.getMetaData();

     String name1 = meta.getColumnName(1);
     String issueNum2 = meta.getColumnName(2);
     String issueDate3 = meta.getColumnName(3);
     String issueName4 = meta.getColumnName(4);
     String issueValue5 = meta.getColumnName(5);
     String mintCond6 = meta.getColumnName(6);
     Formatter fmt1 = new Formatter();
     fmt1.format("%-21s %-12s %-12s %-37s %-10s %-10s%n", name1, issueNum2,issueDate3,issueName4,issueValue5,mintCond6);
     System.out.println(fmt1);

  
						   				  
	
 
while(connectTest.rs.next())
{
	

 
	/*
	 * System.out.println(connectTest.rs.getString(1) + "t" +
	 * connectTest.rs.getInt(2)+ " t"+connectTest.rs.getString(3) +
	 * "t"+connectTest.rs.getString(4)+ "t"+connectTest.rs.getDouble(5)+
	 * "t"+connectTest.rs.getString(6)); newvar = connectTest.rs.getString(1) + " "
	 * + connectTest.rs.getInt(2)+ " "+connectTest.rs.getString(3) +
	 * " "+connectTest.rs.getString(4)+ " "+connectTest.rs.getDouble(5)+
	 * " "+connectTest.rs.getString(6);
	 */
	 
 //System.out.println("this is the newvar: " + newvar + "after");
	fw.write(newvar + System.getProperty( "line.separator" ));
	
	/*
	 * System.out.printf( "%-30s",connectTest.rs.getString(1).toString());
	 * System.out.printf("\t"); System.out.printf( "%3d",connectTest.rs.getInt(2));
	 * System.out.printf("\t");
	 * System.out.printf("%-10s",connectTest.rs.getString(3).toString());
	 * System.out.printf("\t"); System.out.printf(
	 * "%-20s",connectTest.rs.getString(4).toString());
	 * System.out.printf("%.2f",connectTest.rs.getDouble(5)); System.out.printf(
	 * "%-30s",connectTest.rs.getString(6).toString()); System.out.printf( "%n");
	 */
	//System.out.printf("%s\t\t\t%s\t\t\t%s\t%n",connectTest.rs.getString(1),connectTest.rs.getString(3),connectTest.rs.getString(4));
	
	  String fmt="%-30s%-30s%-30s%n";
	  
	  
	
	//  System.out.printf("%4s  %-12s   %-12s   %-21s%n", "node", "node Ip", "Type", "subType");
	int width = 30;
	char fill = '0';
	/*
	 * String toPad = connectTest.rs.getString(1); String padded1 = new String(new
	 * char[width - toPad.length()]).replace('\0', fill) + toPad; toPad =
	 * connectTest.rs.getString(3); String padded2 = new String(new char[width -
	 * toPad.length()]).replace('\0', fill) + toPad; toPad =
	 * connectTest.rs.getString(4); String padded3 = new String(new char[width -
	 * toPad.length()]).replace('\0', fill) + toPad;
	 */
	/*
	 * System.out.println(connectTest.rs.getString(1).length() + "length is");
	 * System.out.println(connectTest.rs.getString(3).length() + "length is");
	 * System.out.println(connectTest.rs.getString(4).length() + "length is");
	 */
	
	/*
	 * System.out.println(connectTest.rs.getString(1)+ " "+connectTest.rs.getInt(2)+
	 * " "+connectTest.rs.getString(3) +" "+connectTest.rs.getString(4) +
	 * " "+connectTest.rs.getString(5) +" "+connectTest.rs.getString(6) );
	 */
	
	  SpidermanRecord rec = new SpidermanRecord();
	  rec.setName(connectTest.rs.getString(1));
	  rec.setIssueNum(connectTest.rs.getInt(2));
	  rec.setIssueDate(connectTest.rs.getString(3));
	  rec.setIssueName(connectTest.rs.getString(4));
	  rec.setIssueValue(connectTest.rs.getDouble(5));
	  rec.setMintCond(connectTest.rs.getString(6));
	  System.out.format("%-30s %-3d %-12s %-40s %7.2f %-10s%n",rec.getName(),
			  rec.getIssueNum(),rec.getIssueDate(),rec.getIssueName(),rec.getIssueValue(),rec.getMintCond());
	  
	  
	 
	/*
	 * System.out.println(padded1.length() + "length is");
	 * System.out.println(padded2.length() + "length is");
	 * System.out.println(padded3.length() + "length is");
	 */
	/*
	 * System.out.printf("%-30s  %-30s   %-30s%n", padded1, padded2,padded3);
	 * padded1 = ""; padded2 = ""; padded3 = "";
	 */
	
//	   System.out.printf(rec.toString());
//	    		 
	
//	    System.out.printf("%-20s  %-20s   %-20s%n", connectTest.rs.getString(1).trim(),
//	    		connectTest.rs.getString(3).trim(),connectTest.rs.getString(4).trim()); 
	    newvar = connectTest.rs.getString(1) + " "
	    		  + connectTest.rs.getInt(2)+ " "+connectTest.rs.getString(3) +
	    		   " "+connectTest.rs.getString(4)+ " "+connectTest.rs.getDouble(5)+
	    		  " "+connectTest.rs.getString(6);
	 
	}
	
		newvar = "";
	 
}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	

/*ResultSetMetaData metaData = connectTest.rs.getMetaData();
int columnCount = metaData.getColumnCount();

while(connectTest.rs.next()) {
    for(int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
        Object object = connectTest.rs.getObject(columnIndex);
        System.out.printf("%-30s, ", object == null ? "NULL" : object.toString());
    }
    System.out.printf("%n");*/
 

fw.close();
}
	public static String padString(String str, int leng) {
	    for (int i = str.length(); i <= leng; i++)
	        str += " ";
	    return str;
	}
	
	
}
 
	 





