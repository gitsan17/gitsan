package myproj;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListernerTest extends BaseClass implements ITestListener {
	ExtentTest test;
	ExtentReports extent1 = ExtentReporterNG.getReportObj();
		
	@Override
	public void onTestStart(ITestResult result) {
	System.out.println(" onTestStart Method started  "+ result.getName());	
	test = extent1.createTest(result.getMethod().getMethodName());
	System.out.println(result.getMethod().getMethodName());
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("onTestSuccess Method passed  "+ result.getName());
	test.log(Status.PASS, "Test Passed");
	}
	
	
	@Override
	public void onTestFailure(ITestResult result){
	test.log(Status.FAIL, "Test Failed");
	test.fail(result.getThrowable()); 
	
    Date d = new Date();
    String timestamp = d.toString().replace(":", "_").replace(" ", "");
	
	  try {
		    captureScreenshot(result.getName());
		   }
		   catch (Exception e) {
		  e.getMessage();// TODO: handle exception
		 }	
	  
	     String path = "C:\\Users\\DELL\\eclipse-workspace\\myproj\\Reports\\" + result.getName()+timestamp + ".jpg";

      test.addScreenCaptureFromPath(path);
	}
	
		
	@Override
	public void onStart(ITestContext contextStart) {	

	}
	
	@Override
	public void onFinish(ITestContext contextFinish) {
	System.out.println("onFinish method finished");
	extent1.flush();
	}

	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("Method failed with certain success percentage"+ result.getName());

	}


	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("Method skipped"+ result.getName());

	}





}
