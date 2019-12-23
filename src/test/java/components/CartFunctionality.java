package components;

import org.openqa.selenium.By;
import org.testng.Assert;

import utility.BaseClass;

public class CartFunctionality extends BaseClass {
	By viewMenu=By.id("com.ongo.wanafood:id/tvMenu");
	//com.ongo.wanafood:id/tvMenu
	//com.ongo.wanafood:id/tvMenu
	By addCart_Button=By.id("com.ongo.wanafood:id/tvAddToCart");
	By add=By.id("com.ongo.wanafood:id/imgAdd");
	By goto_Cart=By.id("com.ongo.wanafood:id/tvItemCountView");
	By mycart_Val=By.id("com.ongo.wanafood:id/tvStationName");
	By restName_Val=By.id("com.ongo.wanafood:id/tvRestName");
	By prod_Val=By.id("com.ongo.wanafood:id/tvItemName");
	By itemPrice_Val=By.id("com.ongo.wanafood:id/tvItemPrice");
	By payble_Amount=By.id("com.ongo.wanafood:id/tvTotalAmount");
	By apply_Discount=By.id("com.ongo.wanafood:id/lvApplyCoupon");
	By coupon_Page_Val=By.id("com.ongo.wanafood:id/tvAvailableCode");
	By coupon=By.id("com.ongo.wanafood:id/tvCoupDiscount");
	By coupon_Confirm=By.id("com.ongo.wanafood:id/submit_applycpn");
	By coupon_Discount_Val=By.id("com.ongo.wanafood:id/disCoupon");
	By wallet_Apply_Box=By.id("com.ongo.wanafood:id/checkBox1");
	By wallet_Pop_Val=By.id("com.ongo.wanafood:id/tvWalletamountzero");
	By wallet_Amount_Confirm=By.id("com.ongo.wanafood:id/tvWalletOk");
	By wallet_Val=By.id("com.ongo.wanafood:id/tvWalletPrice");
	By sideMenu=By.id("com.ongo.wanafood:id/imgHam");
	By home_Link=By.id("com.ongo.wanafood:id/design_menu_item_text");
	
	public void nav_ProductsView() throws Exception {
		try {
			click(sideMenu);
			click(home_Link);
			Thread.sleep(3000);
			scrollup();
			scrollup();
			scrollup();
			click(viewMenu);
			click(addCart_Button);
			click(add);
			click(goto_Cart);
			gettextfromapp(mycart_Val);
			System.out.println(text22);
			Assert.assertEquals(text22, readData.testDataValue.get("Validation"));
			readData.addStepDetails("nav_ProductsView", "Should Navigate to My cart Page", "As per expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("nav_ProductsView", "Should Navigate to My cart Page", "Not As per expected", "Fail", "Y");

		}
		
		
		
	}
	
	public void rest_Product_Val() throws Exception {
		try {
			gettextfromapp(restName_Val);
			System.out.println(text22);
			Assert.assertEquals(text22, ": Paradise Biryani");
			gettextfromapp(prod_Val);
			System.out.println(text22);
			Assert.assertEquals(text22, "Veg Manchuria");
			readData.addStepDetails("rest_Product_Val", "Should be show related prod and Rest", "As per expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("rest_Product_Val", "Should be show related prod and Rest", "Not As per expected", "Fail", "Y");

			
					}

		
	}
	public void adding_Prod() throws Exception {
		try {
			click(add);
			scrollup();
			gettextfromapp(itemPrice_Val);
			System.out.println(text22);
			Assert.assertEquals(text22, "₹300.0");
			gettextfromapp(payble_Amount);
			System.out.println(text22);
			Assert.assertEquals(text22, "300.0");
			readData.addStepDetails("adding_Prod", "Should show proper Item Price and Payble Price", "As per expected", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("adding_Prod", "Should show proper Item Price and Payble Price", "Not As per expected", "Fail", "Y");

		}

		
		
		
	}
	public void coupon_Dis_Apply() throws Exception {
		try {
			click(apply_Discount);
			gettextfromapp(coupon_Page_Val);
			System.out.println(text22);
			Assert.assertEquals(text22, "AVAILABLE COUPONS");
			click(coupon);
			click(coupon_Confirm);
			scrollup();
			gettextfromapp(coupon_Discount_Val);
			System.out.println(text22);
			Assert.assertEquals(text22, "90.0");
			gettextfromapp(payble_Amount);
			System.out.println(text22);
			Assert.assertEquals(text22, "210.0");
			readData.addStepDetails("coupon_Dis_Apply", "Should apply Coupon Discount Properly", "As per expected", "Pass", "N");

		} catch (Exception e) {
			readData.addStepDetails("coupon_Dis_Apply", "Should apply Coupon Discount Properly", "Not As per expected", "Fail", "Y");

		}
	    
		
		
	}
	public void walletAmount_Apply() throws Exception {
		try {
			click(wallet_Apply_Box);
			gettextfromapp(wallet_Pop_Val);
			System.out.println(text22);
			Assert.assertEquals(text22, " Please refer your friends to get rewards to your wallet");
			click(wallet_Amount_Confirm);
			gettextfromapp(coupon_Discount_Val);
			System.out.println(text22);
			Assert.assertEquals(text22, "0");
			gettextfromapp(wallet_Val);
			System.out.println(text22);
			Assert.assertEquals(text22, "0");
			gettextfromapp(payble_Amount);
			System.out.println(text22);
			Assert.assertEquals(text22, "300.0");
			readData.addStepDetails("walletAmount_Apply", "Should apply Wallet Discount Properly", "As per expected", "Pass", "N");

		} catch (Exception e) {
			readData.addStepDetails("walletAmount_Apply", "Should apply Wallet Discount Properly", "Not As per expected", "Fail", "Y");

		}
		
		
		
	}
	
	

}
