package testcases;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
//import com.relevantcodes.extentreports.LogStatus;
//import com.relevantcodes.extentreports.LogStatus;
//import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import utilities.BaseClass;
import utilities.CommonUtils;
import utilities.Constants;
import utilities.DataProviders;
import utilities.DataReader;
import utilities.ExcelReader;

public class FlipBoardCopyTest extends BaseClass {

	// @Test(priority=1,dataProviderClass=DataProviders.class,dataProvider="testcase1")

	@Test(priority = 1)
	public static void testcase1() throws InterruptedException, IOException {

		Hashtable<String, List<String>> data = DataReader.getMultipleRowFromXls("FlipBoardSuite.xlsx", "TestCases");

		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\FlipBoardSuite.xlsx";
		ExcelReader reader = new ExcelReader(path);

		String runmode = reader.getCellData("TestCases", Constants.secondrow, Constants.secondrow);
		// reader.setCellData("TestCases",Constants.secondrow,Constants.secondrow,"PASS");

		int rowcount = reader.getRowCount("TestCases");
		System.out.println("Number of rows " + rowcount);
		try {
			if (runmode.equals("Y")) {

				test = extent.createTest("TestCase1");
				test.log(Status.PASS, "Test Started");
				driver.findElement(By.id("kmg.android.mat:id/edtEmailId"))
						.sendKeys(data.get("username").get(Constants.firstrow));
				Thread.sleep(3000);

				Actions action = new Actions(driver);
				action.sendKeys(Keys.ENTER).perform();

				driver.findElement(By.id("kmg.android.mat:id/edtPassword"))
						.sendKeys(data.get("Password").get(Constants.firstrow));

				driver.findElement(By.id("kmg.android.mat:id/btnSignIn")).click();

				System.out.println("TestCase1 Passed Successfully Logged in");
				test.log(Status.PASS, "User logged In successfully");
				test.log(Status.PASS, "Create user record Passed");
				/*
				 * long second=System.currentTimeMillis(); TakesScreenshot
				 * srcshot=((TakesScreenshot)driver); File
				 * srcfile=srcshot.getScreenshotAs(OutputType.FILE); String
				 * imagePath=System.getProperty("user.dir")+"\\screenshot\\image_"+second+
				 * ".png"; File destFile=new File(imagePath); FileUtils.copyFile(srcfile,
				 * destFile);
				 * 
				 * String image=CommonUtils.captureScreenshots();
				 * test.addScreenCaptureFromPath(image); test.log(Status.PASS, image ,null);
				 */

				// System.out.println("Could not navigated to HomePage");
				// test.log(Status.FAIL,
				// test.addScreenCaptureFromPath(CommonUtils.captureScreenshots()));

				// Click Menu Icon
				driver.findElement(By.id("kmg.android.mat:id/imgSliderMenuIcon")).click();

				// Click Reminder Tab
				driver.findElementByAndroidUIAutomator(
						"UiSelector().className(\"android.widget.TextView\").text(\"Reminders\")").click();
				// String image1=CommonUtils.captureScreenshots();

				// test.addScreenCaptureFromPath(image1);
				// Click AddNew Button
				driver.findElement(By.id("kmg.android.mat:id/btnAddNew")).click();

				driver.findElement(By.id("kmg.android.mat:id/edtMedication"))
						.sendKeys(data.get("Medication Name").get(Constants.firstrow));
				driver.findElement(By.id("kmg.android.mat:id/btnWed")).click();

				driver.findElement(By.id("kmg.android.mat:id/imgCalEnd")).click();
				driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.view.View\").text(\"30\")")
						.click();

				driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").text(\"OK\")")
						.click();
				driver.findElement(By.id("kmg.android.mat:id/btnOk")).click();
				driver.findElement(By.id("android:id/button3")).click();

				driver.findElement(By.id("kmg.android.mat:id/imgSliderMenuIcon")).click();
				driver.findElementByAndroidUIAutomator(
						"UiSelector().className(\"android.widget.TextView\").text(\"Logout\")").click();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Message Tab Script
	// @Test(priority=2,dataProviderClass=DataProviders.class,dataProvider="testcase2")

	@Test(priority = 2)
	public static void testcase2() throws InterruptedException {

		Hashtable<String, List<String>> data = DataReader.getMultipleRowFromXls("FlipBoardSuite.xlsx", "TestCases");

		// ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
		// DataUtil.checkExecution("FlipBoardSuite", "testcase2", data.get(1), excel);

		test = extent.createTest("TestCase2");
		test.log(Status.PASS, "Test Started");
		driver.findElement(By.id("kmg.android.mat:id/edtEmailId"))
				.sendKeys(data.get("username").get(Constants.secondrow));
		Thread.sleep(3000);

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();

		driver.findElement(By.id("kmg.android.mat:id/edtPassword"))
				.sendKeys(data.get("Password").get(Constants.secondrow));

		driver.findElement(By.id("kmg.android.mat:id/btnSignIn")).click();

		System.out.println("TestCase2 Passed Successfully Logged in");
		test.log(Status.PASS, "TestCase2 Passed");

		// Click Menu Icon
		driver.findElement(By.id("kmg.android.mat:id/imgSliderMenuIcon")).click();
		// driver.findElement(By.id("kmg.android.mat:id/txtSliderMenuItem")).click();
		driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"Messages\")")
				.click();
		driver.findElement(By.id("kmg.android.mat:id/btnNewMsg")).click();
		driver.findElement(By.id("kmg.android.mat:id/edtSubject"))
				.sendKeys(data.get("Subject").get(Constants.secondrow));
		driver.findElement(By.id("kmg.android.mat:id/edtMsgBody"))
				.sendKeys(data.get("Message").get(Constants.secondrow));
		driver.findElement(By.id("kmg.android.mat:id/btnSend")).click();
		driver.findElement(By.id("android:id/button3")).click();
		driver.findElement(By.id("kmg.android.mat:id/btnReply")).click();
		driver.findElement(By.id("kmg.android.mat:id/edtMsgBody")).sendKeys("Hello");
		driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").text(\"Reply\")")
				.click();
		driver.findElement(By.id("android:id/button3")).click();

		/*
		 * Boolean flag = logout();
		 * 
		 * if (flag) { System.out.println("Logged Out Successfully");
		 * test.log(Status.PASS, "User Logged Out Now"); } else {
		 * System.out.println("Couldnt logged out"); test.log(Status.PASS,
		 * "Could not logged out" ); }
		 */
	}
}
