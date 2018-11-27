import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class AndroidUiAutomator extends FirstDemo {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//when check for attribute value 
		//driver.findElementByAndroidUIAutomator("attrubutes(\"value\")").click();
		// " "(doublecott) inside " " (doublecott) not accepted in java
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//when u check for property 
		//validate clickable feature for all option
		//driver.findElementByAndroidUIAutomator("newUiSelector().property(true)");
		
	     System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	  
		
	}

}

		
		
		
		
		
		