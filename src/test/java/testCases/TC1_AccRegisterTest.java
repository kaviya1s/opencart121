package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccRegister;
import pageObjects.HomePage;

public class TC1_AccRegisterTest extends BaseClass {
	
	
	
	@Test(groups={"Regression","Master"})
	public void TC1_AccRegisterTest() {
		
		logger.info("********Starting TC1_AccRegisterTest***************");
		try {
			HomePage hp=new HomePage(driver);
			hp.lnkmyAccount();
			logger.info("***clicked on myAccount******");
			hp.lnkmyRegister();
			logger.info("****clicked on myRegister***********");
			
			AccRegister acr=new AccRegister(driver);
			logger.info("*****providing customer details********");
			acr.setfirstname(randomstring());
			
			acr.setlastname(randomstring());
			
			acr.settxtemail(randomstring()+"@gmail.com");
			acr.setphonenumber(randomNumber());
			
			String pwd=randomalphanum();
			
			acr.setpassword(pwd);
			acr.setconfirmpassword(pwd);
			acr.setchkdpolicy();
			acr.btncontinue();
			
			logger.info("Validating expected message");
			String cnfpwd=acr.getmsgconfirmation();
			if(cnfpwd.equals("Your Account Has Been Created!")) {
				Assert.assertTrue(true);
				}
			else {
				logger.error("Test Failed");
				logger.debug("Debug logs");
				Assert.assertFalse(false);
			}
			Assert.assertEquals(cnfpwd, "Your Account Has Been Created!");
		}
	    catch(Exception e) {
	    	Assert.fail();
	    }
		logger.info("*******TC1_AccRegisterTest is Completed*********");
		
	}

	
	
	public String randomstring() {
		String ranstring=RandomStringUtils.randomAlphabetic(6);
		return ranstring;
	}
	
	public String randomNumber() {
		String rannum=RandomStringUtils.randomNumeric(10);
		return rannum;		
	}
	
	public String randomalphanum() {
		String ranalphanum=RandomStringUtils.randomAlphanumeric(6);
		return ranalphanum;
	}
	
	
		
		
	

}
