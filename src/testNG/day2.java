package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Parameters({"URL"})
	@Test(groups= {"Somke"})
	public void test3(String urlName) {
		System.out.println("Good");
		System.out.println(urlName);
	}

}
