package Steps;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.When;

public class PIMPageTStepTest extends BaseClass {

	@When("user click on pim link")
	public void user_click_on_pim_link() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();

	}

	@When("user click on add  button")
	public void user_click_on_add_button() {
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();

	}

	@When("user enter firstname and lastname")
	public void user_enter_firstname_and_lastname() {
		driver.findElement(By.name("firstName")).sendKeys("Rohit");
		driver.findElement(By.name("lastName")).sendKeys("Patil");

	}

	@When("user click on save button")
	public void user_click_on_save_button() {
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();

	}

}
