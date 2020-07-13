package com.xpath.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugesstiveXpath {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
driver.manage().window().maximize();
driver.switchTo().frame("iframeResult");
driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
Alert a = driver.switchTo().alert();
a.sendKeys("Hello Aryal");
a.accept();




	}

}
