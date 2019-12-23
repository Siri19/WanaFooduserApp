package components;

import org.openqa.selenium.By;
import org.testng.Assert;

import objectRepository.WonnaFood_Customer_Locators;
import utility.BaseClass;

public class ProfileFunctionality extends BaseClass {
	LoginFunctionality login=new LoginFunctionality();
	By profile_TextVal=By.id("com.ongo.wanafood:id/tvName");
	By save_Button=By.id("com.ongo.wanafood:id/save");
	By last_name=By.id("com.ongo.wanafood:id/lastName");
	public void nav_ProfilePage() throws Exception {
		try {
			type(login.phoneNumber_Enter, readData.testDataValue.get("PhoneNumber"));
			mobile_Clear(login.password_Enter);
			type(login.password_Enter, readData.testDataValue.get("Password"));
			click(login.signIn_Button);
			Thread.sleep(3000);
			click(login.sideMenu);
			click(login.profile_Image);
			gettextfromapp(profile_TextVal);
			System.out.println(text22);
			Assert.assertEquals(text22, readData.testDataValue.get("ValidationCheck"));
			readData.addStepDetails("nav_ProfilePage", "Should Navigate to Profile Page", "As per Expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("nav_ProfilePage", "Should Navigate to Profile Page", "Not As per Expected", "Fail", "Y");

		}
		
		
		
	}
	public void edit_Fun() throws Exception {
		try {
			scrollup();
			type(last_name, readData.testDataValue.get("LastName"));
			click(save_Button);
			gettextfromapp(last_name);
			scrollup();
			System.out.println(text22);
			System.out.println(readData.testDataValue.get("ValidationCheck"));
			Assert.assertEquals(text22, readData.testDataValue.get("ValidationCheck"));
			readData.addStepDetails("edit_Fun", "Should work properly", "As per Expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("edit_Fun", "Should work properly", "Not As per Expected", "Fail", "Y");

		}

		
		
	}
	
	

}
