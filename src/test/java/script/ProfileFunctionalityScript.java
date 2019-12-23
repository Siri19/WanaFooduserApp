package script;

import org.testng.annotations.Test;

import components.ProfileFunctionality;
import utility.BaseClass;

public class ProfileFunctionalityScript extends BaseClass {
	ProfileFunctionality profile=new ProfileFunctionality();
  @Test(description="Verifying the Profile Functionality")
  public void f() throws Exception {
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "1");
	  profile.nav_ProfilePage();
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "2");
      profile.edit_Fun();
  }
}

