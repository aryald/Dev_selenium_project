package com.xpath.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.getCurrentUrl();
		driver.navigate().forward();
		// driver.navigate().back();
		// driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement aryal = driver.findElementByXPath("//select[@id ='testingDropdown']");
		Select s = new Select(aryal);
		// s.selectByIndex(2); using by Index
		// s.selectByValue("Manual"); select by value method
		s.selectByVisibleText("Manual Testing");
		System.out.println(s.isMultiple());
		List<WebElement> allCountry = s.getOptions();
		System.out.println(allCountry.size());
		
		for (WebElement dave : allCountry) {
			System.out.println(dave.getText());
		}
	}
}
