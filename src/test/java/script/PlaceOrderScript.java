package script;

import org.testng.annotations.Test;

import components.PlaceOrder;
import utility.BaseClass;

public class PlaceOrderScript extends BaseClass {
	PlaceOrder order=new PlaceOrder();
  @Test(description="Verifying the Place Order Functionality")
  public void f() throws Exception {
	 //readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "1");
	  order.placeOrder_COD();
	  order.placeOrder_Val();
	  order.trackOrderStatus();
	  order.contact_Support();
	  
	  
  }
}
