package qedge.sep24;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Javascript3 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://tatacliq.com'");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.linkText("About Us"));
		js.executeScript("window.scrollIntoView", element);
		element.click();
		Thread.sleep(8000);
		driver.quit();

	}

}
