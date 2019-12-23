package script;

import org.testng.annotations.Test;

import components.AboutUs;
import utility.BaseClass;

public class AboutusScript extends BaseClass {
	AboutUs about=new AboutUs();
  @Test(description="Verifying the about functionalty")
  public void f() throws Exception {
	  about.nav_AboutPage();
	  
  }
}
