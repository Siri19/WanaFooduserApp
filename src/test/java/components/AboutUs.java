package components;

import org.openqa.selenium.By;

import utility.BaseClass;

public class AboutUs extends BaseClass {
	By sideMenu=By.id("com.ongo.wanafood:id/imgHam");
	By aboutus_Link=By.id("com.ongo.wanafood:id/design_menu_item_text");
	By aboutPage_Val=By.id("com.ongo.wanafood:id/tvTermsConditions");
	
	public void nav_AboutPage() throws Exception {
		try {
			click(sideMenu);
			scrollup();
			click(aboutus_Link);
			gettextfromapp(aboutPage_Val);
			System.out.println(text22);
			if(text22.equalsIgnoreCase("About Us")) {
				System.out.println(text22+"Pass");
			}
			readData.addStepDetails("nav_AboutPage", "Should navigate to About page", "As per expected", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("nav_AboutPage", "Should navigate to About page", "Not As per expected", "Fail", "Y");

		}
		
	}

}
