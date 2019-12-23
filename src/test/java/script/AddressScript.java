package script;

import org.testng.annotations.Test;

import components.AddressSelectionFunctionality;
import utility.BaseClass;

public class AddressScript extends BaseClass {
	AddressSelectionFunctionality address=new AddressSelectionFunctionality();
  @Test(description="Address Selection Functionality")
  public void f() throws Exception {
	 readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "1");
     address.nav_AddressPage() ;    
     address.select_Address();
  }
}
