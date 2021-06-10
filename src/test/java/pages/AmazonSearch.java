package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class AmazonSearch {
	public String AmazonURL = "https://www.amazon.ca/";
	 
	public AmazonSearch() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "twotabsearchtextbox")
	public WebElement searchbox;
	
	@FindBy(id = "nav-search-submit-button")
	public WebElement searchButton;
	
	@FindBy(xpath = "//a[text()='Sign in securely']")
	public WebElement signInButton; 
	
}
