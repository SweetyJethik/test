package sweety;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getfbtitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		System.out.println("Title is "+driver.getTitle());
		String expected="Log in to Facebook";
		String original = driver.getTitle();
		if(expected.contentEquals(original))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");
		}
	}

}
