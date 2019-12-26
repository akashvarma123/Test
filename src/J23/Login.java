package J23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://test.salesforce.com/");
		
	}

}
