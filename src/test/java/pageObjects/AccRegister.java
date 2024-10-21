package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccRegister extends BasePage{
	
	WebDriver driver;
	
	public AccRegister(WebDriver driver) {
		super(driver);
	}
	
@FindBy(xpath="//input[@id='input-firstname']")
WebElement firstname;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement lastname;

@FindBy(xpath="//input[@id='input-email']")
WebElement txtemail;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement phonenumber;

@FindBy(xpath="//input[@id='input-password']")
WebElement password;

@FindBy(xpath="//input[@id='input-confirm']")
WebElement confirmpassword;

@FindBy(xpath="//input[@name='agree']")
WebElement chkdpolicy;

@FindBy(xpath="//input[@value='Continue']")
WebElement btncontinue;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgconfirmation;

public void setfirstname(String fname) {
	firstname.sendKeys(fname);
}

public void setlastname(String lname) {
	lastname.sendKeys(lname);
}

public void settxtemail(String email) {
	txtemail.sendKeys(email);
}

public void setphonenumber(String phno) {
	phonenumber.sendKeys(phno);
	
}
public void setpassword(String pwd) {
	password.sendKeys(pwd);
}

public void setconfirmpassword(String cnfpwd) {
	confirmpassword.sendKeys(cnfpwd);
}

public void setchkdpolicy() {
	chkdpolicy.click();
}
public void btncontinue() {
	btncontinue.click();
}

public String getmsgconfirmation() {
	try {
		return (msgconfirmation.getText());
	}
	catch(Exception e){
		return(e.getMessage());
		
	}
}
}
