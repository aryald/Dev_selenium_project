package com.xpath.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramePractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		driver.findElementByXPath("//b[@id='topic']/following::input").sendKeys("Hello");
		driver.switchTo().defaultContent();
		//driver.switchTo().frame("frame3");
		driver.switchTo().frame("frame1").switchTo().frame("frame3");
		driver.findElementByXPath("//input[@id='a']").click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement element = driver.findElement(By.xpath("//select [@id='animals']"));
		Select s = new Select(element);
		s.selectByVisibleText("Avatar");
		

	}

}
