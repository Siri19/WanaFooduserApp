package components;

import org.openqa.selenium.By;

import utility.BaseClass;

public class AlertsFunctionality extends BaseClass {
	By back_Wallet=By.className("android.widget.ImageButton");
	By home_Order=By.id("com.ongo.wanafood:id/imgHome");
	By sideMenu=By.id("com.ongo.wanafood:id/imgHam");
	By alerts_Link=By.xpath("//android.widget.CheckedTextView[@text='Alerts']");
	//com.ongo.wanafood:id/design_menu_item_text
	By alertsPage_Val=By.id("com.ongo.wanafood:id/tvName");
	By notification_Val=By.id("com.ongo.wanafood:id/tvMessage");
	public void nav_AlertsPage() throws Exception {
		try {
			Thread.sleep(3000);
			click(back_Wallet);
			click(home_Order);
			click(sideMenu);
			Thread.sleep(3000);
			click(alerts_Link);
			gettextfromapp(alertsPage_Val);
			System.out.println(text22);
			if(text22.equalsIgnoreCase("Alerts")) {
				System.out.println("Pass");
			}
			readData.addStepDetails("nav_AlertsPage", "Should navigate alerts page", "As per expected", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("nav_AlertsPage", "Should navigate alerts page", "Not As per expected", "Fail", "Y");

		}
		
		
	}
	public void alertsNotification_Val() throws Exception {
		try {
			gettextfromapp(notification_Val);
			System.out.println(text22);
			if(text22.contains("New order placed your order id is ")) {
				System.out.println("Pass");
			}
			readData.addStepDetails("alertsNotification_Val", "Should validate the notification msg", "As per expected", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("alertsNotification_Val", "Should validate the notification msg", "Not As per expected", "Fail", "Y");

		}

	}

}
