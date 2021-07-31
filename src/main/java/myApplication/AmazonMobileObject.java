package myApplication;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonMobileObject extends BasePage {

	@FindBy(xpath = "//*[@id='a-autoid-0-announce']/span[2]")
	private WebElement DropDown;
	
	@FindBys( @FindBy(xpath = "//*[@id='acs-product-block-2']/div[2]/span[1]/span[2]/span[2]"))
	private List<WebElement> Pricing;
	
	
	public AmazonMobileObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	private ArrayList<String> PriceList()
	{
		ArrayList<String> Price = new ArrayList<String>();
		for (WebElement element : Pricing) {
			Price.add(element.getText());
		}
		 return Price;
	}
}
