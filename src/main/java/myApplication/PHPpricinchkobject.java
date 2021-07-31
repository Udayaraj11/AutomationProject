package myApplication;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PHPpricinchkobject extends BasePage {

	@FindBy(xpath = "//*[@id='Main']/div[6]/div/div[1]/section/div[2]/div[2]/div/div[4]/span[1]")
	private WebElement Andrdprc;

	@FindBy(xpath = "//*[@id='Main']/div[6]/div/div[1]/section/div[2]/div[2]/div/a]")
	private WebElement btnclck;

	@FindBy(xpath = "//*[@id='android']/div/div/div[1]/button")
	private WebElement clsbtn;

	@FindBy(xpath = "//*[@id='android']/div/div/div[2]/h4/span/strong")
	private WebElement txtprc;

	@FindBys(@FindBy(xpath = "//div[@class='bottom wow fadenIn animated']/div[1]//div[.//*[@fill ='#2E4CE6']]/span[2]"))
	private List<WebElement> LstTickcompare;

	@FindBy(xpath = "/html/body/header/div/nav/a[2]")
	private WebElement clkpricing;

	@FindBy(xpath = "/html/body/header/div/nav/div[2]/span")
	private WebElement Clcproduct;

	@FindBy(xpath = "/html/body/header/div/nav/div[2]/div/a[2]")
	private WebElement ClckIntegrations;
	
	@FindBy(xpath = "//*[@id='Main']/div[2]/div/p")
	private WebElement IntegrationTXT;

	public PHPpricinchkobject() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public int getAndroidprc() {

		String price = Andrdprc.getText();
		return Integer.parseInt(price);
	}

	public void ClickProduct() {
		Actions action = new Actions(driver);
		action.moveToElement(Clcproduct).perform();
	}

	
	public int getIntegrationtxt() {

		Integer txt = IntegrationTXT.getText().split(" ").length;
		return txt;
	}

	public void ClickIntegration() {
		ClckIntegrations.click();
	}

	public void Clickbtn() {
		btnclck.click();
	}

	public void Clickpricing() {
		clkpricing.click();
	}

	public int popuppricing() {

		String price = txtprc.getText().replace("$"," ").trim();
		return Integer.parseInt(price);
	}

	public void Closebtn() {
		clsbtn.click();
	}

	public ArrayList<String> Lsttickcompare() {
		ArrayList<String> Web = new ArrayList<String>();
		for (WebElement element : LstTickcompare) {
			Web.add(element.getText());
		}
		return Web;
	}
}
