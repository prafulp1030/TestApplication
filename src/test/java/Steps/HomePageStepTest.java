package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.When;

public class HomePageStepTest extends BaseClass {

	@When("user is on home page and validate home page title")
	public void user_is_on_home_page_and_validate_home_page_title() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}

	@When("user validate home page url")
	public void user_validate_home_page_url() {
		boolean actualResult = driver.getCurrentUrl().contains("hrm");
		Assert.assertEquals(actualResult, true);
	}

	@When("user validate home page logo")
	public void user_validate_home_page_logo() {
		boolean actualLogoStatus = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		Assert.assertEquals(actualLogoStatus, true);
	}

}
