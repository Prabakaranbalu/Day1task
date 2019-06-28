package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechJava {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinoth\\eclipse-workspace\\SeleniumDay2xpath\\driver\\chromedriver.exe");
		WebDriver p= new ChromeDriver();
		p.get("http://www.greenstech.in/selenium-course-content.html");
		WebElement id = p.findElement(By.xpath("//a[@href=\"http://traininginchennai.in/core%20java%20material.pdf\"]"));
		id.click();
}
}
