package qedge.sep15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigationmethods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://google.com");
		System.out.println("pageTitle[1]:"+driver.getTitle());
		Thread.sleep(5000);
//click on gmail link
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("pageTitle[2]"+driver.getTitle());
		Thread.sleep(5000);
		//click back button
		driver.navigate().back();
		System.out.println("pageTitle[3]:"+driver.getTitle());
		Thread.sleep(5000);
		//click forward button
		driver.navigate().forward();
		System.out.println("pageTitle[4]:"+driver.getTitle());
		Thread.sleep(5000);
		//reload page
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.quit();
	}

}
