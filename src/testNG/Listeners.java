package testNG;

import org.testng.ITestListener;

public class Listeners implements ITestListener {
	@Override
	public void onTestSuccess(ITestListener result) {
		System.out.println("Success implemented Listener");
	}
	@Override
	public void onTestFailure(ITestListener result) {
		System.out.println("Failed implementing Listener");
	}

}
