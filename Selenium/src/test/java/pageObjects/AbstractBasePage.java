package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractBasePage {

	protected WebDriver driver;
	public boolean bResult;
	
	public AbstractBasePage(WebDriver driver) {
		this.driver = driver;
		this.bResult=true;
		PageFactory.initElements(driver, this);
	}
	
	public void close() {
		driver.close();
	}
	
	public void quit() {
		driver.quit();
	}
	
}
