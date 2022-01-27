package extentlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class HighLevelReport {
	
	
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest test;
	
	
	
	
	public static void generateReport()
	{
		
		
		try {
			
			long time=System.currentTimeMillis();
			String path=System.getProperty("user.dir")+"//Report//Report_"+time+".html";
			htmlReporter=new ExtentHtmlReporter(path);
			
			extent=new ExtentReports();
			extent.attachReporter(htmlReporter);
			String userName=System.getProperty("user.name");
			String osName=System.getProperty("os.name");
			extent.setSystemInfo("OS", osName);
			extent.setSystemInfo("userName", userName);
			extent.setSystemInfo("Env", "QA");
			extent.setSystemInfo("Browser", "Chrome");
			
			htmlReporter.config().setChartVisibilityOnOpen(true);
			htmlReporter.config().setDocumentTitle("Automation Company Report");
			htmlReporter.config().setReportName("Automation Test report");
			htmlReporter.config().setTheme(Theme.STANDARD);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

}
