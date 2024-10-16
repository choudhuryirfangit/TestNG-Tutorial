package testNG;

import org.testng.annotations.Test;

public class HomeLoan {
	@Test
	public void webLoginHome() {
		System.out.println("Web Login Home Loan");
	}
	@Test
	public void mobileLoginHome() {
		System.out.println("mobile Login Home Loan");
	}
	@Test(groups= {"Somke"})
	public void apiLoginHome() {
		System.out.println("api Login Home Loan");
	}
	

}
