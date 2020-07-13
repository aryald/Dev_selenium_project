package com.xpath.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        WebElement fname = driver.findElementByXPath("//*[@id='firstName']");
        fname.sendKeys("aryaal");       
        WebElement find = driver.findElementByXPath("//*[@id='lastName']");
        find.sendKeys("Aryal");
        WebElement confirmemail = driver.findElementByXPath("//*[@id='confirmEmail']");
        confirmemail.sendKeys("tstsqa@gmail.com");
        Thread.sleep(20000);
        driver.findElementByXPath("//select[@id='country']").click();
        
        
        
        
        
	}
}
