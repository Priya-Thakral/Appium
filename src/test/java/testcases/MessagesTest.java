package testcases;

import java.util.List;

import org.testng.annotations.Test;

import allPages.DashboardPage;
import allPages.LoginPage;
import allPages.MessagesPage;
import utilities.BaseClass;
import utilities.DataProviders;

public class MessagesTest extends BaseClass{
	
	
	
	@Test(priority=1,dataProviderClass=DataProviders.class,dataProvider="testcase3")
	public void testDashboard(List<String> list)
	{
		LoginPage login=new LoginPage();
		login.enterUserName(list.get(2));
		login.enterPassword(list.get(3));
		login.clickonloginButton();
		
		
		
		
		
		MessagesPage message=new MessagesPage();
		message.ClickMatIcon();
		message.ClickMessageButton();
		message.clickonAddNewMessage();
		message.clickonAddSubject(list.get(5));
		message.clickonAddMessage(list.get(6));
		message.clickonSendButton();
		message.clickonOkButton();
		message.clickonReplyButton();
		message.clickonMessageButton();
		message.clickonReply2Button();
		message.clickonOk2Button();
		
		
		
		
		
}
	
	
}



