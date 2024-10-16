package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	@BeforeSuite
	public void Bfsuit() {
		System.out.println("I will execute before suit");
	}
	@AfterSuite
	public void Afsuit() {
		System.out.println("I will execute after suit");
	}
	@Test(groups= {"Somke"})
	public void test1() {
		System.out.println("Hello");
	}
	@Test
	public void test2() {
		System.out.println("Bye");
	}
	@BeforeTest
	public void bt() {
		System.out.println("I will execute first");
	}
	@AfterTest
	public void at() {
		System.out.println("I will execute last");
	}
	@BeforeMethod
	public void Bfmethod() {
		System.out.println("I will execute before Method");
	}
	@AfterMethod
	public void Afmethod() {
		System.out.println("I will execute after Method");
	}

}
