package qedge.sep23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Actionsmouse {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("(//img[@loading='lazy'])[25]")));
		ac.click().perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("(//div[@class='OmE16y'])[6]")));
		ac.click().perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("(//img[@loading='lazy'])[30]")));
		ac.click().perform();
		Thread.sleep(5000);
		driver.quit();
	}

}
