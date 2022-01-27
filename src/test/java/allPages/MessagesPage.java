package allPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class MessagesPage extends BaseClass{
	
	
	@FindBy(id="kmg.android.mat:id/imgSliderMenuIcon")
	public WebElement MatIcon;
	
	@FindBy(id ="kmg.android.mat:id/txtSliderMenuItem")
	public WebElement MessageButton;
	
	@FindBy(id="kmg.android.mat:id/btnNewMsg")
	public WebElement AddNewMessage;
	
	@FindBy(id="kmg.android.mat:id/edtSubject")
	public WebElement AddSubject;
	
	

	@FindBy(id="kmg.android.mat:id/edtMsgBody")
	public WebElement AddMessage;
	
	
	@FindBy(className="kmg.android.mat:id/btnSend")
	public WebElement SendButton;
	
	
	@FindBy(id="android:id/button3")
	public WebElement OkButton;
	
	@FindBy(id="kmg.android.mat:id/btnReply")
	public WebElement ReplyButton;
	
	
	@FindBy(id="kmg.android.mat:id/edtMsgBody")
    public WebElement EnterMessage;
	
	@FindBy(id="kmg.android.mat:id/btnReply")
    public WebElement Reply2Button;
	
	
	@FindBy(id="android:id/button3")
	public WebElement Ok2Button ;
	
	public MessagesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickMatIcon()
	{
		
		MatIcon.click();
	}
	
	
	public void ClickMessageButton()
	{
		
		
		
		MessageButton.click();
		
	}
	
	
	public void clickonAddNewMessage()
	{
		
		
		
		AddNewMessage.click();
		
	}
	
	public void clickonAddSubject(String Subject)
	{
		
		
		
		AddSubject.sendKeys(Subject);
		
	}
	
	public void clickonAddMessage(String Message)
	{
		
		
		
		AddMessage.sendKeys(Message);
		
	}
	
	public void clickonSendButton()
	{
		
		
		
		SendButton.click();
		
	}
	
	public void clickonOkButton()
	{
		
		
		
		OkButton.click();
		
	}
	
	
	
	public void clickonReplyButton()
	{
		
		
		
		ReplyButton.click();
		
	}
	
	public void clickonMessageButton()
	{
		
		
		
		EnterMessage.click();
		
	}
	
	
	public void clickonReply2Button()
	{
		
		
		
		Reply2Button.click();
		
	}
	public void clickonOk2Button()
	{
		
		
		
	Ok2Button.click();
		
	}
	
	
	
	
	
	
	
}
