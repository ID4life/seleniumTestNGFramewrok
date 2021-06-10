package tests;

import org.testng.annotations.Test;

import pages.AmazonHomePage;
import utilities.Driver;
import utilities.PropertiesReader;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;


public class AmazonSearchDataDrivenTest {
	  @Test(dataProvider="myDataBucket")
	  
	  
	  public void test(String input) {
		  Driver.getDriver().get(PropertiesReader.getProperty("amazonURL"));
		
	  }
	  
	  @DataProvider
	  public String[] myDataBucket() {
		  String [] mydata = new String[4];
		  mydata[0]= "Coffee mug";
		  mydata[1]= "Pretty coffee mug";
		  mydata[2]= "Cool mug mug";
		  mydata[3]= "Amazing coffee mug";
		  
		  return mydata;
	  }
	  
	  @BeforeTest
	  public void beforeMethod() {
		  Driver.getDriver();
		  Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  @AfterTest
	  public void afterTest() {
		  Driver.quitDriver();
	  }
	}
