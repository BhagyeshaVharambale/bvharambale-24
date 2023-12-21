package GoogleExample;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUse implements ITestListener {
	public void onTestStart(ITestResult result) {
	    System.out.println("Test Case Started" + result.getName());
	  }

	 
	  public void onTestSuccess(ITestResult result) {
		    System.out.println("Test Case Succeded " + result.getName());
	  }

	  
	  public void onTestFailure(ITestResult result) {
		    System.out.println("Test Case Failed " + result.getName());
	  }
}
