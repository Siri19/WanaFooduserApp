package script;

import org.testng.annotations.Test;
//import org.testng.internal.BaseClassFinder;

import components.CartFunctionality;
import utility.BaseClass;

public class CartScript extends BaseClass {
	CartFunctionality cart=new CartFunctionality();
  @Test(description="Verifying the Cart Functionality")
  public void f() throws Exception {
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "1");
	  cart.nav_ProductsView();
	  cart.rest_Product_Val();
	  cart.adding_Prod();
	  cart.coupon_Dis_Apply();
	  cart.walletAmount_Apply();
  }
}
