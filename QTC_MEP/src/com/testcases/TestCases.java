package com.testcases;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Types;
import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.modules.Modules;


public class TestCases extends Modules
{
	//Browser start
	@BeforeTest
	public static void Start()
	{
	try{
		
		
		/*PreparedStatement ps = null;
		String userName = "Preludesys_Sql";
		String password = "Prel2018@#";*/

		//String url = "jdbc:sqlserver://QTCIIS\\SQLSERVER14;databaseName=QA_MEP_V1.1";
        /*String Url = "jdbc:sqlserver://QTCIIS\\SQLSERVER14;DatabaseName=QA_MEP_V1.1;user=Preludesys_Sql;Password=Prel2018@#";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connection = DriverManager.getConnection(Url);
		 System.out.println("Connection Established Successfull and the DATABASE NAME IS:"
                 + connection.getMetaData().getDatabaseProductName());
		 for(int i=0;i<2;i++) {
		 CallableStatement statement = connection.prepareCall("{call [dbo].[DELETE_EXAM](?)}");
		 statement.setInt(1, 123);
	        
         int n =  statement.executeUpdate();
         
         if(n==0)
         {
        	 System.out.println("Data deleted Succesfully");
        	 Thread.sleep(10000);
         }
         else
         {
        	 System.out.println("Data not deleted");
         }
		 }
     */
        
         /*ResultSetMetaData metadata = rs.getMetaData();
         int columnCount = metadata.getColumnCount();
         for (int i=1; i<=columnCount; i++) 
         {
             String columnName = metadata.getColumnName(i);
             System.out.println(columnName);
         }*/
        // statement.close();
		 
		 
		 
		// ps=connection.prepareStatement("dbo.DELETE_EXAM @examid=123;");
		 
		 
		// ResultSet rs = ps.executeQuery();
		 //ResultSetMetaData rsmd = rs.getMetaData();
		// int columnsNumber = rsmd.getColumnCount();
		/* while (rs.next()) {
			    for (int i = 1; i <= columnsNumber; i++) {
			        if (i > 1) System.out.print(",  ");
			        String columnValue = rs.getString(i);
			        System.out.print(columnValue + " " + rsmd.getColumnName(i));
			    }
			    System.out.println("");
			}*/
		   /* if (rs.()) {

		        ResultSetMetaData metaData = rs.getMetaData();
		       // int numberOfColumns = metaData.getColumnCount();
		        System.out.println("Database Records Listing");

		        //for (int i = 1; i <= numberOfColumns; i++) {
		           // System.out.print(metaData.getColumnLabel(i) + "\t");
		       // }
		        metaData.getColumnLabel(1);
		        System.out.println();

		      // do {
		       //     for (int i = 1; i <= numberOfColumns; i++) {
		            //    System.out.print(rs.getObject(i) + "\t");
		            //}
		           // System.out.println();
		       // } while (rs.next());
		        rs.getObject(1);
		        System.out.println();

		    }*/
		 //System.out.println("Result"+rs.)

		//Connection conn = DriverManager.getConnection(url, userName, password);
		 //Statement stmt=conn.createStatement();
		// ps = conn.prepareStatement("select * from [MEPPortal].[CaseManagementExamXMLData] where ExamID=123");
		
		 //ResultSet rs = ps.executeQuery();
			/*Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection con=DriverManager.getConnection("jdbc:sqlserver:QTCIIS\\SQLSERVER14;database=QA_MEP_V1.1;IntegratedSecurity=true;");*/

		
		//ResultSet rs =stmt.executeQuery("select * from [MEPPortal].[CaseManagementExamXMLData] where ExamID=123");
		//System.out.println(rs.rowDeleted());
	      
		//conn.close();		
	
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
/*		public static void getDbConnection() {
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				connObj = DriverManager.getConnection(JDBC_URL);
				if(connObj != null) {
					DatabaseMetaData metaObj = (DatabaseMetaData) connObj.getMetaData();
					System.out.println("Driver Name?= " + metaObj.getDriverName() + ", Driver Version?= " + metaObj.getDriverVersion() + ", Product Name?= " + metaObj.getDatabaseProductName() + ", Product Version?= " + metaObj.getDatabaseProductVersion());
				}
			} catch(Exception sqlException) {
				sqlException.printStackTrace();
			}
		}*/

		openBrowser("Firefox", "http://qtciis.preludesys.com:8081/Home/ExamAsync?u0irSCeOUkLHDJrosOsB+weFjVSo+R6sPR5IhPDBt54JejKU6/Tt48M7yDb4CVmLNBCRiLMwwWWJdl3j83THl86R7qIfCUKjQVSR0lzB1X1Bp824uNZ1d/XTTDUdrwcC8ze7FkyItFVTAnnDGM+O1kyjFlQkrXLwA8Cpsm0pmWfUo940py6/y/zpaPas1XgLDPHIBylCdKUWOehvxyEid9e7EQYH6x2/lDg3ShpYt2Y=");
				
	}
	
    //EXAMINEE
	@Test(priority = 0)
	public static void examineeTc()
	{
		testRow(32,1);
	    examineeSaveForm();
	 	assert true;	 	
	}	
	
   @Test(priority = 1)
	public static void navigateToExamineeFormTabsTc()
	{
		testRow(32,1);
		navigateToExamineeFormTabs();
	 	assert true;	
	 	
	}
	@Test(priority = 2)
	public static void ExamineeHeaderSectionTc()
	{
		testRow(2,1);
		ExamineeHeaderSection();
	 	assert true;	
	 	
	}
	
	@Test(priority = 3)
	public static void ExamineeButtonsTc()
	{
		testRow(2,1);
		ExamineeButtons();
	 	assert true;	
	 	
	}
	
	//DEC 
   @Test(priority = 4)
	public static void decAddDBQTc()
	{
		dr.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		dr.get("http://qtciis.preludesys.com:8081/Home/ExamAsync?u0irSCeOUkLHDJrosOsB+weFjVSo+R6sPR5IhPDBt54JejKU6/Tt48M7yDb4CVmLNBCRiLMwwWWJdl3j83THl4PdqxQfodnU6fgXQXzNLOAIiVMAEL136XUCVL9eFek3rnVzcL++sgPdhyg012vW9VYuL3AtdlAr+u0jfVpS8Ps/Odct1ojeQE4RZ1HAagvY4V/bDmDRz+5/6kG6qi/Vhg==");
		testRow(35,1);
		addTriggerDBQDec();
	 	assert true;	 	
	}	
   
    @Test(priority = 5)
	public static void decExamNoteTc()
	{
		testRow(38,1);
		decExamNote();
	 	assert true;	
	}
	
	@Test(priority = 6)
	public static void decNavigateFormAndSectionTc()
	{
		
		decNavigateFormAndSection();
	 	assert true;	
	}
	
	@Test(priority = 7)
	public static void decSaveAddFormTc()
	{
		testRow(41,1);
		decSaveAddForm();
	 	assert true;	
	}
	
	@Test(priority = 8)
	public static void decDeleteAddFormsTc()
	{
		decDeleteAddForms();
	 	assert true;	
	}
	@Test(priority = 9)
	public static void decHeaderSectionTc()
	{
		testRow(2,1);
		decHeaderSection();
	 	assert true;	
	}

	@Test(priority = 10)
	public static void decRoleButtonsTc()
	{
		decRoleButtons();
	 	assert true;	
	 
	}

    //PROVIDER
    @Test(priority = 11)
	public static void ProviderFormSaveTc()
	{
    	dr.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		dr.get("http://qtciis.preludesys.com:8081/Home/ExamAsync?u0irSCeOUkLHDJrosOsB+weFjVSo+R6sPR5IhPDBt54JejKU6/Tt48M7yDb4CVmLNBCRiLMwwWWJdl3j83THlyZF0k4wXy0TNZPrsK5HYpKxlwu6c6ox5RgYK+QWF2zV2WAJEea+ShZsZibzWyAEXqfxh0n2Bxg+IhYkKjMF6d0NJyQhM1qdTTQMC8sXBsz7JwNmm80ORqoLi8sFU5oNfQrdzhoJ0QfS/gdtqZ2LBaE=");
		testRow(5,1);
		saveExamData();
	 	assert true;
	 	
	}
    
   @Test(priority = 12)
	public static void ImoFormSaveTc()
	{
		testRow(8,1);
		ImoFormSave();
	 	assert true;	
	}
	
	@Test(priority = 13)
		public static void ManualAddDBQTc()
	{
		testRow(11,1);
		manualAddDbq();
	 	assert true;	
	}
	
	@Test(priority = 14)
	public static void HeaderSectionTc()
	{
		testRow(2,1);
		headerSection();
	 	assert true;	
	}
	
    @Test(priority = 15)
	public static void NavigateToFormTabsTc()
	{
		navigateToFormTabs();
	 	assert true;	
	}
    
	@Test(priority = 16)
	public static void ExamNotesTc()
	{
		
		testRow(14,1);
		examNote();
	 	assert true;
	 	
	}
	
	@Test(priority = 17)
	public static void ESignatureTc()
	{
		testRow(17,1);
		esignature();
	 	assert true;	
	 	
	}
	
	@Test(priority = 18)
	public static void ExambuttonsTc()
	{
		testRow(14,1);
		examButtons();
	 	assert true;	
	 	
	}
	
   //SCRIBE ROLE
   @Test(priority = 19)
	public static void scribeAddDBQTc()
	{
		dr.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		dr.get("http://qtciis.preludesys.com:8081/Home/ExamAsync?u0irSCeOUkLHDJrosOsB+weFjVSo+R6sPR5IhPDBt54JejKU6/Tt48M7yDb4CVmLNBCRiLMwwWWJdl3j83THlz6XP3CLpXPwIQK+KXyjPZdLypHfDiH9IvcLqKq4Jdg3qumIredDavcu953rDFP1w3fmJ5eswrlHrIroNZF5pF4tbAPEWwUy4WcIfraFWjlhMMKlYNN9nSHQr205I+SEeA==");
		testRow(20,1);
		addTriggerDBQWithValidationScribe();
	 	assert true;	 	
	}	
   
    @Test(priority = 20)
	public static void scribeExamNoteTc()
	{
		testRow(23,1);
		scribeExamNote();
	 	assert true;	
	 	
	}
	
	@Test(priority = 21)
	public static void scribeCollabViewTc()
	{
		testRow(23,1);
		scribeCollabView();
	 	assert true;	
	 	
	}
	
	@Test(priority = 22)
	public static void scribeNavigateFormAndSectionTc()
	{
		testRow(23,1);
		scribeNavigateFormAndSection();
	 	assert true;	
	 	
	}
   
	@Test(priority = 23)
	public static void scribeHeaderSectionTc()
	{
		testRow(2,1);
		scribeHeaderSection();
	 	assert true;	
	 	
	}
	
	@Test(priority = 24)
	public static void scribeRoleButtonsTc()
	{
		testRow(23,1);
		scribeRoleButtons();
	 	assert true;	
	 	
	}
	
	//QA ROLE
    @Test(priority = 25)
	public static void addTriggerwithValidationTc()
	{
		
		dr.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		dr.get("http://qtciis.preludesys.com:8081/Home/ExamAsync?u0irSCeOUkLHDJrosOsB+weFjVSo+R6sPR5IhPDBt54JejKU6/Tt48M7yDb4CVmLNBCRiLMwwWWJdl3j83THl8BNOsYCkUtQSC9YmQgNPD/Qo0Xa42hbOtzNUvC3NxcyzJ8NotEadclr0gKJcdhd/PtFCSKJgsda0xPI7ghO/TVS0DZf3CbsiAGgjXqagUbSRQm89PwgklAfzfLdIq2CSw==");
		testRow(26,1);
		addTriggerwithValidationQA();
	 	assert true;	 	
	}
	
	@Test(priority = 26)
	public static void qaExamNotesTc()
	{
		testRow(29,1);
		qaExamNotes();
	 	assert true;	 	
	}
	
	@Test(priority = 27)
	public static void qaCollabViewTc()
	{
		//testRow(20,1);
		qaCollabView();
	 	assert true;	 	 
	}
	
	@Test(priority = 28)
	public static void qaNavigateFormAndSectionTc()
	{
		//testRow(20,1);
		qaNavigateFormAndSection();
	 	assert true;	 	
	}
	
	@Test(priority = 29)
	public static void qaHeaderSectionTc()
	{	
		testRow(2,1);
		qaHeaderSection();
	 	assert true;	 	
	}
	
	@Test(priority = 30)
	public static void qaRoleButtonsTc()
	{
		testRow(29,1);
		qaRoleButtons();
	 	assert true;	 	
	}
  
   @Test(priority = 31)
	public static void ProviderClarifyQuestionTc()
	{
		dr.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		dr.get("http://qtciis.preludesys.com:8081/Home/ExamAsync?u0irSCeOUkLHDJrosOsB+weFjVSo+R6sPR5IhPDBt54JejKU6/Tt48M7yDb4CVmLNBCRiLMwwWWJdl3j83THlyZF0k4wXy0TNZPrsK5HYpKxlwu6c6ox5RgYK+QWF2zV2WAJEea+ShZsZibzWyAEXqfxh0n2Bxg+IhYkKjMF6d0NJyQhM1qdTTQMC8sXBsz7JwNmm80ORqoLi8sFU5oNfQrdzhoJ0QfS/gdtqZ2LBaE=");
		testRow(5,1);
		ProviderClarifyQuestion();
	 	assert true;	 	
	}
	
}