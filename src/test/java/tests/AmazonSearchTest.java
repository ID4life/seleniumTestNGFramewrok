package tests;

import org.testng.annotations.Test;

import pages.AmazonHomePage;
import utilities.Driver;
import utilities.PropertiesReader;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class AmazonSearchTest {
	
	AmazonHomePage amazonHP = new AmazonHomePage();
	
  @Test
  public void amazonSearchTest() throws InterruptedException {
	  Driver.getDriver().get("https://www.amazon.ca/");
	  amazonHP.searchbox.sendKeys("book");
	  amazonHP.searchButton.click();
	  WebDriver searchPageTitle = Driver.getDriver();
	  searchPageTitle.getTitle();
	  WebDriver searchCriteria = Driver.getDriver();
	  Assert.assertEquals(searchPageTitle, searchCriteria);
	  Thread.sleep(4000);
  }
  @BeforeTest
  public void beforeMethod() {
	  Driver.getDriver();
  }

  @AfterTest
  public void afterMethod() {
	  Driver.quitDriver();
  }

}
