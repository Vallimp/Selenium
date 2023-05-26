package SeleniumIntro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dropdownflight {
	
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		//implicit wait - 2 seconds time out

		//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.spicejet.com");
	
		driver.findElement(By.id("divpaxinfo")).click();

	   Thread.sleep(2000L);
	   //to select a dropdown and increment the number of adults using while and for loops

	   /*int i=1;

	while(i<5)

	{

	driver.findElement(By.id("hrefIncAdt")).click();//4 times

	i++;

	}*/

	   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	for(int i=1;i<5;i++)

	{

	driver.findElement(By.id("hrefIncAdt")).click();

	}

	driver.findElement(By.id("btnclosepaxoption")).click();

	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

}
}
