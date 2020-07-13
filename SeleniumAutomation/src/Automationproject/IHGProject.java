package Automationproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IHGProject {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
driver.manage().window().maximize();
WebElement Fname = driver.findElement(By.id("firstName"));
Fname.sendKeys("Dave");
WebElement Lname = driver.findElement(By.id("lastName"));
Lname.sendKeys("Aryal");
WebElement Email = driver.findElement(By.id("email"));
Email.sendKeys("tstcqa@gmail.com");







	}

}
