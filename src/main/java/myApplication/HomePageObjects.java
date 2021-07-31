package myApplication;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement ClickWomen;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement ClickDress;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement ClickTshirt;

	@FindBy(xpath = "//*[@id='newsletter-input']")
	private WebElement EnterEmail;

	@FindBy(id = "newsletter-input")
	private WebElement Subscrptn;
	
	@FindBy(id= "category")
	private WebElement EmailClick;
	
public HomePageObjects()
{
	PageFactory.initElements(driver, this);
}
	
	public void ClickWomenOB() {
		ClickWomen.click();
	}

	public void DisplayWomen() {
		getTxtAttribute(ClickWomen);
	}
	
	
	public void ClickDressOB() {
		ClickDress.click();
	}

	public void DisplayDress() {
		getTxtAttribute(ClickDress);
	}	
	
	public void ClickTshirtOB() {
		ClickTshirt.click();

	}
	
	public void DisplayTshirt() {
		getTxtAttribute(ClickTshirt);
	}
	
	
	public void EnterEmailtxt(String Email) {
		setText(EnterEmail, Email);
		EmailClick.click();
		
	}	
	
		public String subsccnfm()
		{
		
		return Subscrptn.getText();
		}
		
	
		
		
		
		
	}





