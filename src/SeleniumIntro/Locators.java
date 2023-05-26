package SeleniumIntro;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

//implicit wait - 2 seconds time out

System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.get("https://rahulshettyacademy.com/locatorspractice/");

driver.findElement(By.id("inputUsername")).sendKeys("rahul");

driver.findElement(By.name("inputPassword")).sendKeys("hello123");

driver.findElement(By.className("signInBtn")).click();

System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//tagname should be always a to provide linkText
driver.findElement(By.linkText("Forgot your password?")).click();
//added wait to eliminate 

Thread.sleep(1000);//

driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
//by css selector no double slash required before tagname and no @ before the attribute name
driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
//by xpath
driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//providing index for css selector
driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
//you can give tagname.classname or .tagname alone in css
driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//parent child traveral separated by a space in css
System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//when there is a unique element and we need to provide index
driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//to eliminate element click intercepted exception
Thread.sleep(1000);

driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//css regular expressions
driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

driver.findElement(By.id("chkboxOne")).click();
//xpath regular expressions
driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

}


}

