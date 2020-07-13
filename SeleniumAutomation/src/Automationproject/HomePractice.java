package Automationproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("Dave");
		driver.findElementByXPath("//*[@id='idOfButton']").click();
		driver.findElement(By.xpath("//input[@id='male']")).click();
		driver.findElement(By.xpath("//input[@name='gender'][2]")).click();
		driver.findElementByXPath("//input[@class='Performance'] ").click();
		driver.findElementByXPath("//*[@id='dblClkBtn']").click();
		driver.findElement(By.name(""));
		
		
		

	}

}
