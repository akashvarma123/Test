/*package LoginPage;

import java.util.Set;
//import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import  java.util.
import org.testng.Assert;

public class Login {

	static WebDriver driver = new FirefoxDriver();
	static WebDriverWait driverWait = new WebDriverWait(driver, 30);

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","E:/software/geckodriver-0.19.0/geckodriver-0.19.0");
		driver.get("http://phptravels.com/demo/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS).implicitlyWait(30, TimeUnit.SECONDS);

		driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='//www.phptravels.net/admin']")));
		java.util.List<WebElement> link = driver.findElements(By.xpath("//small"));
		for (WebElement l : link) {
			if (l.getText().equals("http://www.phptravels.net/admin")) {
				l.click();
			}
		}

		// String windowTitle = getCurrentWindowTitle();
		// System.out.println("CurrentWindow" + windowTitle);
		String openWindow = getMainWindowHandle(driver);
		Assert.assertTrue(closeAllOtherWindows(openWindow));

		driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("input[@name='email'][1]")));

		driver.findElement(By.xpath("input[@name='email'][1]")).sendKeys("admin@phptravels.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demoadmin");
		driver.findElement(By.xpath("//button[@type='submit']")).clear();

	}

	public static boolean closeAllOtherWindows(String mainWindow) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String currentWindowHandle : allWindowHandles) {
			if (currentWindowHandle.equals(mainWindow)) {
				driver.switchTo().window(currentWindowHandle);
				String windowTitle = getCurrentWindowTitle();
				System.out.println("CurrentWindow from alltherwindow" + windowTitle);
				driver.close();
				String windowTitle1 = getCurrentWindowTitle();
				System.out.println("CurrentWindow from alltherwindow" + windowTitle1);
			}
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS).implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().window(mainWindow);
		String windowTitle = getCurrentWindowTitle();
		System.out.println("CurrentWindow from above the if condition" + windowTitle);
		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}

	public static String getMainWindowHandle(WebDriver driver) {
		return driver.getWindowHandle();
	}

	public static String getCurrentWindowTitle() {
		String windowTitle = driver.getTitle();
		return windowTitle;
	}
}
*/