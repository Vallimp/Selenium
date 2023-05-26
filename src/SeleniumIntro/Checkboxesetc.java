package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxesetc {

public static void main(String[] args) throws InterruptedException {

	// TODO Auto-generated method stub

	//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

	WebDriver driver =new ChromeDriver();

	driver.get("http://spicejet.com"); //URL in the browser
	//System.setProperty("webdriver.http.factory","jdk-http-client");

	driver.manage().window().maximize();
	Thread.sleep(3000);

//to check the check box
//is selected checks and returns a boolean whether the check box is selected or not
System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

//to countthe number of checkboxes 
System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(5000);
//assertions
//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

//is enabled doesnt work sometimes because the calendar is disabled but when we click on it, we are still able to see the
//options so selenium is confused
System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

{

System.out.println("its enabled");

Assert.assertTrue(true);

}

else

{

Assert.assertTrue(false);

}
}
}


