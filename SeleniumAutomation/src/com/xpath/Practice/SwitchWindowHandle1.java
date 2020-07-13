package com.xpath.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowHandle1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/gb/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String parent = driver.getWindowHandle();// to see Alfa numeric String of window
		System.out.println(parent); // Printing alfaNumeric value
		Thread.sleep(30000);
		JavascriptExecutor js = driver; // object of the JavaScript executor
		WebElement link = driver.findElement(By.xpath("(//a[text()='Explore the Many Benefits'])[1]"));
		js.executeScript(("arguments[0].click();"), link);// JavaScript executer clicking link
		Set<String> allwindows = driver.ngetWindowHandles(); // getting Multiple alfanumeric value for the new window
		System.out.println(allwindows.size()); // window size print
		Iterator<String> s = allwindows.iterator();// Converting set object to Iterator

		while (s.hasNext()) { // switching one tab to another tab by using Iteration
			String child = s.next();
			if (!parent.equals(child)) { // if u know exactly value use ForLoop concept if u don't know just use
											// WhileLoop
											//
				driver.switchTo().window(child);
			}
		}
		System.out.println(driver.getCurrentUrl()); // Printing Second Windows URL
		System.out.println(driver.getTitle()); // Get title of second or child window
		driver.switchTo().window(parent); // Switching back to Parent window or first window
		System.out.println(driver.getTitle()); // Printing title of the Parents window or first window

	}

}
