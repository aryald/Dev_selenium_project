package com.xpath.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle4 {
	public static String child;
	public static String child2;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/#");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String parent = driver.getWindowHandle();// alfanUmeric for current window
		System.out.println(parent);// printing current window
		Thread.sleep(30000);
		JavascriptExecutor js = driver;
		WebElement link = driver.findElementByXPath("(//a[@title='Create an account'])[1]");
		js.executeScript("arguments[0].click();", link);// default code
		Set<String> allwindows = driver.getWindowHandles();// first window to another set logic
		System.out.println(allwindows.size());
		Iterator<String> s = allwindows.iterator();// Converting set object to Iterator

		while (s.hasNext()) { // switching one tab to another tab by using Iteration
			child = s.next();
			if (!parent.equals(child)) { // if u know exactly value use ForLoop concept if u don't know just use
											// WhileLoop
											//
				driver.switchTo().window(child);
			}
		}
		WebElement element = driver.findElementByXPath("//input[@name='firstName']");
		element.sendKeys("Devraj");
		driver.findElementByXPath("//input[@id='lastName']").sendKeys("Aryal");
		WebElement username = driver.findElementByXPath("//input[@id='username']");
		username.clear();
		username.sendKeys("Daryal");

		driver.findElementByXPath("//a[text()='Terms']").click();
		Set<String> Thirdwindow = driver.getWindowHandles();
		Iterator<String> j = Thirdwindow.iterator();// convert set to iterator
		while (j.hasNext()) { //

			child2 = j.next();
			if (!parent.equals(child2)) {

				driver.switchTo().window(child2);

			}

		}
		System.out.println("totalwindow" + Thirdwindow.size()); // total first 2nd n third count
		System.out.println(driver.getCurrentUrl());
		System.out.println("child2title" + driver.getTitle());
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(child);

	}

}
