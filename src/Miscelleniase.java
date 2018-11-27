import java.awt.Event;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class Miscelleniase extends FirstDemo {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Animation']").click();
		
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		//For Check The Current Activity Which  I Perform.
	//System.out.println(driver.currentActivity());
		
		//For Checking The types apps Native , Hybrid or WebApps.
	//System.out.println(driver.getContext());
		
		//orantation,, 1-Landscape,2-Potrate
	//System.out.println(driver.getOrientation());
		
		//For Check Mobile  is lock or not 
	//System.out.println(driver.isDeviceLocked());
		
		//for hide keyBoard appeare to disappear keyBoard on screen
		//driver.hideKeyboard(); 
		
		//How to click On Back Button With Appium 

		//use selenium
		 //driver.navigate().back();
		
		
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		//driver.pressKeyCode(AndroidKeyCode.BACK);
        //driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
	}

}
