import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class InheritFirstDemo extends FirstDemo{

	public static void main(String[] args) throws MalformedURLException {
     
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	
		
		
		//xpath id classname androiduiamulator
		// xpathSyntax
		//tagName[@attribute ='value']).click
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text = '3. Preference dependencies']").click();
		
		//driver.findElementByXPath("//android.widget.TextView[@resource id ='android:id/checkbox']").click();
		driver.findElementById("android:id/checkbox").click();
		
		driver.findElementByXPath("//android.widget.LinearLayout[2]").click();
		
		//tag name android.widget.LinearLayout
		
		//we can use both two ways 1- by index number 2- by path 
		//driver.findElementByXPath("//android.widget.LinearLayout[2]").click();
		
		//send some keys  
		
		driver.findElementByClassName("android.widget.EditText").sendKeys("Abhishek Shukla");
		driver.findElementsByXPath("//android.widget.Button").get(1).click();
		
				
	}

}
