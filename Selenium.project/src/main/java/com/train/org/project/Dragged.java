package com.train.org.project;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Dragged {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naark\\eclipse-workspace\\Selenium.project\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(6000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement dragit=driver.findElement(By.id("draggable"));
		WebElement dropit=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragit, dropit).build().perform();
		
	}

}
