package qedge.sep15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxeachoption {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.ebay.com/");
		Thread.sleep(5000);
		//store listbox into select class
		Select listbox = new Select(driver.findElement(By.id("gh-cat")));
		//get all options inside listbox
		List<WebElement> All_options=listbox.getOptions();
		System.out.println("No of option in listbox::"+All_options.size());
		for (WebElement each : All_options) {
			System.out.println(each.getText());
		}
		driver.quit();
	}

}
