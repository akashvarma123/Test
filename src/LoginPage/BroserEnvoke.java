package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class BroserEnvoke {
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:/software/geckodriver-v0.16.1-win64/geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true); 
		profile.setAssumeUntrustedCertificateIssuer(false);
		driver = new FirefoxDriver();
		driver.get("https://www.efaxcorporate.com/myaccount/login");

		driver.manage().window().maximize();
		
		//UserLogin();
		//VerifyHomePage();

	}
}
