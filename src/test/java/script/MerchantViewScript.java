package script;

import org.testng.annotations.Test;

import components.MerchantView;
import utility.BaseClass;

public class MerchantViewScript extends BaseClass {
	MerchantView merchant=new MerchantView();
	
	
  @Test(description="Verifying the Merchant View Functionality")
  public void f() throws Exception {
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "1");
	  merchant.nav_HomePage();
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "2");
	  merchant.resturant_View();
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "3");
	  merchant.veg_Val();
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "4");
      merchant.nonveg_Val();
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "5");
      merchant.starters_Val();
	  
	  

	  
  }
  
}
