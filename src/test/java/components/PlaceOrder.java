package components;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import org.openqa.selenium.By;

import utility.BaseClass;

public class PlaceOrder extends BaseClass {
	By payCash_button=By.id("com.ongo.wanafood:id/tvPlaceOrder");
	By COD_button=By.id("com.ongo.wanafood:id/cashBtn");
	By amount_Val=By.id("com.ongo.wanafood:id/tvServiceCostdetails");
	By order_Val=By.id("com.ongo.wanafood:id/tvName");
	By orderId_Val=By.id("com.ongo.wanafood:id/orderId");
	By deliveryStatus_Val=By.id("com.ongo.wanafood:id/statusTv");
	By forward_Arrow=By.id("com.ongo.wanafood:id/orders_iv");
	By item_Val=By.id("com.ongo.wanafood:id/tvItemFullPrice");
	By paymentMode_Val=By.id("com.ongo.wanafood:id/tvPaymentMode");
	By orderTotal=By.id("com.ongo.wanafood:id/tvTotalAmount");
	By delivery_Address_Val=By.id("com.ongo.wanafood:id/tvAddress");
	By trackOrder_Status=By.id("com.ongo.wanafood:id/tvRodTrackDate");
	By kichen=By.id("com.ongo.wanafood:id/tvKitchen");
	By preparing=By.id("com.ongo.wanafood:id/tvPreparing");
	By pickupstart=By.id("com.ongo.wanafood:id/tvIntransist");
	By pickUpEnd=By.id("com.ongo.wanafood:id/tvDelivery");
	By contact_Link=By.id("com.ongo.wanafood:id/tvCancelOrder");
	
	By contact_Permission_Confirm=By.id("com.android.packageinstaller:id/permission_allow_button");
	By phone_Icon=By.id("android.view.View");
	By callFailed=By.id("android:id/alertTitle");
	By callfail_Confirm=By.id("android:id/button1");
	By wallet_Apply_Box=By.id("com.ongo.wanafood:id/checkBox1");
	By wallet_Pop_Val=By.id("com.ongo.wanafood:id/tvWalletamountzero");
	By wallet_Amount_Confirm=By.id("com.ongo.wanafood:id/tvWalletOk");

	By cancel=By.id("android:id/button2");

	
	public void placeOrder_COD() throws Exception {
		try {
			click(wallet_Apply_Box);
			click(wallet_Amount_Confirm);
			scrollup();
			click(payCash_button);
			gettextfromapp(amount_Val);
			System.out.println(text22);
			if(text22.equalsIgnoreCase("Your Total amount to be Paid is 313/-")) {
				System.out.println(text22+" :Your Total amount to be Paid is 313/-");
			}
			click(COD_button);
			Thread.sleep(3000);
			gettextfromapp(order_Val);
			System.out.println(text22);
			if(text22.equalsIgnoreCase("Orders")) {
				System.out.println(text22+":Pass ");
			}
			readData.addStepDetails("placeOrder_COD", "Should navigate to Orders Page", "As per expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("placeOrder_COD", "Should navigate to Orders Page", "As per expected", "Pass", "Y");
	
		}
		
		
		//click(locator);
		
	}
	public void placeOrder_Val() throws Exception {
	  try {
		
		  
		  gettextfromapp(deliveryStatus_Val);
		  System.out.println(text22);
		  if(text22.equalsIgnoreCase("Yet To Accept")) {
			  System.out.println(text22+":Pass");
		  }
		 click(forward_Arrow);
		 gettextfromapp(item_Val);
		 System.out.println(text22);
		 if(text22.equalsIgnoreCase("₹300")) {
			 System.out.println(text22+"::Pass");
		 }
		 scrollup();
		gettextfromapp(paymentMode_Val);
		System.out.println(text22);
		if(text22.equalsIgnoreCase("COD")) {
			System.out.println(text22+":Pass");
		}
		gettextfromapp(orderTotal);
		System.out.println(text22+":Pass");
		if(text22.equalsIgnoreCase("₹313.0")) {
			System.out.println(text22+":Pass");
		}
		scrollup();
		gettextfromapp(delivery_Address_Val);
		System.out.println(text22);
		
			if(text22.equalsIgnoreCase("KRB Towers Jubliee Enclave, Jubilee Enclave, HITEC City, Hyderabad, Telangana 500081, India")) {
				System.out.println(text22+":Pass");
			}
			
			readData.addStepDetails("placeOrder_Val", "all the details should be validate", "As per expected", "Pass", "Y");
	} catch (Exception e) {
		readData.addStepDetails("placeOrder_Val", "all the details should be validate", "Not As per expected", "Fail", "Y");

	}
	}
	
	public void trackOrderStatus() throws Exception {
		try {
			click(trackOrder_Status);
			gettextfromapp(kichen);
			System.out.println(text22);
			if(text22.equalsIgnoreCase("Kitchen")) {
				System.out.println(text22+"Pass");
			}
			gettextfromapp(preparing);
			System.out.println(text22);
			if(text22.equalsIgnoreCase("Preparing")) {
				System.out.println(text22+"Pass");
			}
			gettextfromapp(pickupstart);
			System.out.println(text22);
			if(text22.equalsIgnoreCase("Pick Up Start")) {
				System.out.println(text22+"Pass");
			}
			gettextfromapp(pickUpEnd);
			System.out.println(text22);
			if(text22.equalsIgnoreCase("Pick Up End")) {
				System.out.println(text22+"Pass");
			}
			readData.addStepDetails("trackOrderStatus", "Should show all the needed fields", "As per expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("trackOrderStatus", "Should show all the needed fields", "As per expected", "Fail", "Y");

		}
		
		
		
	}
	public void contact_Support() throws Exception {
		try {
			gettextfromapp(contact_Link);
			System.out.println(text22);
			if(text22.equalsIgnoreCase("Contact support team")) {
				System.out.println("Pass");
			}
			click(contact_Link);
			click(contact_Permission_Confirm);
			click(contact_Link);
			click(cancel);
			/*
			 * click(phone_Icon); gettextfromapp(callFailed); System.out.println(text22);
			 * if(text22.
			 * equalsIgnoreCase("Call failed. Unable to connect to mobile phone network."))
			 * { System.out.println("Pass"); } click(callfail_Confirm); Thread.sleep(3000);
			 * gettextfromapp(contact_Link); System.out.println(text22);
			 * if(text22.equalsIgnoreCase("Contact support team")) {
			 * System.out.println("Pass"); }
			 */
			readData.addStepDetails("contact_Support", "Contact support functionalities should work properly", "As per expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("contact_Support", "Contact support functionalities should work properly", "Not As per expected", "Fail", "Y");
		}
		
		
	}
	
	
	

}
