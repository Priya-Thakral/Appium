package utilities;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServer {
	
	public static AppiumDriverLocalService service;
	
	public static void start(){
		
		// starting the Appium server code

		/* service = AppiumDriverLocalService.buildService(
				new AppiumServiceBuilder().usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
				.withAppiumJS(new File("C:\\Users\\DELL\\Downloads\\Appium-windows-1.20.2\\resources\\app\\node_modules\\appium\\build\\lib\\main.js"))
				.withLogFile(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\logs\\log.txt"))
				.withArgument(GeneralServerFlag.LOCAL_TIMEZONE));
				service.start();*/
				
				
				 service = AppiumDriverLocalService.buildService( new
					      AppiumServiceBuilder().usingDriverExecutable(new File(
					      "C:\\Program Files\\nodejs\\node.exe")) .withAppiumJS(new File(
					    		  "E:\\Automation Material\\Appium Notes\\Appium-windows-1.20.2\\resources\\app\\node_modules\\appium\\build\\lib\\main.js"))
					       .withIPAddress("127.0.0.1").usingAnyFreePort());
				 
				 service.start();
				 
				
				//.withAppiumJS(new File("C:\\Users\\way2automation\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\build\\lib\\main.js"))
				
				//C:\\Users\\DELL\\AppData\\Local\\Android\\Sdk\\tools\\bin\\uiautomaterviewer.bat
	}
	
	
	public static void stop(){
		
		service.stop();
		
	}

}
