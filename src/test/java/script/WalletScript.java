package script;

import org.testng.annotations.Test;

import components.Wallet;
import utility.BaseClass;

public class WalletScript extends BaseClass {
	Wallet wallet=new Wallet();
  @Test(description="Verify the Wallet Functionality")
  public void f() throws Exception  {
	  wallet.wallet_Amount_Verify();
	  wallet.refer_validation();
	  wallet.userWallet_Debit_Val();
	  wallet.credit_Val();
	  
	  
  }
}
