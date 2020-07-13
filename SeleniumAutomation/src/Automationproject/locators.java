package Automationproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id ='fname']").sendKeys("Dave aryal");
		driver.findElementByXPath("(//input[@name ='gender'])[2]").click();
		// driver.findElement(By.tagName(""))
		// driver.findElementByLinkText("This is a link").click();
		//driver.findElementByPartialLinkText("This is").click();
		//driver.quit();

	}

}
