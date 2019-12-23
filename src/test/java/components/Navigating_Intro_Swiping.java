package components;

import org.testng.Assert;

import objectRepository.WonnaFood_Customer_Locators;
import utility.BaseClass;

public class Navigating_Intro_Swiping extends BaseClass {
	WonnaFood_Customer_Locators loc=new WonnaFood_Customer_Locators();
	//Intoductory Screens Swiping Verification
	public void launch_Wonnafood_CustomerApp() throws Exception {
		 try {
			mobileLaunchPrecondition();
			 click(loc.location_Permission_Access);
			 readData.addStepDetails("launch_Wonnafood_CustomerApp", "App Launched Successfully", "As per Expected", "Pass", "N");

		} catch (Exception e) {
			 readData.addStepDetails("launch_Wonnafood_CustomerApp", "App Launched Successfully", "Not As per Expected", "Fail", "Y");

		}

	}
	public void navigating_Intro_Verification() throws Exception {
		 try {
			 Thread.sleep(3000);
			 introductory_Scrooling(loc.intro_Screen_Size);
			 click(loc.skip_Button);
			 Thread.sleep(2000);
			 gettextfromapp(loc.login_Text_Verification);
			 Assert.assertEquals(text22, readData.testDataValue.get("ValidationMessage"));
			 readData.addStepDetails("navigating_Intro_Verification", "IntroScreensNavigatedSuccessfully", "As per Expected", "Pass", "N");
		} catch (Exception e) {
			 readData.addStepDetails("navigating_Intro_Verification", "IntroScreensNavigatedSuccessfully", "Not As per Expected", "Fail", "Y");
	
		}
		 
		 
	}
	


}
