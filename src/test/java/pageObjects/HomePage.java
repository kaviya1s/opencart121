package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	

@FindBy(xpath="//a[@title='My Account']")
WebElement lnkmyAccount;

@FindBy(xpath="//a[normalize-space()='Register']")
WebElement lnkmyRegister;

@FindBy(xpath="//a[normalize-space()='Login']")
WebElement lnkmylogin;

public void lnkmyAccount() {
	lnkmyAccount.click();
}

public void lnkmyRegister() {
	lnkmyRegister.click();
}

public void lnkmyLogin() {
	lnkmylogin.click();
}

}
