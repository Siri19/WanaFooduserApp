package components;

import org.openqa.selenium.By;

import utility.BaseClass;

public class AddressSelectionFunctionality extends BaseClass {
	By address_Click=By.id("com.ongo.wanafood:id/rlAddress");
	By address_Val=By.id("com.ongo.wanafood:id/textview_add_address");
	By confirm=By.id("com.ongo.wanafood:id/textview_save");
	By address_Add=By.id("com.ongo.wanafood:id/button_add_service");
	By address_Type=By.id("android:id/text1");
	By address=By.id("com.ongo.wanafood:id/edt_dialog_address_data");
	By current_AddressConfirm=By.id("com.ongo.wanafood:id/tv_confirm");
	By name_Field=By.id("com.ongo.wanafood:id/etPocName");
	By phone_Field=By.id("com.ongo.wanafood:id/etPocPhoneNo");
	By doorNo=By.id("com.ongo.wanafood:id/etPocDno");
	By street=By.id("com.ongo.wanafood:id/etPocStreet");
	By landmark=By.id("com.ongo.wanafood:id/etPocLandMark");
	By save=By.id("com.ongo.wanafood:id/btn_edt_address_submit");
	By selected_Address_Val=By.id("com.ongo.wanafood:id/tv_list_address_data");
	By select_Box=By.id("com.ongo.wanafood:id/iv_list_address_selector");
	By confirm1=By.id("com.ongo.wanafood:id/textview_save");
	By cart_Address_Val=By.id("com.ongo.wanafood:id/tvAddress");
	By home=By.xpath("//android.widget.CheckedTextView[@text='Office']");
   //	android:id/text1
	public void nav_AddressPage() throws Exception {
	  try {
		scroll_Down1();
		  click(address_Click);
		  gettextfromapp(address_Val);
		  System.out.println(text22);
		  if(text22.equalsIgnoreCase("Add Address")) {
			  System.out.println(text22+"Pass");
		  }
			readData.addStepDetails("nav_AddressPage", "Should Navigate to Address Page", "As per Expected", "Pass", "N");

	} catch (Exception e) {
		readData.addStepDetails("nav_AddressPage", "Should Navigate to Address Page", "Not As per Expected", "Fail", "Y");

	}
	  
	}
	public void select_Address() throws Exception {
		try {
			click(address_Add);
			click(address_Type);
			Thread.sleep(3000);
			click(home);
			click(address);
			click(current_AddressConfirm);
			scrollup();
			type(name_Field, readData.testDataValue.get("Name"));
			pressEnterKey();
			type(phone_Field, readData.testDataValue.get("MobileNumber"));
			pressEnterKey();
			type(doorNo, readData.testDataValue.get("D.no"));
			pressEnterKey();
			type(street, readData.testDataValue.get("Street"));
			pressEnterKey();
			type(landmark, readData.testDataValue.get("LandMark "));
			pressEnterKey();
			scrollup();
			click(save);
			gettextfromapp(selected_Address_Val);
			System.out.println(text22);
			if(text22.equalsIgnoreCase("8-3-318/6/B/13/14, Ali Nagar, Sai Sarathi Nagar, Padala Ramareddy Colony, Yella Reddy Guda, Hyderabad, Telangana 500073, India")) {
				System.out.println("Pass");
			}
			
			click(select_Box);
			click(confirm1);
			gettextfromapp(cart_Address_Val);
			System.out.println(text22);
			if(text22.equalsIgnoreCase("8-3-318/6/B/13/14, Ali Nagar, Sai Sarathi Nagar, Padala Ramareddy Colony, Yella Reddy Guda, Hyderabad, Telangana 500073, India")) {
				System.out.println("Pass");
			}
		
			readData.addStepDetails("select_Address", "Address Select Fubctionality should work properly", "As per Expected", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("select_Address", "Address Select Fubctionality should work properly", "Not As per Expected", "Fail", "Y");

		}
		
		
		
		
		
		
	}
}