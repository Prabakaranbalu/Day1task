package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinoth\\eclipse-workspace\\SeleniumDay2xpath\\driver\\chromedriver.exe");
	WebDriver login = new ChromeDriver();
	login.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	WebElement text = login.findElement(By.id("//input[@id='ap_email']"));
	WebElement pass = login.findElement(By.xpath("Praba"));
	WebElement cont = login.findElement(By.xpath("//input[@id='continue'"));
	cont.click();
	
}
}
