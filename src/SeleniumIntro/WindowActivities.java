package SeleniumIntro;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {



public static void main(String[] args) {

// TODO Auto-generated method stub


System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://google.com"); //waits until the page is completely loaded

//navigate doesnt wait until all the components of the page are completely loaded
driver.navigate().to("https://rahulshettyacademy.com"); 

driver.navigate().back();

driver.navigate().forward();

	}

}