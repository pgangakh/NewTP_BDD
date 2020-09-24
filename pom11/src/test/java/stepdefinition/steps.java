package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class steps {

	WebDriver driver;
	@Before
	public void beforetest() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PriyankaGangakhed\\Desktop\\Reskill Progaram - All details\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		}
	
	@Given("Elearing Application is launched")
	public void elearing_application_is_launched() {
     driver.get("http://elearningm1.upskills.in/");
     System.out.println("printing");
	}

	@When("I click on Signup button")
	public void i_click_on_signup_button() {
	  
	driver.findElement(By.linkText("Sign up!")).click();
	}
	@When("I enter the First name as {string}")
	public void i_enter_the_first_name_as(String string) {
      driver.findElement(By.name("firstname")).sendKeys(string);
	}
	@When("I enter the Last name as {string}")
	public void i_enter_the_last_name_as(String string) {
		driver.findElement(By.name("lastname")).sendKeys(string);
	}
	@When("I enter the e-mail as {string}")
	public void i_enter_the_e_mail_as(String string) {
		driver.findElement(By.name("email")).sendKeys(string);
	}
	@When("I enter the Username as {string}")
	public void i_enter_the_username_as(String string) {
		driver.findElement(By.name("username")).sendKeys(string);
	}
	@When("I enter the Pass as {string}")
	public void i_enter_the_pass_as(String string) {
		driver.findElement(By.name("pass1")).sendKeys(string);
	}
	@When("I enter the confirm password as {string}")
	public void i_enter_the_confirm_password_as(String string) {
		driver.findElement(By.name("pass2")).sendKeys(string);
	}
	@When("I click on register button")
	public void i_click_on_register_button() {
		driver.findElement(By.name("submit")).click();
	}
	@Then("I should see the confirmationmessage {string}")
	public void i_should_see_the_confirmationmessage(String string) {
	boolean expected = driver.getPageSource().contains("Your personal settings have been registered");
    Assert.assertEquals(expected, string);
		   
	}
	
	@When("I enter the username as {string}")
	public void i_enter_the_username_as1(String string) {
		driver.findElement(By.name("login")).sendKeys(string);
	}
	@When("I enter the Password as {string}")
	public void i_enter_the_password_as(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@Then("I should click on login button")
    public void i_should_click_on_login_button() {
    driver.findElement(By.name("submitAuth")).click();
		   }
		   
		   @When("I click on Compose message button")
		   public void i_click_on_compose_message_button() {
			   driver.findElement(By.linkText("Compose")).click();  
		   }

		   @When("I enter the Text on message section")
		   public void i_enter_the_text_on_message_section() {
		      driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div[2]/div/div[2]/form/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("pgangakh@in.ibm.com");
		      driver.findElement(By.name("title")).sendKeys("Test Email");
		      
		   }
		   
		   @When("I click on Send message button")
		   public void i_click_on_send_message_button() {
			   driver.findElement(By.name("compose")).click();
			   }

		   @Then("I should see acknowledgement")
		   public void i_should_see_acknowledgement() {
			   boolean expected = driver.getPageSource().contains("The message has been sent to Priyanka Gangakhed (pgangakh)");
		   }

	}
	