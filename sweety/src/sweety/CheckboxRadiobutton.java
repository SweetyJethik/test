package sweety;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxRadiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement option1=driver.findElement(By.id("vfb-7-1"));
		WebElement option2=driver.findElement(By.id("vfb-7-2"));
		WebElement option3=driver.findElement(By.id("vfb-7-3"));
		option1.click();
		System.out.println("Option1 is clicked");
		option2.click();
		System.out.println("Option2 is clicked");
		option3.click();
		System.out.println("option3 is clciked");
		//checkbox
		WebElement checkbox1 =driver.findElement(By.id("vfb-6-0"));
		checkbox1.click();
		System.out.println("Checkbox1 is clicked");
		if (checkbox1.isSelected()) 
		{
			System.out.println("Checkbox is Toggled On");
			} 
		else 
		{
			System.out.println("Checkbox is Toggled Off");
			}

	}

}
