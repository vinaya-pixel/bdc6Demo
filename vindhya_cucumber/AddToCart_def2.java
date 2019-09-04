package vindhya_cucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddToCart_def2 {
 WebDriver driver;
 @Given("the user launches the Demowebshop app")
 public void the_user_launches_the_Demowebshop_app() {
     // Write code here that turns the phrase above into concrete actions
     //throw new cucumber.api.PendingException();
   driver=Drivers.configureDriver("chrome");
   driver.manage().window().maximize();
   driver.get("http://demowebshop.tricentis.com");
 }

 @Then("the user clicks on the login button")
 public void the_user_clicks_on_the_login_button() {
     // Write code here that turns the phrase above into concrete actions
     //throw new cucumber.api.PendingException();
  driver.findElement(By.xpath("//a[@href='/login']")).click();
 }

 @Then("the user enters the data in the field provided")
 public void the_user_enters_the_data_in_the_field_provided() {
     // Write code here that turns the phrase above into concrete actions
     //throw new cucumber.api.PendingException();
  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vindhyavijaya98@gmail.com");
  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("vindhya98");
  
 }

 @Then("clicks on the login button")
 public void clicks_on_the_login_button() {
     // Write code here that turns the phrase above into concrete actions
     //throw new cucumber.api.PendingException();
  //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("b");
  driver.findElement(By.xpath("//input[@type='submit']")).click();
 }

 @Given("the user clicks on the books category")
 public void the_user_clicks_on_the_books_category() {
     // Write code here that turns the phrase above into concrete actions
     //throw new cucumber.api.PendingException();
  driver.findElement(By.xpath("//a[@href='/books']")).click();
 }

 @Then("user the adds the fiction book to the cart")
 public void user_the_adds_the_fiction_book_to_the_cart() {
     // Write code here that turns the phrase above into concrete actions
    // throw new cucumber.api.PendingException();
  driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
 }

 @Then("closes the app")
 public void closes_the_app() {
     // Write code here that turns the phrase above into concrete actions
     //throw new cucumber.api.PendingException();
  driver.close();
 }

 @Given("the user clicks on the computer category")
 public void the_user_clicks_on_the_computer_category() {
     // Write code here that turns the phrase above into concrete actions
    // throw new cucumber.api.PendingException();
  driver.findElement(By.xpath("//a[@href='/computers']")).click();
  driver.findElement(By.xpath("//img[@title='Show products in category Desktops']")).click();
 }

 @Then("the user selects the build the own cheap computer to the cart")
 public void the_user_selects_the_build_the_own_cheap_computer_to_the_cart() {
     // Write code here that turns the phrase above into concrete actions
     //throw new cucumber.api.PendingException();
  driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
 }

 @Then("The user closes the app")
 public void the_user_closes_the_app() {
     // Write code here that turns the phrase above into concrete actions
     //throw new cucumber.api.PendingException();
  driver.close();
 }

}

