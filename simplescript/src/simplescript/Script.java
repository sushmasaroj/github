package simplescript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\code\\simplescript\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement user=driver.findElementByCssSelector("input#email");
		user.sendKeys("sushmasaroj010@gmail.com");
		WebElement password=driver.findElementByName("pass");
		password.sendKeys("smileplease");
		WebElement login=driver.findElementByCssSelector("input[value='Log In']");
		login.click();
		
	}

}
