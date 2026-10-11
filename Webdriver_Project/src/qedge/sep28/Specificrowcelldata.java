package qedge.sep28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specificrowcelldata {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/Html/html_tables.asp");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.id("customers"));
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		List<WebElement> colos = rows.get(1).findElements(By.tagName("td"));
		//String firstrowcell = colos.get(0).getText();
		//System.out.println(firstrowcell);
		//String secondrowcell = colos.get(1).getText();
		//System.out.println(secondrowcell);
		//String thirdrowcell = colos.get(2).getText();
		//System.out.println(thirdrowcell);
		for(int i=0;i<colos.size();i++)
		{
			System.out.println(colos.get(i).getText());
		}
		driver.quit();
	}

}
