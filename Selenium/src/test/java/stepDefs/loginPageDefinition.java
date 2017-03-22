package stepDefs;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import common.ChipUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

public class loginPageDefinition{
	public WebDriver driver;
	private LoginPage loginPage;
	
    public loginPageDefinition()
    {
    	driver = Hooks.driver;
    }
    
    @Given("^I launch given url \"([^\"]*)\"$")
    public void i_launch_given_url(String url) throws Throwable {
    	driver.get(url);
    	ChipUtils.pauseDemo();
    	loginPage = new LoginPage(driver);
    }

    @Then("^I validate URL \"([^\"]*)\"$")
    public void i_validate_title_and_URL(String url) throws Throwable {
      assertTrue("URL is as Expected",(url.equals(driver.getCurrentUrl())));
    }
    
    
    @When("^I provide userid \"([^\"]*)\"$")
    public void i_provide_userid(String userid) throws Throwable {
      loginPage.enterUsername(userid);
    }
    
    @When("^I provide password \"([^\"]*)\"$")
    public void i_provide_password(String password) throws Throwable {
      loginPage.enterPassword(password);
    }
    
    @When("^I click login button$")
    public void i_click_login_button() throws Throwable {
    loginPage.clickLoginButton();
    }

}
