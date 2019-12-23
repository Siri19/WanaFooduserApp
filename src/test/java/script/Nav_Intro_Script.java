package script;

import org.testng.annotations.Test;

import components.Navigating_Intro_Swiping;
import objectRepository.WonnaFood_Customer_Locators;
import utility.BaseClass;

public class Nav_Intro_Script extends BaseClass {
	Navigating_Intro_Swiping intro=new Navigating_Intro_Swiping();
	
  @Test(description="Verifying Intro screens Functionality")
  public void f() throws Exception {
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\WonnaFoodTestCases.xlsx", "1");
	  intro.launch_Wonnafood_CustomerApp();
	  intro.navigating_Intro_Verification();
	  
	  
  }
}
