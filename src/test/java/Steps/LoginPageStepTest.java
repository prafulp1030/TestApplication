package Steps;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepTest extends BaseClass {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		BaseClass.initialization();
	}

	@When("user enter valid credentails")
	public void user_enter_valid_credentails() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

	}

	@Then("user click on login button")
	public void user_click_on_login_button() {

		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

	}

}
