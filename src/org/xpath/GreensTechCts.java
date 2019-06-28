package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechCts {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinoth\\eclipse-workspace\\SeleniumDay2xpath\\driver\\chromedriver.exe");
WebDriver greens = new ChromeDriver();
greens.get("http://www.greenstech.in/selenium-course-content.html");
WebElement cts= greens.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
cts.click();
}
}
