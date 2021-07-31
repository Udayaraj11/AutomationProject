package myApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpHomepageobject extends BasePage

{

	@FindBy(linkText = "Demo")
	private WebElement lnkDemo;

	
	@FindBy(linkText= "Pricing")
	private WebElement lnkPricing;
	
	@FindBy(xpath ="//*[@id='Main']/div[6]/div/div[1]/section/div[2]/div[2]" )
	private WebElement txtAndrionpage;
	
	@FindBy(xpath = "//*[@id='Main']/div[6]/div/div[1]/section/div[2]/div[2]/div/div[4]/span[1]")
	private WebElement txtAndrionprc;
	
	
	
	public PhpHomepageobject() {
		// TODO Auto-generated constructor stub
	
		
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getlinkDemo()
	{
		return lnkDemo;
	}
	
	
public String getTxtpricing()
{
	return lnkPricing.getText();
}


public WebElement getlinkpricing()
{
	return lnkPricing;
}


public String getTxtDemo()
{
return lnkDemo.getText();
}

public int getAndrionPrc()

{
	String price = txtAndrionprc.getText();
	return Integer.parseInt(price);
}

}




	
	
