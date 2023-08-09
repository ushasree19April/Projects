package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Wynisco\\WyniscoJavaProject\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		System.out.println("Browser opened");

		driver.navigate().to("https://www.wynisco.com/apply.html");
		driver.manage().window().maximize();

		WebElement firstName = driver.findElement(By.id("First_Name"));
		firstName.sendKeys("test");
		System.out.println("firstname");

		driver.findElement(By.id("Last_Name")).sendKeys("test");
		System.out.println("lastName");

		driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
		System.out.println("Email");

		driver.findElement(By.xpath("//input[@id='Mobile']")).sendKeys("123467890");
		System.out.println("mobile");

		Select course = new Select(driver.findElement(By.xpath("//select[@id='LEADCF9' and @name='LEADCF9']")));
		course.selectByValue("Quality Assurance");
		System.out.println("QA course");

		Select country = new Select(driver.findElement(By.xpath("(//select[@class='zcwf_col_fld_slt'])[2]")));
		country.selectByIndex(3);
		System.out.println("Country");

	}

}
