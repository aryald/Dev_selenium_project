package com.xpath.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Element;

public class MultipleDropdownPractictice {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
driver.navigate().forward();
System.out.println(driver.getTitle());
driver.manage().window().maximize();
driver.getPageSource();
WebElement element = driver.findElement(By.xpath("//select[@id='multi-select']"));
Select s= new Select(element);
s.selectByIndex(4);
s.selectByValue("Florida");
s.selectByVisibleText("Ohio");
s.selectByVisibleText("Ohio");
s.selectByVisibleText("Pennsylvania");
System.out.println(s.isMultiple());
s.deselectByIndex(4);
List<WebElement> totalList = s.getOptions();
System.out.println(totalList.size());
System.out.println(totalList.isEmpty());
//System.out.println(totalList.indexOf(2));

for(WebElement count:totalList) {
	System.out.println(count.getText());
	
	
}


	}

}
