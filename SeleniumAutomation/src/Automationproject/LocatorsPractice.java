package Automationproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.testandquiz.com/selenium/testing.html");
	driver.manage().window().maximize();
	//WebElement Fname = driver.findElement(By.id("fname"));
	//Fname.sendKeys("Aryal");
	WebElement firstname = driver.findElement(By.name("firstName"));
	firstname.sendKeys("Dave");
	WebElement aut = driver.findElement(By.className("Automation"));
	aut.click();
	WebElement radio = driver.findElement(By.id("female"));
	radio.click();
	
	
	
	
	
	

	}

}
