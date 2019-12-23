package script;

import org.testng.annotations.Test;

import components.ReferFunctionality;
import utility.BaseClass;

public class RefereFunctionalityScript extends BaseClass {
	ReferFunctionality refer=new ReferFunctionality();
  @Test(description="Verifying the Refer Functionality")
  public void f() throws Exception {
	  refer.refer_Fun_Val();
  }
}
