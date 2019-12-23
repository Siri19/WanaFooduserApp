package components;

import org.openqa.selenium.By;

import utility.BaseClass;

public class ReferFunctionality extends BaseClass {
	By refer_Icon=By.id("com.ongo.wanafood:id/lvInviteFriends");
	By refer_view=By.xpath("//android.view.View[@index='0']");
	By id_Val=By.id("com.android.mms:id/embedded_text_editor");
	By cancel=By.id("android:id/button2");
	By discard=By.id("android:id/button3");
	By wallet_Header_Val=By.id("com.ongo.wanafood:id/app_title_tv");
	public void refer_Fun_Val() throws Exception {
		try {
			click(refer_Icon);
			click(cancel);
			/*
			 * click(refer_view); gettextfromapp(id_Val); System.out.println(text22);
			 * if(text22.equalsIgnoreCase("Wana-Food Referral ID is WANN4507:\r\n" +
			 * "http://wanafood.in/Application/invite?referrer=WANN4507\r\n" +
			 * "Please download app from \r\n" +
			 * " https://play.google.com/store/apps/details?id=com.ongo.wanafood")) {
			 * System.out.println("Pass"); } click(cancel); click(discard);
			 * gettextfromapp(wallet_Header_Val); System.out.println(text22);
			 * if(text22.equalsIgnoreCase("My Wallet")) { System.out.println("Pass"); }
			 */
			readData.addStepDetails("ReferFunctionality", "Should work properly", "As per xexpected", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("ReferFunctionality", "Should work properly", "Not As per xexpected", "Fail", "Y");

		}
		
		
		
		
	}

}
