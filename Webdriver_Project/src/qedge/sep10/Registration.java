package qedge.sep10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flights.qedgetech.com/register.html");
		Thread.sleep(5000);
		//fill registration details
		driver.findElement(By.name("name")).sendKeys("Abhinaya");
		driver.findElement(By.id("contact")).sendKeys("7981963272");
		driver.findElement(By.name("email")).sendKeys("abhinayareddy1999@gmai.com");
		driver.findElement(By.name("password")).sendKeys("Abhi@1829");
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByVisibleText("Female");
		driver.findElement(By.id("popupDatepicker")).sendKeys("12-12-2026");
		driver.findElement(By.id("flexCheckChecked")).click();
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		driver.quit();

	}



}


