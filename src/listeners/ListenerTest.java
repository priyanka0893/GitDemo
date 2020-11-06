package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of the test success ="+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The name of the test failed ="+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of the test Skipped ="+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("The name of the test Start ="+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
