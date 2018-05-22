package dataBase.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sqliteJdbc 
{

	/***
	 *  NIU
	 *  sqliteJdbc() constructor
	 */
	public sqliteJdbc()  { 	} //constructor	
	
	
	
	/****
	 * create table
	 */
	public void fnCreateDataBase()
	{
		Connection c = null;
	      
	    try 
	    {
	    	Class.forName("org.sqlite.JDBC");
	        c = DriverManager.getConnection("jdbc:sqlite:test.db");
	    } 
	    catch ( Exception e ) 
	    {
	    	System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
	    }
	    
	    System.out.println("Opened database successfully");
	}
	

	
	/***
	 * fnCreateTable()
	 */
	public void fnCreateTable()
	{
	      Connection c = null;
	      Statement stmt = null;
	      
	      try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:test.db");
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         String sql = "CREATE TABLE COMPANY " +
	                        "(ID INT PRIMARY KEY     NOT NULL," +
	                        " NAME           TEXT    NOT NULL, " + 
	                        " AGE            INT     NOT NULL, " + 
	                        " ADDRESS        CHAR(50), " + 
	                        " SALARY         REAL)"; 
	         stmt.executeUpdate(sql);
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	   //     System.exit(0);
	      }
	      System.out.println("Table created successfully");
	}
	
	
	
	/****
	 * fnTableInsertRecords()
	 */
	public void fnTableInsertRecords()
	{
	      Connection c = null;
	      Statement stmt = null;
	      
	      try 
	      {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:test.db");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
	                        "VALUES (1, 'Paul', 32, 'California', 20000.00 );"; 
	         stmt.executeUpdate(sql);

	         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
	                  "VALUES (2, 'Allen', 25, 'Texas', 15000.00 );"; 
	         stmt.executeUpdate(sql);

	         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
	                  "VALUES (3, 'Teddy', 23, 'Norway', 20000.00 );"; 
	         stmt.executeUpdate(sql);

	         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
	                  "VALUES (4, 'Mark', 25, 'Rich-Mond ', 65000.00 );"; 
	         
	         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
	                  "VALUES (5, 'ron', 45, 'Mondy ', 5000.00 );"; 
	         
	         stmt.executeUpdate(sql);

	         stmt.close();
	         c.commit();
	         c.close();
	         
	      } 
	      catch ( Exception e ) 
	      {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         //System.exit(0);
	      }
	      System.out.println("Records created successfully");
	}
	
	
	
	/****
	 * fnSelectFromDatabase()
	 */
	public void fnSelectFromDatabase()
	{
		  Connection c = null;
		   Statement stmt = null;
		   try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:test.db");
		      c.setAutoCommit(false);
		      System.out.println("Opened database successfully");

		      stmt = c.createStatement();
		      ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
		      
		      while ( rs.next() ) {
		         int id = rs.getInt("id");
		         String  name = rs.getString("name");
		         int age  = rs.getInt("age");
		         String  address = rs.getString("address");
		         float salary = rs.getFloat("salary");
		         
		         System.out.println( "ID = " + id );
		         System.out.println( "NAME = " + name );
		         System.out.println( "AGE = " + age );
		         System.out.println( "ADDRESS = " + address );
		         System.out.println( "SALARY = " + salary );
		         System.out.println();
		      }
		      rs.close();
		      stmt.close();
		      c.close();
		   } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		   }
		   System.out.println("Operation done successfully");
	}
	
	
	
	/****
	 * fnUdateDataBaseRecord()
	 */
	public void fnUdateDataBaseRecord()
	{
		Connection c = null;
		   Statement stmt = null;
		   
		   try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:test.db");
		      c.setAutoCommit(false);
		      System.out.println("Opened database successfully");

		      stmt = c.createStatement();
		      String sql = "UPDATE COMPANY set SALARY = 25000.00 where ID=1;";
		      stmt.executeUpdate(sql);
		      c.commit();

		      ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
		      
		      while ( rs.next() ) {
		         int id = rs.getInt("id");
		         String  name = rs.getString("name");
		         int age  = rs.getInt("age");
		         String  address = rs.getString("address");
		         float salary = rs.getFloat("salary");
		         
		         System.out.println( "ID = " + id );
		         System.out.println( "NAME = " + name );
		         System.out.println( "AGE = " + age );
		         System.out.println( "ADDRESS = " + address );
		         System.out.println( "SALARY = " + salary );
		         System.out.println();
		      }
		      rs.close();
		      stmt.close();
		      c.close();
		   } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		   }
		    System.out.println("Operation done successfully");
	}
	
	
	
	/****
	 * fnEraseDataBaseRecord()
	 */
	public void fnEraseDataBaseRecord()
	{
	      Connection c = null;
	      Statement stmt = null;
	      
	      try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:test.db");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         String sql = "DELETE from COMPANY where ID=2;";
	         stmt.executeUpdate(sql);
	         c.commit();

	         ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
	         
	         while ( rs.next() ) {
	         int id = rs.getInt("id");
	         String  name = rs.getString("name");
	         int age  = rs.getInt("age");
	         String  address = rs.getString("address");
	         float salary = rs.getFloat("salary");
	         
	         System.out.println( "ID = " + id );
	         System.out.println( "NAME = " + name );
	         System.out.println( "AGE = " + age );
	         System.out.println( "ADDRESS = " + address );
	         System.out.println( "SALARY = " + salary );
	         System.out.println();
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
	}
	
	
	
	/****
	 * fnEraseDataBaseALLRecords()
	 */
	public void fnEraseDataBaseALLRecords()
	{
	      Connection c = null;
	      Statement stmt = null;
	      
	      try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:test.db");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         String sql = "DELETE from COMPANY;";
	         stmt.executeUpdate(sql);
	         c.commit();

	         ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
	         
	         while ( rs.next() ) {
	         int id = rs.getInt("id");
	         String  name = rs.getString("name");
	         int age  = rs.getInt("age");
	         String  address = rs.getString("address");
	         float salary = rs.getFloat("salary");
	         
	         System.out.println( "ID = " + id );
	         System.out.println( "NAME = " + name );
	         System.out.println( "AGE = " + age );
	         System.out.println( "ADDRESS = " + address );
	         System.out.println( "SALARY = " + salary );
	         System.out.println();
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
	}
	
	
	
	/****
	 * main()
	 * @param args
	 */
	public static void main (String [] args)
	{
		
		sqliteJdbc sql = new sqliteJdbc();
//		sql.fnCreateDataBase(); // Create DataBase
//		sql.fnCreateTable(); // Create Table
//		sql.fnTableInsertRecords(); // Table Insert Records
		sql.fnSelectFromDatabase(); // Select From Database
//		sql.fnUdateDataBaseRecord(); // Udate DataBase Record (and show change) 
//		sql.fnEraseDataBaseRecord(); // Erase DataBase Record 
//		sql.fnEraseDataBaseALLRecords(); // Erase DataBase ALL Records	
	}
		
}
