package sweety;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countlinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String homepage= "https://www.facebook.com/login/";
		driver.get(homepage);
		System.out.println("Total number of links"+driver.findElements(By.tagName("a")).size());
		//WebElement head=driver.findElement(By.id("id/header"));
		//System.out.println("Total number of links in header"+driver.findElements(By.tagName("a")).size());
		WebElement foot=driver.findElement(By.id("pageFooter"));
		System.out.println("Total number of links in footer"+driver.findElements(By.tagName("a")).size());

	}

}
