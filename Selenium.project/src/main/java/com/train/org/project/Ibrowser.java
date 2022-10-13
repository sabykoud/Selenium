package com.train.org.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Ibrowser {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\naark\\eclipse-workspace\\Selenium.project\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.facebook.com");
Thread.sleep(6000);
//driver.navigate().refresh();
driver.manage().window().maximize();
//driver.navigate().back();
Thread.sleep(6000);
//driver.navigate().forward();
String windows=driver.getWindowHandle(); //this commend will let us get the session ID.
System.out.println(windows);
String url=driver.getCurrentUrl();
System.out.println(url);
String title=driver.getTitle();
System.out.println(title);
WebElement UserField= driver.findElement(By.id("email"));
UserField.sendKeys("peopletech");
WebElement PasswordField= driver.findElement(By.name("pass"));
PasswordField.sendKeys("123");
WebElement loginbutton= driver.findElement(By.name("login"));
//loginbutton.click();
WebElement Forgotit= driver.findElement(By.linkText("Forgot password?"));
//Forgotit.click();
WebElement Creatnewaccount=driver.findElement(By.linkText("Create new account"));
Creatnewaccount.click();

Thread.sleep(6000);
WebElement Month=driver.findElement(By.name("birthday_month"));
Select ob=new Select (Month);
ob.selectByIndex(7);
WebElement Day=driver.findElement(By.name("birthday_day"));
Select oj=new Select (Day);
oj.selectByValue("23");
WebElement Year=driver.findElement(By.name("birthday_year"));
Select ok=new Select(Year);
ok.selectByVisibleText("1989");

Thread.sleep(6000);
WebElement firstname=driver.findElement(By.name("firstname"));
firstname.sendKeys("Sabrina");
WebElement lastname=driver.findElement(By.name("lastname"));
lastname.sendKeys("Koudeche");
WebElement Email=driver.findElement(By.name("reg_email__"));
Email.sendKeys("sabrinakou@hotmail.com");
WebElement ReEmail=driver.findElement(By.name("reg_email_confirmation__"));
ReEmail.sendKeys("sabrinakou@hotmail.com");
WebElement Password=driver.findElement(By.name("reg_passwd__"));
Password.sendKeys("456");
WebElement female=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[1]"));
female.click();// this is absolute Xpath

//syntax for relative Xpath
//tagname[@attribute-name='attribute value']

WebElement signup=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
signup.click();

//text Xpath syntax= //td[text()='userID']
WebElement SignBt=driver.findElement(By.xpath("(//button[text()='Sign Up'and @name='websubmit'])"));
SignBt.click();

//contains Xpath syntax=  //*[contains(@type,'sub')]
driver.findElement(By.xpath("//*[contains(text(),'Forgot password')]"));



	}

}
