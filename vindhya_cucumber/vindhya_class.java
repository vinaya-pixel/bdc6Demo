package vindhya_cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import vindhya_cucumber.Drivers;

public class vindhya_class {
	
	WebDriver driver;
	@BeforeTest
	public void ConfigureBrowser() {
		  driver = Drivers.configureDriver("chrome");
		
	}
	
	@Test
	@Given("Applocation is launched by the guest user")
	public void applocation_is_launched_by_the_guest_user() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();  
		  driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@When("User clicks on sign in link available")
	public void user_clicks_on_sign_in_link_available() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		//driver.findElement(By.id(""));
		 driver.get("http://10.232.237.143:443/RegisterUser");
	}

	@When("provides the required data on the form")
	public void provides_the_required_data_on_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys("Vindhya1234");
		driver.findElement(By.id("firstName")).sendKeys("fikg");
		
		driver.findElement(By.name("lastName")).sendKeys("tgdt");
		driver.findElement(By.id("password")).sendKeys("vindhya123");
		driver.findElement(By.name("confirmPassword")).sendKeys("vindhya123");
		driver.findElement(By.xpath("//input[@value='Female']")).isSelected();
		 driver.findElement(By.id("emailAddress")).sendKeys("vindhya@gmail.com");
		  driver.findElement(By.id("mobileNumber")).sendKeys("9481437429");
		  driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
	//driver.findElement(By.className("ui-datepicker-month")).click();
	Select sel1 = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
	sel1.selectByVisibleText("Aug");//
	//driver.findElement(By.className("ui-datepicker-year")).click();
	Select sel2=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
	sel2.selectByVisibleText("1998");
	
	driver.findElement(By.linkText("31")).click();
		  driver.findElement(By.id("address")).sendKeys("fudrwuarfaudd");
		  driver.findElement(By.xpath("//option[@value='411010']")).click();
		  driver.findElement(By.id("answer")).sendKeys("fuafgdadv");
		  
		
	}

	@Then("user submits the data")
	public void user_submits_the_data() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.name("Submit")).click();
	}
@AfterTest
	@Then("verifies for the account creation")
	public void verifies_for_the_account_creation() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

}

















