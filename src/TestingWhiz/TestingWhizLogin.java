package TestingWhiz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingWhizLogin {


	//test
	
 static String DriverPath = "E:/software/geckodriver-v0.16.1-win64/geckodriver.exe";
 static	WebDriver driver=null;

	public static void main(String arg[]) {
		
		System.setProperty("webdriver.gecko.driver", DriverPath);
		driver = new FirefoxDriver();
		driver.get("http://www.testing-whiz.com/demoscripts/string-operation.html");
		WebElement logo = driver.findElement(By.xpath("//img[contains(@alt,'TestingWhiz')]"));
		isLogoDisplayed(logo);
		WebElement oldPassword=driver.findElement(By.xpath("//input[@id='oldPassword'] "));
		WebElement newPassword=driver.findElement(By.xpath("//input[@id='newPassword'] "));
		WebElement confirmPassword=driver.findElement(By.xpath("//input[@id='confirmPassword'] "));
		WebElement checkSubmitBtnId=driver.findElement(By.xpath("//input[@id='checkSubmitBtnId'] "));
		passwordValidation(oldPassword,newPassword,confirmPassword,checkSubmitBtnId);

	}
	public static boolean isLogoDisplayed(WebElement logo) {
		boolean logopresent = false;
		try {
			if (logo.isDisplayed()) {
				logopresent = true;
				System.out.println("Image is Displayed");
			}
		} catch (Exception e) {
			System.out.println("Image is not Displayed: " + e);
		}
		return logopresent;
	}
	
	public static void passwordValidation(WebElement oldpwd,WebElement newpwd,WebElement confirmpwd,WebElement checkSubmitBtnId){
		
		oldpwd.sendKeys("1234");
		newpwd.sendKeys("1234");
		confirmpwd.sendKeys("1234");
		checkSubmitBtnId.click();
	}

}