package SeleniumIntro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownSelect {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		//implicit wait - 2 seconds time out

		//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		//dropdown with select tag
		WebElement staticdrpdwn = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//creating object for select class in selenium
		//pass the dropdown webelement as argument in Select
		Thread.sleep(2000);
		Select dropdown = new Select(staticdrpdwn);
		//if u need to select the third option in the dropdown
	dropdown.selectByIndex(3);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByVisibleText("AED");
	//printing the selection in the console
	System.out.println(dropdown.getFirstSelectedOption().getText());

	}
}
