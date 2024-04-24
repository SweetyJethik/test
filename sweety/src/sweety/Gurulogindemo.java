package sweety;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gurulogindemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.demo.guru99.com/");
		driver.findElement(By.name("emailid")).sendKeys("test455");
		driver.findElement(By.name("btnLogin")).click();
	}

}
