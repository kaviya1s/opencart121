package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.MyAccpage;

public class TC2_LoginTest extends BaseClass {
	
	@Test(groups={"Sanity","Master"})
	public void Verify_login() {
		
		
		logger.info("******Start TC2_login***********");
		
		
		HomePage hp=new HomePage(driver);
		hp.lnkmyAccount();
		hp.lnkmyLogin();
		
		Loginpage lp=new Loginpage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setpwd(p.getProperty("password"));
		lp.clkbtn();
		
		MyAccpage acc=new MyAccpage(driver);
		boolean accpage=acc.isMyAccpageExists();
		
		Assert.assertEquals(accpage, true);
		
		logger.info("***********finish TC2_login************");
	}
		

}
