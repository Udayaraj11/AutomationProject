package myApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PHPpricingchktest {

	PHPpricinchkobject homepage;
	BasePage bc;

	public PHPpricingchktest() {
		homepage = new PHPpricinchkobject();
		bc = new BasePage();
	}

	@BeforeMethod
	public void Clickpricing() {
		homepage.Clickpricing();
	}

	@Test
	public void crosscheckprc() {
		homepage.getAndroidprc();
		homepage.Clickbtn();
		int pop = homepage.popuppricing();
		homepage.Closebtn();
		Assert.assertTrue(homepage.getAndroidprc() == pop);
		Assert.assertTrue(homepage.Lsttickcompare().contains("Web Application"));

	}

	@Test
	public void CheckTxt() {
		homepage.ClickProduct();
		homepage.ClickIntegration();
		homepage.getIntegrationtxt();
		Assert.assertTrue(homepage.getIntegrationtxt() < 150);

	}
}
