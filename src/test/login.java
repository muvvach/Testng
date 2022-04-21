package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import obj.Home;

public class login {

	
	
	public class Login {
		@Test
		public void login1()
		{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriverfolder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.reddit.com/login/");
		Home i =new Home(driver);
		i.name().sendKeys("hai");
		//rd.pass().sendKeys("bye");
		//rd.emailid().sendKeys("a2@.com");
		//rd.username().sendKeys("cmuvva");
		//rd.name().sendKeys("hello hai");
		//rd.emailid().sendKeys("a@a.com");
		
		
		}
		}
}
	