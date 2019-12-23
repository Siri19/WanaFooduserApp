package script;

import org.testng.annotations.Test;

import components.SearchFunctionality;
import utility.BaseClass;

public class SearchScript extends BaseClass {
	SearchFunctionality search=new SearchFunctionality();
  @Test(description="Verifying the Search Functionality")
  public void f() throws Exception {
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "1");
	  search.search_Restaurant_Functionality_Valid();
	  readData.readTestDataFile("E:\\WonnaFood\\APPS\\WonnaFoodCustomerApp\\TestData\\Wonnafoodtestcases.xlsx", "2");
	  search.search_Dish_Functionality();
	  
  }
}
