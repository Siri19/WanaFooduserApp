package script;

import org.testng.annotations.Test;

import components.HomePage;
import utility.BaseClass;

public class HomePageScript extends BaseClass{
	HomePage home=new HomePage();
  @Test(description="Verifying the Home Page Functionality")
  public void f() throws Exception {
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "1");
	  home.nav_HomePage();
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "2");
	  home.homepage_Elements_Val();
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "3");
	  home.homepage_LocationChange();


	  
  }
}
