package myApplication;



	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class BasePage {

		public static WebDriver driver;
		public String browser = "chrome";

		public BasePage() {
			if (driver == null) {
				if (browser.equals("chrome")) {
					System.setProperty("webdriver.chrome.driver",
							"D:\\chromedriver.exe");
					driver = new ChromeDriver();
				} else if (browser.equals("firefox")) {
					System.setProperty("webdriver.gecko.driver", "D:\\chromedriver.exe");
					driver = new FirefoxDriver();
				}
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get("https://www.amazon.in/gp/browse.html?node=1389401031&ref_=nav_em_sbc_mobcomp_all_mobiles_0_2_8_2");
			}
		}

		public boolean elementFound(WebElement element) {
			boolean res = false;
			try {
				res = element.isDisplayed();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return res;
		}

		
		public void Mousehower(WebElement element) {
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		}
		public void setText(WebElement element, String name) {
			if (name != null) {
				element.click();
				element.clear();
				element.sendKeys(name);
			}
		}

		public String getTxtAttribute(WebElement element) {
			return element.getAttribute("value");
		}

		public String selectFromDropDown(WebElement element, String option) {
			Select obj = new Select(element);
			obj.selectByValue(option);
			return obj.getFirstSelectedOption().getText();
		}

		public boolean isElementVisible(WebElement element) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 90);
				wait.until(ExpectedConditions.visibilityOf(element));
				return true;
			} catch (Exception e) {
				return false;
			}
		}

		public String getTitlte() {
			return driver.getTitle();
		}	
		
		public void quitDriver() {
			driver.quit();
		}
	}




