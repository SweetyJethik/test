package sweety;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FirstTestngfile {
	public String BaseUrl="http://demo.guru99.com/test/newtours/";
	String driverpath="C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe";
	public WebDriver driver;
  @Test
  public void verifyHomeTitle() {
	  String expectedTitle="Welcome: Mercury Tours";
	  String actualTitle=driver.getTitle();
	  
	  assertEquals(actualTitle,expectedTitle);
  }
  @BeforeTest
  public void launchBrowser() {
	  System.out.println("Launching chrome browser");
	  System.setProperty("webdriver.chrome.driver", driverpath);
		driver= new ChromeDriver();
		driver.get(BaseUrl);
  }

  @AfterTest
  public void Terminatebroser()
  {
	  driver.close();
  }

}
