package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CommonUtils extends BaseClass{
	
	
	public static AppiumDriver<WebElement> driver;
	private static URL serverUrl;
	private static DesiredCapabilities capabilities = new DesiredCapabilities();
	private static String APPIUM_PORT;
	private static int IMPLICIT_WAIT_TIME;
	private static int EXPLICIT_WAIT_TIME;
	private static String BASE_PKG;
	private static String APP_ACTIVITY;
	private static String APP_PATH;
	private static String BROWSER_NAME;
	private static String PLATFORM_NAME;
	private static String PLATFORM_VERSION;
	private static String DEVICE_NAME;
	private static String UDID;
	private static String BUNDLE_ID;
	private static String APP;
	
	private static Properties prop = new Properties();
	private static FileInputStream fis;

	public static void loadAndriodConfProp(String loadPropertyFile) {

		
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties/"+loadPropertyFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		IMPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("implicit.wait"));
		EXPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("explicit.wait"));
		BASE_PKG = prop.getProperty("base.pgk");
		APP_ACTIVITY = prop.getProperty("application.activity");
		APP_PATH = prop.getProperty("application.path");
		BROWSER_NAME = prop.getProperty("base.pgk");
		PLATFORM_NAME = prop.getProperty("platform.name");
		PLATFORM_VERSION = prop.getProperty("platform.version");
		DEVICE_NAME = prop.getProperty("device.name");
		APPIUM_PORT = prop.getProperty("appium.server.port");
	}
	
	//setting android cap
	public static void setAndroidCapabilities()  {
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
		//capabilities.setCapability(CapabilityType.BROWSER_NAME, BROWSER_NAME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);

		
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, BASE_PKG);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY);
		
		
		
	}
	
	
	
	
	public static void loadIOSConfProp(String loadPropertyFile) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void setIOSCapabilities() {
		
		
		
	}
	
	
	public static AppiumDriver<WebElement> getAndroidDriver() {
		
		try {
			serverUrl=new URL("http://localhost:"+APPIUM_PORT+"/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new AndroidDriver<WebElement>(serverUrl,capabilities);
		return driver;
		
	}
	
	
	public static AppiumDriver<WebElement> getIOSDriver() {
		
		
		return driver;
		
	}

	
	public void clickElement(WebElement element)
	{


		try {

			element.click();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}



	public void enterData(WebElement element,String data)
	{

		try {

			element.sendKeys(data);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}


/*	public String getLoginText() {
		return prop.getProperty("loginText");
	}*/
}
