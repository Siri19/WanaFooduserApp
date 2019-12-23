package script;

import org.testng.annotations.Test;

import components.AlertsFunctionality;
import utility.BaseClass;

public class AlertsScript extends BaseClass{
	AlertsFunctionality alert=new AlertsFunctionality();
  @Test(description="Verifying the Alerts Functionality")
  public void f() throws Exception {
	  alert.nav_AlertsPage();
	  alert.alertsNotification_Val();
	  
  }
}
