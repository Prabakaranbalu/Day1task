package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinoth\\eclipse-workspace\\SeleniumDay2xpath\\driver\\chromedriver.exe");
	WebDriver test = new ChromeDriver();
	test.get("https://www.snapdeal.com/?utm_source=earth_brand_new&utm_campaign=brand_search&utm_medium=brand%20term,1t1&utm_content=homepage&utm_term=b,%2Bsnapdeal");
WebElement deal = test.findElement(By.xpath("//span[@class = \"accountUserName col-xs-12 reset-padding\"]"));
deal.click();
WebElement local = test.findElement(By.xpath("//span[contains(@class,'newUserRegister')]"));
local.click();
WebElement load = test.findElement(By.xpath("//input[@placeholder = \"Mobile Number/ Email\"]"));
load.sendKeys("9842934072");
WebElement path = test.findElement(By.xpath("//button[ @class=\"btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30\"]"));
path.click();
}
}
