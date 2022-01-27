package allPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.BaseClass;

public class LoginPage extends BaseClass {
	
	
	
	//@FindBy(id="kmg.android.mat:id/edtEmailId")
	
	@FindBy(id="kmg.android.mat:id/edtEmailId")
	public WebElement usernametxtbox;
	
	@FindBy(id="kmg.android.mat:id/edtPassword")
	public WebElement passwordtxtbox;
	
	

	//@FindBy(className="android.widget.Button")
	@FindBy(id="kmg.android.mat:id/btnSignIn")
	public WebElement loginbutton;
	
	
		public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	/*public LoginPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}*/
	
	public void enterUserName(String username)
	{
		
		usernametxtbox.sendKeys(username);
		
	}
	
	
	public void enterPassword(String password)
	{
		
		
		
		passwordtxtbox.sendKeys(password);
		
	}
	
	
	public void clickonloginButton()
	{
		
		
		
		try {
			loginbutton.click();
			Thread.sleep(15000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	

	/*public WebElement getusernametxtbox() {
		return usernametxtbox;
	}

	public WebElement getpasswordtxtbox() {
		return passwordtxtbox;
	}

	public WebElement getloginbutton() {
		return loginbutton;
	}
	
	*/
	

}
