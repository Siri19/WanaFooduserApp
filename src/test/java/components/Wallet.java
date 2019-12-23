package components;

import org.openqa.selenium.By;

import utility.BaseClass;

public class Wallet extends BaseClass{
	 By sideMenu=By.id("com.ongo.wanafood:id/imgHam");
	 By wallet_Link=By.id("com.ongo.wanafood:id/imgWallet");
	 By wallet_Amount=By.id("com.ongo.wanafood:id/tv_walletCash");
	 By wonna_Amount=By.id("com.ongo.wanafood:id/tv_crashWallet");
	 By referCode=By.id("com.ongo.wanafood:id/refercodetv");
	 By debit_Amount_Val=By.id("com.ongo.wanafood:id/tvReferalAmount");
	 By credit_Val=By.id("com.ongo.wanafood:id/tvReferalAmount");
	 
	 
	 
	 
	 public void wallet_Amount_Verify() throws Exception {
		 try {
			//click(sideMenu);
			 Thread.sleep(3000);
			 click(wallet_Link);
			 gettextfromapp(wallet_Amount);
			 System.out.println(text22);
			 if(text22.equalsIgnoreCase("₹10.0/-")) {
				 System.out.println("Pass");
			 }
			 gettextfromapp(wonna_Amount);
			 System.out.println(wonna_Amount);
			 if(text22.equalsIgnoreCase("₹0.0/-")) {
				 System.out.println("Pass");
			 }
			 readData.addStepDetails("wallet_Amount_Verify", "Wonna amount and wallet amount should be validate", "As per expected", "Pass", "");
		} catch (Exception e) {
			 readData.addStepDetails("wallet_Amount_Verify", "Wonna amount and wallet amount should be validate", "As per expected", "Pass", "");

		}
		 
	 }
	 public void refer_validation() throws Exception {
		 try {
			gettextfromapp(referCode);
			 System.out.println(text22);
			 if(text22.equalsIgnoreCase("WANN4507")) {
				 System.out.println("Pass");
			 }
			readData.addStepDetails("refer_validation", "Should be the Expected Refercode", "As Per Expected", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("refer_validation", "Should be the Expected Refercode", "Not As Per Expected", "Fail", "Y");

		}
	 }
	 
	 public void userWallet_Debit_Val() throws Exception {
		 try {
			gettextfromapp(debit_Amount_Val);
			 System.out.println(text22);
			 if(text22.equalsIgnoreCase("- 60.0")) {
				 
				 System.out.println("Pass");
			 }
				readData.addStepDetails("userWallet_Debit_Val", "Should be the Expected Debit Amount", "As Per Expected", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("userWallet_Debit_Val", "Should be the Expected Debit Amount", "Not As Per Expected", "Fail", "Y");

		}

	 }
	 
	 public void credit_Val() throws Exception {
		 try {
			scrollup();
			gettextfromapp(credit_Val);
			 System.out.println(text22);
			 if(text22.equalsIgnoreCase("+ 100.0")) {
				 System.out.println("Pass");
			 }
			readData.addStepDetails("credit_Val", "Should be the Expected Credit Amount", "As Per Expected", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("credit_Val", "Should be the Expected Credit Amount", "Not As Per Expected", "Fail", "Y");

		}

		 
	 }
   
 

	  
  
}
