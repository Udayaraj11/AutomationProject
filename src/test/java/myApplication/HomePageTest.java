package myApplication;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {

	HomePageObjects homePage;
	

	int Mail = new Random().nextInt(700);	

	public HomePageTest() {
		homePage = new HomePageObjects();
	

	}

	@Test
	public void verifyDress() {
		homePage.ClickDressOB();
		Assert.assertTrue(homePage.getTitlte().contains("Dresses"));
		homePage.ClickWomenOB();
		Assert.assertTrue(homePage.getTitlte().contains("Women"));
		homePage.ClickTshirtOB();
		Assert.assertTrue(homePage.getTitlte().contains("T-shirts"));
		
		
	}
	
	@Test
	public void EntrEmail()
	{
	
		String Email = "Abc"+ Mail + "@gmail.com";
		
	
	homePage.EnterEmailtxt(Email); 
	
	
	Assert.assertTrue(homePage.subsccnfm().contains("successfully subscribed"));
	}
	}


	


