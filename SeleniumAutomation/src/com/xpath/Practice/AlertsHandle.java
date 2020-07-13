package com.xpath.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[contains(text(),'Generate Alert Box')]").click();
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]")).click();
		a.dismiss();

	}
}
