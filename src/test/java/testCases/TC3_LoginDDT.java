package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.MyAccpage;

public class TC3_LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProvider.class)
	public void verify_logindata(String email,String pwd,String exp) {
		
		HomePage hp=new HomePage(driver);
		hp.lnkmyAccount();
		hp.lnkmyRegister();
		
		Loginpage lp=new Loginpage(driver);
		lp.setemail(email);
		lp.setpwd(pwd);
		lp.clkbtn();
		
		MyAccpage acc=new MyAccpage(driver);
		boolean accpage=acc.isMyAccpageExists(); 
		
		
		if(exp.equalsIgnoreCase("Valid")) {
			if(accpage==true) {
				Assert.assertTrue(true);
				acc.LogOut();
			
			}
			else {
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("InValid")) {
			if(accpage==true) {
				Assert.assertTrue(true);
				acc.LogOut();
			
			}
			else {
				Assert.assertTrue(false);
			}
		}
		
	}

}
