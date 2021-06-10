package tests;

import org.testng.annotations.Test;

import pages.AmazonHomePage;
import utilities.Driver;
import utilities.PropertiesReader;

public class AmazonSearchTest1 {
       

	   AmazonHomePage homepage = new AmazonHomePage();
	   @Test
	   public void homepage1() {
		  Driver.getDriver().get(homepage.AmazonURL);
		  homepage.searchbox.sendKeys("Husband for Ami");
		  homepage.searchButton.click();
		  
	   }
}
