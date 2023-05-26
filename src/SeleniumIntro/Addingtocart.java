package SeleniumIntro;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addingtocart {
	
	public static void main(String[] args) throws InterruptedException {

	//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	//declaring the required items in array 
	String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};

	driver.get("https://rahulshettyacademy.com/seleniumPractise/");

	Thread.sleep(3000);

	addItems(driver,itemsNeeded);

	}

	public static  void addItems(WebDriver driver,String[] itemsNeeded)

	{

	int j=0;
	//going by common xpath of all elements and keeping them in a list
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

	for(int i=0;i<products.size();i++)

	{

	//Brocolli - 1 Kg

	//Brocolli,    1 kg
	//splitting the string to get the veggie name only

	String[] name=products.get(i).getText().split("-");
	//first index is the name of the veggie but also removing spaces using trim
	String formattedName=name[0].trim();

	//format it to get actual vegetable name

	//convert array into array list for easy search

	//  check whether name you extracted is present in arrayList or not-

	List itemsNeededList = Arrays.asList(itemsNeeded);

	if(itemsNeededList.contains(formattedName))

	{

	j++;

	//click on Add to cart

	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
	//making sure it runs only for the length of the array times instead of going thru all veggies
	if(j==itemsNeeded.length)

	{

	break;

	}

	}

	}

	}

	}



