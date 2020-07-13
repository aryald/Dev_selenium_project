package com.xpath.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeXpathPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		//driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']")); by using Web Element
		
		driver.switchTo().frame("iframeResult"); //by using ID or Name
		//driver.switchTo().frame(8); by using index this is not very good approach			
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert a= driver.switchTo().alert();	
		a.sendKeys("Hello this is Alert");
		a.accept();
		
	}

}
