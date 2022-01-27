package testcases;

import java.util.List;

import org.testng.annotations.Test;

import allPages.DashboardPage;
import allPages.LoginPage;
import utilities.BaseClass;
import utilities.DataProviders;

public class DashboardTest extends BaseClass{
	
	
	@Test(priority=1,dataProviderClass=DataProviders.class,dataProvider="testcase2")
	public void testDashboard(List<String> list) throws Exception
	{
		
		
		/*LoginPage login=new LoginPage();
		login.enterUserName(list.get(2));
		login.enterPassword(list.get(3));
		login.clickonloginButton();*/
		

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
