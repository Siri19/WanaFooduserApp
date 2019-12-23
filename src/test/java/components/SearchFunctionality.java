package components;

import org.openqa.selenium.By;

import utility.BaseClass;

public class SearchFunctionality extends BaseClass {
	By search_box=By.xpath("//android.widget.TextView[@text='Search For Restaurants and Food']");
	By type_box=By.id("com.ongo.wanafood:id/search_src_text");
	By restaurant_Val=By.id("com.ongo.wanafood:id/tvRestName");
	By dishes=By.xpath("//android.widget.TextView[@text='DISHES']");
	By dish_Val=By.id("com.ongo.wanafood:id/tvProdName");
	
	
    
	public void search_Restaurant_Functionality_Valid() throws Exception {
		try {
			click(search_box);
			type(type_box, readData.testDataValue.get("SearchItem"));
			gettextfromapp(restaurant_Val);
			System.out.println(text22);
			if(text22.contains("Paradise")) {
				System.out.println(text22+": Pass");
			}
			readData.addStepDetails("search_Functionality_Valid", "Should work properly", "As per Expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("search_Functionality_Valid", "Should work properly", "As per Expected", "Fail", "Y");

		}
		
		
	}
	public void  search_Dish_Functionality() throws Exception {
		try {
			mobile_Clear(type_box);
			type(type_box,readData.testDataValue.get("SearchItem"));
			click(dishes);
			gettextfromapp(dish_Val);
			System.out.println(text22);
			if(text22.contains("Panner")) {
				System.out.println(text22+"Pass");
			}
			readData.addStepDetails("search_Dish_Functionality", "Should work properly", "As per Expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("search_Dish_Functionality", "Should work properly", "Not As per Expected", "Fail", "Y");

		}

		
		
		
	}
}
