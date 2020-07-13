package com.xpath.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/gb/en/enrollment/join");
		driver.manage().window().maximize();
		driver.getTitle();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(30000);
		JavascriptExecutor js = driver;
		WebElement link = driver.findElementByXPath("//a[text()='Privacy Statement.']");
		js.executeScript(("arguments[0].click();"),link);
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow.size());
		Iterator<String> s = allwindow.iterator();
		while (s.hasNext()) {
			
			String child = s.next();
			if(!parent.equals(child)) {
				driver.switchTo().window(child);		
				
		
				}			
				
			}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
		}		

	}

