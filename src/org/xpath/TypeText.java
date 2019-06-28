package org.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeText {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinoth\\eclipse-workspace\\SeleniumDay2\\driver\\chromedriver.exe");
	WebDriver type = new ChromeDriver();
	type.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	type.get("http://www.greenstech.in/selenium-course-content.html");
	WebElement greens = type.findElement(By.xpath("//p[contains(text(),'Selenium is a framework')]"));
	System.out.println(greens.getText());
}
}
