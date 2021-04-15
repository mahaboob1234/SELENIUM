package com.keywords;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import javax.security.auth.login.Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.inputdata.InputData;

public class Keywords extends InputData{

	 public static WebDriver dr;
	 public static  WebDriverWait wait ;
	 public static  JavascriptExecutor js ;
	 
	  
	public static String getPath(String key)
	{
		
		
	Properties prop = new Properties();
	try {
		prop.load(new FileInputStream(new File("./OR/DML.properties")));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
	key = prop.getProperty(key);
	return key;
	}
	public static void egyanDatePicker(String date, String month_xpath,String year_xpath,
			String day_xpath) {
		try {
			System.out.println("welcome to datepicker");
			Thread.sleep(2000);
			String day;
			String month;
			String year;
		
			String[] datePick = date.split("-");
			int len=datePick.length;
			System.out.println(len);
			day = datePick[0];
			month = datePick[1];
			year =datePick[2];
			/*System.out.println(day);
			System.out.println(month);
			System.out.println(year);*/
			new Select(dr.findElement(By.xpath(year_xpath))).selectByVisibleText(year);
			Thread.sleep(2000);
			new Select(dr.findElement(By.xpath(month_xpath))).selectByVisibleText(month);
		
			List<WebElement> dayAll = dr.findElements(By.xpath(day_xpath));
			for (WebElement e : dayAll) {
				if (e.getText().trim().equals(day.trim())) {
					e.click();
					return;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void openBrowser(String browserName, String url){
	
		try
		{
			if(browserName.trim().equalsIgnoreCase("Firefox"))
			{
				
				dr = new FirefoxDriver();
				System.out.println("BROWSER OPENED");
				wait = new WebDriverWait(dr,60);
				js = (JavascriptExecutor) dr;
				dr.get(url);
				Thread.sleep(2000);
				dr.manage().window().maximize();
				
				Reporter.log(browserName +" browser is lauched successfully");
			}
			 else if(browserName.trim().equalsIgnoreCase("Chrome"))
			{
				 
				    System.setProperty("webdriver.chrome.driver", "./BrowserDriver/chromedriver.exe");
					ChromeOptions option = new ChromeOptions();
					option.addArguments("disable-infobars");
					dr = new ChromeDriver(option);
					dr.get(url);
					Thread.sleep(2000);
					dr.manage().window().maximize();
					//dr.getCurrentUrl();
					Thread.sleep(5000);

					Reporter.log(browserName + " browser is lauched successfully");
			
			}
			 else if(browserName.trim().equalsIgnoreCase("IE"))
			{
				
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				File file = new File("./BrowserDriver/IEDriverServer.exe");
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
				dr = new InternetExplorerDriver(capabilities);
				dr.get(url);
				Thread.sleep(3000);
				dr.manage().window().maximize();
				Reporter.log(browserName +" browser is lauched successfully");
			}
		}
		catch(Exception e)
		{
			Reporter.log("Browser launching Problem");
			assert false;
		}
	}
	
	
	public static void locatorValue(String locatorType, String values, String textType,String textVal){
		
		
        if(locatorType == "xpath")
        {
        	if(textType.equals("click"))
        		dr.findElement(By.xpath(values)).click();
        	else if(textType.equals("textBox"))
        		dr.findElement(By.xpath(values)).sendKeys(textVal);
        	else if(textType.equals("selectBox"))
        		new Select(dr.findElement(By.xpath(values))).selectByVisibleText(textVal);
        		
        }else if(locatorType == "id")
        {
        	if(textType.equals("click"))
        		dr.findElement(By.xpath(values)).click();
        	else if(textType.equals("text"))
        		dr.findElement(By.xpath(values)).sendKeys("text");
        	else if(textType.equals("selvalue"))
        		new Select(dr.findElement(By.xpath(values))).selectByVisibleText("selvalue");
        }
		else if(locatorType == "name")
		{
			if(textType.equals("click"))
        		dr.findElement(By.xpath(values)).click();
        	else if(textType.equals("text"))
        		dr.findElement(By.xpath(values)).sendKeys("text");
        	else if(textType.equals("selvalue"))
        		new Select(dr.findElement(By.xpath(values))).selectByVisibleText("selvalue");
		}
		else if(locatorType == "css")
		{
			if(textType.equals("click"))
        		dr.findElement(By.xpath(values)).click();
        	else if(textType.equals("text"))
        		dr.findElement(By.xpath(values)).sendKeys("text");
        	else if(textType.equals("selvalue"))
        		new Select(dr.findElement(By.xpath(values))).selectByVisibleText("selvalue");
		}
		else if(locatorType == "linkText")
		{
			if(textType.equals("click"))
        		dr.findElement(By.xpath(values)).click();
        	else if(textType.equals("text"))
        		dr.findElement(By.xpath(values)).sendKeys("text");
        	else if(textType.equals("selvalue"))
        		new Select(dr.findElement(By.xpath(values))).selectByVisibleText("selvalue");
		}
		else if(locatorType == "partialLinkText")
		{
			if(textType.equals("click"))
        		dr.findElement(By.xpath(values)).click();
        	else if(textType.equals("textboxvalue"))
        		dr.findElement(By.xpath(values)).sendKeys("text");
        	else if(textType.equals("selvalue"))
        		new Select(dr.findElement(By.xpath(values))).selectByVisibleText("selvalue");
		}
		
}
	
public static void clickOn(String xpath){
		
	try
	{
		String[] a = xpath.split("#");
		String element = a[0];
		String path = a[1];
		dr.findElement(By.xpath(path)).click();
		Reporter.log("Click on : "+element);
	}
	catch(Exception e)
	{
		Reporter.log("Element is not found");
		assert false;
	}
}	

	
public static void clearOn(String xpath){
	
	
	try
	{
		String[] a = xpath.split("#");
		String element = a[0];
		String path = a[1];
		
		
		dr.findElement(By.xpath(path)).clear();
		Reporter.log("Clear on : "+element);
	}
	catch(Exception e)
	{
		Reporter.log("Clear the Text value ");
		assert false;
	}
	
	
}


	public static void typeIn(String xpath, String values){
	
		try
		{
	 	String[] a = xpath.split("#");
			String element = a[0];
			String path = a[1]; 
			dr.findElement(By.xpath(path)).clear();
			dr.findElement(By.xpath(path)).sendKeys(values);
			Reporter.log("Type : "+values+" in "+element+" textbox  ");
			
		}
		catch(Exception e)
		{

			Reporter.log("Element is not found");
			assert false;
		}
	}
	public static void selectList(String xpath, String values){
	
		try
		{
			String[] a = xpath.split("#");
			String element = a[0];
			String XPATH = a[1];
		new Select(dr.findElement(By.xpath(XPATH))).selectByVisibleText(values);
		Reporter.log("Select : "+values+" in "+element+" dropdown list");
			
		}
		catch(Exception e)
		{

			Reporter.log("Element is not found");
			assert false;
		}
	}
	public static void selectListByID(String xpath, String values){
		
		try
		{
			String[] a = xpath.split("#");
			String element = a[0];
			String XPATH = a[1];
			System.out.println(XPATH);
		new Select(dr.findElement(By.id(XPATH))).selectByVisibleText(values);
		Reporter.log("Select : "+values+" in "+element+" dropdown list");
			
		}
		catch(Exception e)
		{

			Reporter.log("Element is not found");
			assert false;
		}
	}
	
	public static void selectListValue(String xpath, String values){
		
		try
		{
			String[] a = xpath.split("#");
			String element = a[0];
			String path = a[1];
		new Select(dr.findElement(By.xpath(path))).selectByValue(values);
		Reporter.log("Select : "+values+" in "+element+" dropdown list");
			
		}
		catch(Exception e)
		{

			Reporter.log("Element is not found");
			assert false;
		}
	}
	public static void verifyText(String xpath, String expectedText){
	
		try
		{
			String[] a = xpath.split("#");
			String path = a[1];
			String strvalues = dr.findElement(By.xpath(path)).getText();
			if(strvalues.trim().equals(expectedText.trim()))
			{
				System.out.println("Verification Successful - The correct title is displayed on the web page.");
				Reporter.log("Verified that Expected values : "+expectedText+" is matched with Actual values : "+strvalues);
			}
			else
			{
				System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
				Reporter.log("Verified that Expected values : "+expectedText+" is not matched with Actual values : "+strvalues);
				Assert.fail();
				//assert false;
				
			}
		}
		catch(Exception e)
		{

			Reporter.log("Element is not found");
			assert false;
		}
	}	
}
