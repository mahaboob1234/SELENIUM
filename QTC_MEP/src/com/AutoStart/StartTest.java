package com.AutoStart;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class StartTest 
{
public static void main(String[] args)
{
	TestNG testng = new TestNG();
	List<String> suites = new ArrayList<String>();
	suites.add("./Config/testng.xml");
	testng.setOutputDirectory("./Results");
	testng.setTestSuites(suites);
	testng.run();	
	
}
}
