package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinoth\\eclipse-workspace\\SeleniumDay2xpath\\driver\\chromedriver.exe");
		WebDriver pool = new ChromeDriver();
		pool.get("https://twitter.com/login?lang=en");
		WebElement login=pool.findElement(By.xpath("//input [ @class=\"js-username-field email-input js-initial-focus\"]"));
		login.sendKeys("Prabakaran");
		WebElement logout = pool.findElement(By.xpath("//input [ @class=\"js-password-field\"]"));
		logout.sendKeys("poliju");
		WebElement load = pool.findElement(By.xpath("//button [@class =\"submit EdgeButton EdgeButton--primary EdgeButtom--medium\"]"));
		load.click();
	}

}
