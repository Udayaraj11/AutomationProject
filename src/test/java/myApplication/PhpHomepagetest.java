package myApplication;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhpHomepagetest {

	PhpHomepageobject homePage;
	BasePage bc;

	public PhpHomepagetest() {
		homePage = new PhpHomepageobject();
		bc = new BasePage();

	}

	@Test
	public void verifyDemo() {
		WebElement element = homePage.getlinkDemo();
		Assert.assertTrue(bc.elementFound(element));
		Assert.assertTrue(homePage.getTxtDemo().equals("Demo"));
	}

	@Test
	public void verifypricing() {
		WebElement element = homePage.getlinkpricing();
		Assert.assertTrue(bc.elementFound(element));
		Assert.assertTrue(homePage.getTxtpricing().equals("Pricing"));
	}

	@Test
	public void verifyAndrprc() {
		Assert.assertTrue(homePage.getAndrionPrc() < 1000);
	}

}