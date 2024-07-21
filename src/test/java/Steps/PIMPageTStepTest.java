package Steps;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.When;

public class PIMPageTStepTest extends BaseClass {
	static String empId;

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

	@When("user capture employee id")
	public void user_capture_employee_id() {
		empId = driver
				.findElement(By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div/child::input"))
				.getAttribute("value");
	}

	@When("user click on employee list")
	public void user_click_on_employee_list() {
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();
	}

	@When("user enter captured employee id")
	public void user_enter_captured_employee_id() {
		driver.findElement(By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div/child::input"))
				.sendKeys(empId);
	}

	@When("user click on search button")
	public void user_click_on_search_button() {
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();

	}

	@AfterStep
	public void abc() throws InterruptedException {
		Thread.sleep(3000);
	}

}
