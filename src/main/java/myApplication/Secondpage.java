package myApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Secondpage {
	
	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	private WebElement AddtoCart;
	
	
	
	
	
	public void btnaddtocard()
	{
		AddtoCart.click();
	}

	
	
	
}
