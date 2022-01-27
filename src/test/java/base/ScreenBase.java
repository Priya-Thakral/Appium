package base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import utilities.CommonUtils;

public class ScreenBase extends CommonUtils{
	
	
	//public static AppiumDriver<MobileElement> driver=null;
	public WebDriverWait wait;
	
	//screen base constructor
	
	/*  public ScreenBase(AppiumDriver<MobileElement> driver) {
	  
	  this.driver=driver; }
	 
	*/
	public void hideKeyboard() {
		
		
		driver.hideKeyboard();
		
		
	}
	
	/*public void enter() {
		
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		
	}*/
	
	//Helper Method to enter data into a field	
		public void enterbox(WebElement textBox, String textToBeEntered) {
			textBox.sendKeys(textToBeEntered);
		}
		
		

		//Helper Method to Click on the element 
		public void clickOnElement(WebElement Clicked) {
			Clicked.click();

		}
		
		//Helper Method to handle the click using Actions class
		
		
	    public void HandleClickAction(WebElement element) {
		Actions action=new Actions(driver);
        action.sendKeys("Some text").sendKeys(Keys.ENTER).build().perform();
		}
		

}
