package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan {
	
	@Test(timeOut=4000)
	public void webLoginCar() {
		System.out.println("Web Login car Loan");
	}
	@Test(dependsOnMethods= {"webLoginCar"})
	public void mobileLoginCar() {
		System.out.println("mobile Login car Loan");
	}
	@Parameters({"URL2","URL3"})
	@Test(groups= {"Somke"})
	public void mobileSignInCar(String URL2, String URL3) {
		System.out.println("mobile sign car Loan");
		System.out.println(URL2);
		System.out.println(URL3);
	}
	@Test(enabled=false)
	public void apiLoginCar() {
		System.out.println("api Login car Loan");
	}
	@Test(dataProvider="getData")
	public void login(String Username,String Password) {
		System.out.println(Username);
		System.out.println(Password);
		
	}
	@DataProvider
	public Object[][] getData() {
		//1st combination:- Username & Password
		//2nd :- Username & Password
		//3rd:- Username & Password
		Object[][] data=new Object[3][2];
		//first set of data
		data[0][0]="username1";
		data[0][1]="Password1";
		//second set of data
		data[1][0]="username2";
		data[1][1]="Password2";
		//third set of data
		data[2][0]="username3";
		data[2][1]="Password3";
		
		return data;
		
	}
	

}
