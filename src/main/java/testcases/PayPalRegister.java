package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import wdMethods.ProjectMethods;

public class PayPalRegister extends ProjectMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.paypal.com/in/home");
		driver.findElementById("signup-button").click();
		boolean selected = driver.findElementById("radio-personal").isSelected();
		if(!selected)
		{
			driver.findElementById("radio-personal").click();
		}
		driver.findElementByLinkText("Next").click();
		WebElement country = driver.findElementById("country");
		Select dd=new Select(country);
		dd.selectByVisibleText(" India");
		driver.findElementById("email").sendKeys("iambharathwaj@gmail.com");
		driver.findElementById("password").sendKeys("bharath13");
		driver.findElementById("confirmPassword").sendKeys("bharath13");
		driver.findElementById("_eventId_personal").click();
		driver.close();
	}

}
