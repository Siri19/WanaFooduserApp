package components;

import org.openqa.selenium.By;
import org.testng.Assert;

import objectRepository.WonnaFood_Customer_Locators;
import utility.BaseClass;

public class LoginFunctionality extends BaseClass {
	//WonnaFood_Customer_Locators loc=new WonnaFood_Customer_Locators();
     By phoneNumber_Enter=By.id("com.ongo.wanafood:id/email");
	 By password_Enter=By.id("com.ongo.wanafood:id/password");
	 By signIn_Button=By.id("com.ongo.wanafood:id/email_sign_in_button");
	 By home_Val=By.xpath("//android.widget.TextView[@text='Search For Restaurants and Food']");
	 By logOut_Security=By.id("com.ongo.wanafood:id/tvPositive");
	 By sideMenu=By.id("com.ongo.wanafood:id/imgHam");
	 By logOut_Button=By.xpath("//android.widget.CheckedTextView[@resource-id='com.ongo.wanafood:id/design_menu_item_text'and@text='Logout']");
	 By logOut_Confirm=By.id("com.ongo.wanafood:id/tvPositive");
	 By profile_Image=By.id("com.ongo.wanafood:id/imgUser");
	 By login_Val=By.id("com.ongo.wanafood:id/tvLoginText");
	 By login_Form=By.id("com.ongo.wanafood:id/email_login_form");
	 By login_Button_Val=By.id("com.ongo.wanafood:id/email_sign_in_button");
	 
	 
	 
	 
	 
	public void login_ValidInputs() throws Exception {
		try {
			type(phoneNumber_Enter, readData.testDataValue.get("PhoneNumber"));
			Thread.sleep(2000);
			scrollup();
			type(password_Enter, readData.testDataValue.get("Password"));
			click(signIn_Button);
			Thread.sleep(3000);
			click(logOut_Security);
			//Thread.sleep(3000);
			click(sideMenu);
			Thread.sleep(2000);
			scrollup();
			click(logOut_Button);
			click(logOut_Confirm);
			Thread.sleep(3000);
			gettextfromapp(home_Val);
			System.out.println(text22);
			if(text22.equalsIgnoreCase(readData.testDataValue.get("ValidationMessage"))) {
				System.out.println(readData.testDataValue.get("ValidationMessage"));
			}
			//Assert.assertEquals(text22, readData.testDataValue.get("ValidationMessage"));
			readData.addStepDetails("login_ValidInputs", "Should navigate to Home Page", "As Per Expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("login_ValidInputs", "Should navigate to Home Page", "Not As Per Expected", "Fail", "Y");
	
		}
		
		
	}
	public void nav_LoginPage() throws Exception {
		try {
			Thread.sleep(3000);
			click(sideMenu);			
			click(profile_Image);
			scrollup();
			gettextfromapp(login_Button_Val);
			System.out.println(text22);
			//System.out.println(readData.testDataValue.get("ValidationMessage"));			
			
			Assert.assertEquals(text22,"LOGIN");
			readData.addStepDetails("nav_LoginPage", "Should navigate to Login Page", "As Per Expected", "Pass", "N");
            
		} catch (Exception e) {
			readData.addStepDetails("nav_LoginPage", "Should navigate to Login Page", "Not As Per Expected", "Fail", "Y");

		}
        
        
	}
	
	  public void login_InvalidInputs() throws Exception { 
			
            
		  try {
			type(phoneNumber_Enter,readData.testDataValue.get("PhoneNumber"));
			System.out.println(readData.testDataValue.get("PhoneNumber"));
			  scrollup();
			  type(password_Enter, readData.testDataValue.get("Password"));
			  System.out.println(readData.testDataValue.get("Password"));
			  click(signIn_Button);
			  //scroll_Down();
			  gettextfromapp(login_Button_Val);
				System.out.println(text22);
				//System.out.println(readData.testDataValue.get("ValidationMessage"));			
				
				Assert.assertEquals(text22,"LOGIN");
				//readData.addStepDetails("nav_LoginPage", "Should navigate to Login Page", "As Per Expected", "Pass", "N");
			  
				readData.addStepDetails("login_InvalidInputs", "Should show the proper error message", "As Per Expected", "Pass", "N");
		} catch (Exception e) {           
			readData.addStepDetails("login_InvalidInputs", "Should show the proper error message", "Not As Per Expected", "Fail", "Y");

		}
  
		  
	  
	  }
	  
	  public void login_EmptyPassword() throws Exception {
		  try {
			  Thread.sleep(3000);
			  
			   mobile_Clear(phoneNumber_Enter);
			   type(phoneNumber_Enter,"9000588945");
			   //scrollup();
				//type(password_Enter, readData.testDataValue.get("Password"));
			   Thread.sleep(2000);
				mobile_Clear(password_Enter);
				type(password_Enter,"");

				click(signIn_Button);
				gettextfromapp(login_Button_Val);
				
				System.out.println(text22);
				//System.out.println(readData.testDataValue.get("ValidationMessage"));			
				
				Assert.assertEquals(text22,"LOGIN");
				//readData.addStepDetails("nav_LoginPage", "Should navigate to Login Page", "As Per Expected", "Pass", "N");
					readData.addStepDetails("login_EmptyPassword", "Should show the proper error message", "As Per Expected", "Pass", "N");

		} catch (Exception e) {
			readData.addStepDetails("login_EmptyPassword", "Should show the proper error message", "Not As Per Expected", "Fail", "Y");

		}
		  
		  

			
	  }
	  public void login_EmptyMobileNumber() throws Exception {
		  try {
			  Thread.sleep(3000);
			   mobile_Clear(phoneNumber_Enter);
				type(phoneNumber_Enter,"");

				//type(phoneNumber_Enter,readData.testDataValue.get("PhoneNumber"));
				//scrollup();
				mobile_Clear(password_Enter);
				type(password_Enter, readData.testDataValue.get("Password"));
				
				click(signIn_Button);
				gettextfromapp(login_Button_Val);
				
				System.out.println(text22);
				//System.out.println(readData.testDataValue.get("ValidationMessage"));			
				
				Assert.assertEquals(text22,"LOGIN");
				//readData.addStepDetails("nav_LoginPage", "Should navigate to Login Page", "As Per Expected", "Pass", "N");
					readData.addStepDetails("login_EmptyMobileNumber", "Should show the proper error message", "As Per Expected", "Pass", "N");

		} catch (Exception e) {
			readData.addStepDetails("login_EmptyMobileNumber", "Should show the proper error message", "Not As Per Expected", "Fail", "Y");

		}
		  
	  }
	 
	

}
