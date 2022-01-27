package utilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;
//import com.relevantcodes.extentreports.LogStatus;

import extentlisteners.HighLevelReport;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass extends HighLevelReport {

	public static AndroidDriver<WebElement> driver;

	@BeforeSuite
	public void generateHTMLReport() {
		AppiumServer.start();

		HighLevelReport.generateReport();
		startEnv();
	}

	@AfterSuite
	public void saveReport() {
		extent.flush();

	}

	public void startEnv() {
		try {

			File app = new File("C:\\Users\\DELL\\eclipse-workspace\\Appium\\src\\test\\resources\\apps\\TeamH.apk");

			DesiredCapabilities capabilities = new DesiredCapabilities();

			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "android");
			capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));

			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*public static String getscreenshot(WebDriver driver, String screenshotName) {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot ts = ((TakesScreenshot) driver);

		File source = ts.getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir") + "/screenshot/" + screenshotName + dateName + ".png";

		File finalDestination = new File(destination);
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return destination;
	}
*/
	
	  public static String captureScreenshots(ITestResult result) {
	 
	 
	  String imagePath="";
	  try {
	   if(result.getStatus()==ITestResult.SUCCESS) {
	     long second=System.currentTimeMillis(); 
	     TakesScreenshot srcshot=((TakesScreenshot)driver); 
	      File srcfile=srcshot.getScreenshotAs(OutputType.FILE);
	      imagePath=System.getProperty("user.dir")+"\\screenshot\\Passimage_"+second+".png"; 
	      File destFile=new File(imagePath); FileUtils.copyFile(srcfile,destFile); 
	      //test.log(Status.FAIL, test.addScreenCapture(BaseClass.captureScreenshots(driver,result.getName())));
	  //test=test.addScreenCaptureFromPath(imagePath, "");
	// test.log(Status.PASS, "");
	 } 
	  } catch (Exception e)
	   { e.printStackTrace();
	   }
	   
	  return imagePath;
	 
	} 
	 
	
/*	@AfterMethod

	public void tearDown(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {

			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName());
			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable());
			String screenshotPath = BaseClass.getscreenshot(driver, result.getName());
		   test.addScreenCaptureFromPath( screenshotPath);
		   
		   test.log(Status.FAIL, "Wrong Password"); 
			
			
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "TEST CASE SKIPPED IS " + result.getName());
		}

		else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.FAIL, "TEST CASE PASSED IS " + result.getName());
		}
			
			
	}*/

	@AfterSuite
	public void stopServer()
	{
		
		
		AppiumServer.stop();
	}

	
	}

	