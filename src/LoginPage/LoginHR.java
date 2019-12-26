package LoginPage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginHR {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:/software/geckodriver-v0.16.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://sb2.efaxcorporate.com/myaccount/login");

		driver.manage().window().maximize();
		UserLogin();
		VerifyHomePage();

	}

	public static void VerifyHomePage() {
		verifyHeaderMenu();

	}

	public static void verifyHeaderMenu() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<String> expectedMenu = new ArrayList<String>();
		expectedMenu.add("HOME");
		expectedMenu.add("VIEW FAXES");
		expectedMenu.add("SEND FAXES");
		expectedMenu.add("REPORTS");
		expectedMenu.add("ACCOUNT DETAILS");
		expectedMenu.add("FILE SHARE");
		expectedMenu.add("HELP");
		expectedMenu.add("LOGOUT");

		List<WebElement> headermenu = driver.findElements(By.xpath(".//*[@id='nav']/ul/li"));
		System.out.println(headermenu.size());

		List<String> actualMenu = new ArrayList<String>();

		for (int i = 0; i < headermenu.size(); i++) {
			actualMenu.add(headermenu.get(i).getText());

			if (actualMenu.get(i).equals(expectedMenu.get(i))) {
				System.out.println(actualMenu + " " + expectedMenu.get(i));
			} else {
				break;
			}
		}

	}

	public static void UserLogin() {
		driver.findElement(By.id("phoneNumber")).sendKeys("13239781469");
		driver.findElement(By.id("pin")).sendKeys("1234");
		driver.findElement(By.id("userLoginButton")).click();

	}
}
