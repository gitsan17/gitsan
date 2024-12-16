package myproj;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {	
	public static ExtentReports getReportObj() {
		  System.out.println( "Inside ExtentReporterNG"); 
		  String path15 = System.getProperty("user.dir") + "\\Reports\\index.html"; 			  
		  ExtentSparkReporter reporter12 = new ExtentSparkReporter(path15);
		  ExtentReports extent = new ExtentReports();
		  extent.setSystemInfo("Tester", "Sankar");		  
		  reporter12.config().setDocumentTitle("Sankar Generated Report");
		  reporter12.config().setReportName("My Results Reports");
		  extent.attachReporter(reporter12);		 
		  return extent;
		 
	}	
}

	