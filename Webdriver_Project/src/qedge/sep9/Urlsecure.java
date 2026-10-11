package qedge.sep9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urlsecure {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://gmail.com");
		Thread.sleep(5000);
		String Expected="https://";
		String Actual=driver.getCurrentUrl();
		if(Actual.startsWith(Expected))
		{
			System.out.println("url is secured::"+Expected+"  "+Actual+"   "+"Test pass");
		}
		else
		{
			System.out.println("url is not secured::"+Expected+"  "+Actual+"   "+"Test Fail");
			
		}
		driver.quit();
	}

}
