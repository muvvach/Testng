package obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {

	/*WebDriver driver;
	public Home(WebDriver driver) {
		this.driver=driver;
	}
	
	By username=By.id("loginUsername");
	
	public WebElement name()
	{
		return driver.findElement(username);
	}
*/
	WebDriver driver;
	public Home(WebDriver driver) {
		this.driver=driver;
	}
	
	
	


	@FindBy (id="loginUsername")
	WebElement userdetails;
	
	//@FindBy(name="password")
	//WebElement password ;
	
	
	
	
	public WebElement name() {
		 return userdetails;
	}
	
	//public WebElement pass() {
		// return password;
	
	
	}

	
	
	



