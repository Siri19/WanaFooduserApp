package script;

import org.testng.annotations.Test;

import components.LoginFunctionality;
import utility.BaseClass;

public class LoginScript extends BaseClass {
	LoginFunctionality login=new LoginFunctionality();
  @Test(description="Verifying Login Functionality")
  public void f() throws Exception {
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "1");
	  login.login_ValidInputs();
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "2");
	  login.nav_LoginPage();
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "3"); 
	  login.login_InvalidInputs();
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "4"); 
	  login.login_EmptyPassword(); 
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx","5"); 
	  login.login_EmptyMobileNumber();
		  


  }
  
}
