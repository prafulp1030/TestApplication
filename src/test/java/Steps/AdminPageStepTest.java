package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.When;

public class AdminPageStepTest extends BaseClass {

	@When("user click on admin link")
	public void user_click_on_admin_link() {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
	}

	@When("user validate user on admin page")
	public void user_validate_user_on_admin_page() {
		boolean actualResult = driver.getCurrentUrl().contains("admin");
		Assert.assertTrue(actualResult);
	}

	@When("user click on Add button")
	public void user_click_on_add_button() {
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		
	}
}
