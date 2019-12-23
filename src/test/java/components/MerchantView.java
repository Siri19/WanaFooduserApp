package components;

import org.openqa.selenium.By;
import org.testng.Assert;

import utility.BaseClass;

public class MerchantView  extends BaseClass{
	By sideMenu=By.id("com.ongo.wanafood:id/imgHam");
	By side_HomeLink=By.id("com.ongo.wanafood:id/design_menu_item_text");
	By home_Val=By.xpath("//android.widget.TextView[@text='Search For Restaurants and Food']");
	By viewMenu=By.id("com.ongo.wanafood:id/tvMenu");
	By rest_Val=By.id("com.ongo.wanafood:id/tvName");
	By chinesh_Cat=By.xpath("//android.widget.TextView[@text='CHINESE']");
	By veg_Item_Val=By.id("com.ongo.wanafood:id/tvProdName");
	By round=By.id("com.ongo.wanafood:id/imgMixed");
	By nonveg_Item_Val=By.id("com.ongo.wanafood:id/tvNoData");
	By starters_Cat=By.xpath("//android.widget.TextView[@text='STARTERS']");
	By biryani_Cat=By.xpath("//android.widget.TextView[@text='BIRYANIS']");
	By starters_Item=By.id("com.ongo.wanafood:id/tvProdName");
	
	
	
	
	
	
	public void nav_HomePage() throws Exception {
		try {
			click(sideMenu);
			click(side_HomeLink);
			gettextfromapp(home_Val);
			System.out.println(text22);
			Assert.assertEquals(text22, readData.testDataValue.get("Verify"));
			readData.addStepDetails("nav_HomePage", "Should navigate to Home Page", "As per Expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("nav_HomePage", "Should navigate to Home Page", "Not As per Expected", "Fail", "Y");

		}
		
	}
	public void resturant_View() throws Exception
	{
		try {
			//scrollup();
			click(viewMenu);
			gettextfromapp(rest_Val);
			System.out.println(text22);
			Assert.assertEquals(text22, readData.testDataValue.get("Verify"));
			readData.addStepDetails("resturant_View", "Particular Rest View should show", "As per expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("resturant_View", "Particular Rest View should show", "Not As per expected", "Fail", "Y");

		}
		
	}
	public void veg_Val() throws Exception {
		try {
			gettextfromapp(veg_Item_Val);
			System.out.println(text22);
			Assert.assertEquals(text22, readData.testDataValue.get("Verify"));
			readData.addStepDetails("veg_Val", "Veg related products should show", "As per expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("veg_Val", "Veg related products should show", "Not As per expected", "Fail", "Y");

		}

		
		
	}
	public void nonveg_Val() throws Exception {
		try {
			click(round);
			gettextfromapp(nonveg_Item_Val);
			System.out.println(text22);
			Assert.assertEquals(text22, readData.testDataValue.get("Verify"));
			readData.addStepDetails("nonveg_Val", "Non Veg related products should show", "As per expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("nonveg_Val", "Non Veg related products should show", "Not As per expected", "Fail", "Y");

		}

		
	}
	public void starters_Val() throws Exception {
		try {
			click(starters_Cat);
			gettextfromapp(starters_Item);
			System.out.println(text22);
			Assert.assertEquals(text22, readData.testDataValue.get("Verify"));
			readData.addStepDetails("starters_Val", "Starters related products should show", "As per expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("starters_Val", "Starters related products should show", "Not As per expected", "Fail", "Y");

		}

	}
	
	
}
