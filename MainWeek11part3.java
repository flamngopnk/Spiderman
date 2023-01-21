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
public class MainWeek11part3 {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		
DBConnection connectTest = new DBConnection();

//first query for incorrect data entry
/*
  String query4=
  "update comics.spiderman SET issueDate='12/1/79' where issueDate='7/1/79' and name like 'Spectacular%' and issueValue = 6.0"
  ; connectTest.Create_stmt(query4);
  */
 
//first query for incorrect data entry
//Amazing SM 89 10/1/70 Doc Ock Lives 6.5 No

  /*String query4=
  "update comics.spiderman SET issueValue=7.0 where name='Amazing SM' and issueName like 'Doc%' and issueNum = 89"
  ; connectTest.Create_stmt(query4);
 */
//Change the Issue Value of Comic Name Spectacular SM that has Issue Number 92 to $5.00.
//Spectacular SM 92 7/1/84 What is the Answer 4.5 No
/*
 * String query4=
 * "update comics.spiderman SET issueValue=5.0 where name='Spectacular SM' and issueName like 'What is%' and issueNum = 92"
 * ; connectTest.Create_stmt(query4);
 */
//Change the Issue Name of
//Comic Name Spectacular SM that has Issue Number 92 to What Is The Answer? (put in
//the Question Mark).
//		Spectacular SM 92 7/1/84 What is the Answer 5.0 No

/*
 * String query4=
 * "update comics.spiderman SET issueName='What is the Answer?' where name='Spectacular SM' and issueName like 'What is%' and issueNum = 92"
 * ; connectTest.Create_stmt(query4);
 */

//o delete Comic Name Amazing SM with Issue
//Number 382
//Amazing SM 382 10/1/93 Emerald Rage 4.0 Yes
			/*	 String query4=
						 "delete from comics.spiderman where  name='Spectacular SM' and issueName like 'Emerald%' and issueNum = 382"
						 ; connectTest.Create_stmt(query4);		
						 */
//						 Add a record at the bottom of the table for Comic Name Amazing SM with your name in
//						 the Issue Name field, 0 as the Issue Number, and an Issue Value of $5.00. Use today=s
//						 date as the Issue Date and you are in Mint Condition
			/*
			 * String query4=
			 * "insert into comics.spiderman(name,issueNum,issueDate,issueName,issueValue,mintCond)"
			 * + "values('Amazing SM',0, '3/28/22','Nancy is Awesome',5.00,'Yes')";
			 * connectTest.Create_stmt(query4);
			 */
			/*
			 * String query4=
			 * "insert into comics.spiderman(name,issueNum,issueDate,issueName,issueValue,mintCond)"
			 * + "values('Amazing SM',0, '3/28/22','Nancy is Awesome',5.00,'Yes')";
			 * connectTest.Create_stmt(query4);
			 */
						 
/*  this query creates the schema comic and is the first to run
 * String query1="CREATE SCHEMA comics"; connectTest.Create_stmt(query1);
 */
/* this query creates the spiderman table 
 * String query1="CREATE TABLE comics.spiderman(name varchar(40)," +
 * "issueNum int NOT NULL, " + "issueDate varchar(12)," +
 * "issueName varchar(40)," + "issueValue double NOT NULL," +
 * "mintCond varchar(3))" ; connectTest.Create_stmt(query1);
 */

/*  this query inserts and item into the table, i ran this multiple times.
 * it would be beneficial to have the ouput file created be read back in as input
  */
/*
 * String query2=
 * "insert into comics.spiderman(name,issueNum,issueDate,issueName,issueValue,mintCond)"
 */
 
 //connectTest.Create_stmt(query2)
 
 
//this query will show what is in the table
 // (use column headings, field widths to line
//		 up fields, ex. money on the right, etc.)
 
	/*
	 * Create a query to display the Comic Name, Issue Date, Issue Number, and Issue
	 * Value for all comics whose Issue Value is $5.00 or over. Sort the results by
	 * the Issue Value from highest to lowest. Print the labeled results of the
	 * query from your editor.
	 * 
	 */
	/*
	  String query3=
	  "SELECT name, issueDate, issueNum, issueValue from comics.spiderman  where issueValue > 5.0"
	  + " ORDER BY issueValue DESC" ; connectTest.Result_set(query3);
	 */
 
	/*
	 * Create a query to display the Issue Name, Comic Name, Issue Number, and Issue
	 * Date for all Amazing SM with Issue Number before 200. Print the labeled
	 * results of the query from your editor.
	 */


  String query3=
  "SELECT issueName, name, issueNum, issueDate from comics.spiderman  where issueNum > 200 and name = 'Amazing SM'"
  ;   connectTest.Result_set(query3);
  
 
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

		/*  header 2
		 * String name1 = meta.getColumnName(1); String issueDate2 =
		 * meta.getColumnName(2); String issueNum3 = meta.getColumnName(3); String
		 * issueValue4 = meta.getColumnName(4); Formatter fmt1 = new Formatter();
		 * fmt1.format("%-3s %-15s %-10s %-20s%n", name1,
		 * issueDate2,issueNum3,issueValue4); System.out.println(fmt1);
		 */

//headers 3
	 String issueName1 = meta.getColumnName(1);
	    String name2 = meta.getColumnName(2);
	  
	    String issueNum3 = meta.getColumnName(3);
	    String issueDate4 = meta.getColumnName(4);
	    Formatter fmt1 = new Formatter();
	    fmt1.format("%-30s %-15s %-12s %-20s%n", issueName1,name2,issueNum3,issueDate4);
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
	  //query2output
		/*
		 * rec.setName(connectTest.rs.getString(1));
		 * rec.setIssueDate(connectTest.rs.getString(2));
		 * rec.setIssueNum(connectTest.rs.getInt(3));
		 * rec.setIssueValue(connectTest.rs.getDouble(4)); String prtName =
		 * rightPadding(rec.getName(),' ',30).trim();
		 * System.out.format("%-25s%13s%12d %15.2f%n",prtName,rec.getIssueDate().trim(),
		 * rec. getIssueNum(),rec.getIssueValue());
		 */
	  
	  
		  //query3output 
	      rec.setIssueName(connectTest.rs.getString(1));
		  rec.setName(connectTest.rs.getString(2));
		  rec.setIssueNum(connectTest.rs.getInt(3));
		  rec.setIssueDate(connectTest.rs.getString(4)); String prtName =
		  rightPadding(rec.getName(),' ',30).trim();
		  System.out.format("%-30s%-20s%5d%14s%n",rec.getIssueName().trim(),prtName,rec.
		  getIssueNum(),rec.getIssueDate().trim());
		  
		 
	  
	 
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
	/*
	 * newvar = connectTest.rs.getString(1) + " " + connectTest.rs.getInt(2)+
	 * " "+connectTest.rs.getString(3) + " "+connectTest.rs.getString(4)+
	 * " "+connectTest.rs.getDouble(5)+ " "+connectTest.rs.getString(6);
	 */
	 
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
	 public static String rightPadding(String input, char ch, int L)	    {
		  
	        String result
	            = String
	  
	                  // First right pad the string
	                  // with space up to length L
	                  .format("%" + (-L) + "s", input)
	  
	                  // Then replace all the spaces
	                  // with the given character ch
	                  .replace(' ', ch);
	  
	        // Return the resultant string
	        return result;
	    }
	
	
	
}
 
	 





