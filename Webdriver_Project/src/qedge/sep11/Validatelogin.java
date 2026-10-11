package qedge.sep11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Validatelogin {
	//launch url
	//clear username and password
	//enter username and password
	//capture username and password using getDomAttribute
	//click login button
	//if username and password valid verify url
	//capture error message if any invalid using getText
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//store username textbox into webelement
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Admin");
		//capture username value
		String user_value = username.getDomAttribute("value");
		System.out.println(user_value);
		//store password into webelement
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		//capture password value
		String pass_value = password.getDomAttribute("value");
		System.out.println(pass_value);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if(Actual.endsWith(Expected))
		{
			System.out.println("Valid Login Details::"+Expected+"   "+Actual+"    "+"Login pass");
		}
		else
		{
			//capture error message
			String Error_Message = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(Error_Message+"  "+Expected+"   "+Actual+"   "+"Login Fail");
		}
		Thread.sleep(5000);
        driver.quit();
	}

}
