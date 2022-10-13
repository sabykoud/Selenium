package com.train.org.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionstoControl {
	
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naark\\eclipse-workspace\\Selenium.project\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.Amazon.com");
		Thread.sleep(6000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		WebElement Signed=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Thread.sleep(6000);
		Actions act=new Actions(driver);
		act.moveToElement(Signed).build().perform();
		
		WebElement PrimeMember=driver.findElement(By.xpath("//*[text()='Prime Membership']"));
		act.moveToElement(PrimeMember).click().build().perform();
	}

}
