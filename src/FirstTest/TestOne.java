package FirstTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestOne {
	static WebDriver driver = new FirefoxDriver();
	static Actions actions;
	static WebDriverWait wait = new WebDriverWait(driver, 30);
	static Actions action = new Actions(driver);
	static WebElement element = null;

	public static void main(String[] args) throws InterruptedException {
		String psw = "QWRtaW5AMTIz";
		String decode = new String(java.util.Base64.getDecoder().decode(psw));
		actions = new Actions(driver);

		driver.get("http://www.cygnet-infotech.com/employee-login");
		
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("asvarma");
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(decode);
		driver.findElement(By.xpath("//*[@id='btnEmpLogin']")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnDashboard']/span/i")));
		driver.findElement(By.xpath("//*[@id='btnDashboard']/span/i")).click();
		Thread.sleep(2000);
		element = driver.findElement(By.xpath(".//*[@id='imgEmployee']"));

		// To mouse on the element
		action.moveToElement(element).build().perform();
		element = driver.findElement(By.xpath("//td[4]/a/span"));
		element.click();

		List<WebElement> timesheet = driver.findElements(By.xpath("//*[@id='Timesheet']/span"));
		//List<WebElement> timesheet = driver.findElements(By.xpath("//td[4]/a/span"));
		
		for (int i = 0; i < timesheet.size(); i++) {
			System.out.println(timesheet.get(i).getText());
		}
		
		for (WebElement webElement : timesheet) {
			System.out.println("-2-"+webElement.getText());
		}
		// driver.findElement(By.linkText("Timesheet Entry")).click();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
	}

}
