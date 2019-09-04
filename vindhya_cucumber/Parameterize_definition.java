package vindhya_cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parameterize_definition {

WebDriver driver;
@Given("Launcing demowebapp")
public void launcing_demowebapp() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
driver=Drivers.configureDriver("chrome");
driver.manage().window().maximize();
driver.get("http://demowebshop.tricentis.com/");
}

@Then("click on login")
public void click_on_login() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
driver.findElement(By.xpath("//a[@href='/login']")).click();

}

@When("enter username {string} an password {string}")
public void enter_username_an_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(string);
    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(string2);
}

@When("click on submit button")
public void click_on_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
driver.findElement(By.xpath("//input[@value='Log in']")).click();
}

@Then("verify user account")
public void verify_user_account() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
//Assert.assertEquals("True");
System.out.println("successful");
}


}
