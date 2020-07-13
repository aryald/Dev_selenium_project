package com.xpath.Practice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement multiple = driver.findElementByXPath("//select[@id='multi-select']");
		Select s = new Select(multiple);
		System.out.println(s.isMultiple());
		List<WebElement> alllist = s.getOptions();
		System.out.println(alllist.size());
		
		for(WebElement dave:alllist)    {
	    System.out.println(dave.getText());
		}		
		s.selectByValue("Ohio");
		s.selectByValue("Florida");
		s.selectByValue("California");
		s.deselectByValue("Ohio");

	}

}
