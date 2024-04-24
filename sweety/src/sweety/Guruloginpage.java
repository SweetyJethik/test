package sweety;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Guruloginpage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.findElement(By.id("email")).sendKeys("test566");
		driver.findElement(By.id("passwd")).sendKeys("dffghh");
		driver.findElement(By.id("SubmitLogin")).click();
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screen, new File("C:\\Users\\user\\Desktop\\sweety testing\\new1.jpeg"));
	}

}
