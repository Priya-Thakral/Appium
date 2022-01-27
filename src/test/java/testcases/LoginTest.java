package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import allPages.DashboardPage;

//import com.relevantcodes.extentreports.LogStatus;

import allPages.LoginPage;
import utilities.BaseClass;
import utilities.CommonUtils;
import utilities.DataProviders;

public class LoginTest extends BaseClass {
	
	public LoginTest() {
		PageFactory.initElements(driver, this);
	}
	
	
	//LoginBL lbl;

	
	@Test(priority=1,dataProviderClass=DataProviders.class,dataProvider="testcase1")
	
	/*
	LoginPage login=new LoginPage();
	login.enterUserName(list.get(2));
	login.enterPassword(list.get(3));
	System.out.println("Login ");
	//login.clickonloginButton();
	*/
	public static void testcase1(List<String> data) throws InterruptedException  {
		
		
		
    driver.findElement(By.id("kmg.android.mat:id/edtEmailId")).sendKeys(data.get(2));
	Thread.sleep(3000);
	
	Actions action = new Actions(driver);
	action.sendKeys(Keys.ENTER).perform();
	
	driver.findElement(By.id("kmg.android.mat:id/edtPassword")).sendKeys(data.get(3));
	
	driver.findElement(By.id("kmg.android.mat:id/btnSignIn")).click();
	driver.findElement(By.id("kmg.android.mat:id/btnSignIn")).click();
	System.out.println("Login sucess ");
	}
	
	@Test(priority=2,dataProviderClass=DataProviders.class,dataProvider="testcase2")
	
		
    public void Dashboard(List<String> list) throws Exception {
	DashboardPage page=new DashboardPage();
	
	page.ClickMatIcon();
	System.out.println("DashboardTest2");
	page.ClickReminder();
	page.clickonAddNewButton();
	page.clickonMedicationButton();
	page.clickonCalenderButton();
	page.clickonDate();
	page.clickonOkButton();
    page.clickonOk2Button();
	page.clickonOk3Button();
	
	
	}
	}
	
	


	
	

