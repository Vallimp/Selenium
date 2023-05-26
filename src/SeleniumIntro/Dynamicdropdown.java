package SeleniumIntro;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

//not running
public class Dynamicdropdown {

public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("http://spicejet.com"); //URL in the browser
driver.manage().window().maximize();

//  //a[@value='MAA']  - Xpath for chennai

//  //a[@value='BLR']

driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//a[@value='BLR']")).click();

Thread.sleep(2000);
//this xpath is using the index,refer dynamic dropdown notes in notebook
//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

//this is writing xpath without using the index,which is confining the child xpath scope to parent only
//parent xpath space child xpath is the syntax
driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

}



}

