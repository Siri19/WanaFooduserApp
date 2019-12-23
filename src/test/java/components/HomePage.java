package components;

import org.openqa.selenium.By;
import org.testng.Assert;

import utility.BaseClass;

public class HomePage extends BaseClass {
	LoginFunctionality login=new LoginFunctionality();
	By home_Link=By.id("com.ongo.wanafood:id/design_menu_item_text");
	By homepage_layout=By.xpath("//android.widget.TextView[@text='Restaurants Offers']");
	By viewMenu_button=By.id("com.ongo.wanafood:id/tvMenu");
	By changeLoc_button=By.id("com.ongo.wanafood:id/tvCurrentLocChnage");
	By address_Change=By.id("com.ongo.wanafood:id/places_autocomplete_edit_text");
	By select_Location=By.id("com.ongo.wanafood:id/places_autocomplete_prediction_secondary_text");
	By location_Show=By.id("com.ongo.wanafood:id/lvLocationClick");
	
	
	
	public void nav_HomePage() throws Exception {
		try {
			click(login.sideMenu);
			click(home_Link);
			gettextfromapp(login.home_Val);
			System.out.println(text22);
			System.out.println(readData.testDataValue.get("ValidationCheckhomeage"));
			Assert.assertEquals(text22,"Search For Restaurants and Food");
			readData.addStepDetails("nav_HomePage", "Should navigate to home page from Profile", "As per Expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("nav_HomePage", "Should navigate to home page from Profile", "Not As per Expected", "Fail", "Y");

		}
		
		
		
	}
	public void homepage_Elements_Val() throws Exception {
		try {
			scrollup();
			gettextfromapp(homepage_layout);
			System.out.println(text22);
			Assert.assertEquals(text22, readData.testDataValue.get("ValidationCheckhomeage"));
			gettextfromapp(viewMenu_button);
			Assert.assertEquals(text22,"View Menu");
			readData.addStepDetails("homepage_Elements_Val", "Should validate home page elements", "As per Expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("homepage_Elements_Val", "Should validate home page elements", "Not As per Expected", "Fail", "Y");

		}

		
		
	}
	public void homepage_LocationChange() throws Exception {
		try {
			click(changeLoc_button);
			type(address_Change, readData.testDataValue.get("AddressName"));
			click(select_Location);
			Thread.sleep(3000);
			gettextfromapp(location_Show);
			System.out.println(text22);
			if(text22.contains("Ameerpet")) {
				System.out.println("Pass");
			}
			readData.addStepDetails("homepage_LocationChange", "Should select proper location", "As per expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("homepage_LocationChange", "Should select proper location", "Not As per expected", "Fail", "Y");

		}
		
		
		
		
	}

}
