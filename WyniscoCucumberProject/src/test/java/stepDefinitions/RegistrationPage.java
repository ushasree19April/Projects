package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPage {

	WebDriver driver;

	@Before
	public void setup() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		// options.addArguments("--headless");
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
		driver.navigate().to("https://www.wynisco.com/apply.html");

	}

	@After
	public void tearDown() {

		// driver.quit();

	}

	@Given("I am on the Registration Page")
	public void i_am_on_the_registration_page() {
		System.out.println("Landed on the registration page");
	}

	@When("I enter my firstName as {string}")
	public void i_enter_my_first_name_as(String firstName) {
		driver.findElement(By.id("First_Name")).sendKeys("test");
		System.out.println("firstname");
	}

	@When("I enter my lastName as {string}")
	public void i_enter_my_last_name_as(String lastName) {
		driver.findElement(By.id("Last_Name")).sendKeys("test");
		System.out.println("lastName");

	}

	@And("I enter my email as {string}")
	public void i_enter_my_email_as(String Email) {
		driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
		System.out.println("Email");

	}

	@And("I enter mu mobile as {string}")
	public void i_enter_mu_mobile_as(String Mobile) {
		driver.findElement(By.xpath("//input[@id='Mobile']")).sendKeys("123467890");
		System.out.println("mobile");

	}

	@And("I click the submit button")
	public void i_click_the_submit_button() {
		System.out.println();
	}

	@Then("I should see a registration success message")
	public void i_should_see_a_registration_success_message() {
		System.out.println();

	}

}
