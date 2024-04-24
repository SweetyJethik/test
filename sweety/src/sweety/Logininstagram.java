package sweety;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logininstagram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver() ;
		driver.get("https://www.instagram.com/accounts/login/?hl=en%5C");
		driver.findElement(By.name("username")).sendKeys("test44");
		driver.findElement(By.name("password")).sendKeys("tesrt");
		driver.findElement(By.name("submit")).click();

	}

}
