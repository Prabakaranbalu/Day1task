package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinoth\\eclipse-workspace\\SeleniumDay2xpath\\driver\\chromedriver.exe");
		WebDriver signup=new ChromeDriver();
		signup.get("https://www.swiggy.com");
		WebElement p= signup.findElement(By.xpath("//a[@class=\"r2iyh\"]"));
		p.click();	
		WebElement press = signup.findElement(By.xpath("//input[@id=\"mobile\"]"));
		press.sendKeys("9842934072");
		WebElement name = signup.findElement(By.xpath("//input[@id=\"name\"]"));
		name.sendKeys("Prabakaran");
		WebElement mail = signup.findElement(By.xpath("//a[@class=\"a-ayg\"]"));
		mail.click();		
}
}
