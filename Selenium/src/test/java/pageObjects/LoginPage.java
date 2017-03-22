package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.ChipUtils;


public class LoginPage extends AbstractBasePage {

	@FindBy(id="Username")
	private WebElement Username;

	@FindBy(id="Password")
	private WebElement Password;
	
	@FindBy(css="button[value='Login']")
	private WebElement logIn;
	

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	public LoginPage enterUsername(String username) {
		ChipUtils.pauseDemo("enter username " + username);
		Username.sendKeys(username);
		return this;
	}

	public LoginPage enterPassword(String pwd) {
		ChipUtils.pauseDemo("enter username " + pwd);
		Password.sendKeys(pwd);
		return this;
	}
	
	public LoginPage clickLoginButton() {
		ChipUtils.pauseDemo("Click sign in button");
		logIn.click();
		return this;
	}
}
