package com.xpath.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownXpathPractice {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");

ChromeDriver driver = new ChromeDriver();
driver.get("https://www.spicejet.com/default.aspx");
//System.out.println(driver.getCurrentUrl());
driver.navigate().refresh();
driver.manage().window().maximize();


	}

}
