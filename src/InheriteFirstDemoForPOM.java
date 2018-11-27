import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import PageObjectModel.HomePage;
import PageObjectModel.Preferences;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class InheriteFirstDemoForPOM  extends FirstDemo
				{
					public static void main(String[] args) throws Exception
					{
		
			AndroidDriver<AndroidElement> driver = capabilities();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			HomePage Hp = new HomePage(driver);
			Hp.Preference.click();
			
		  Preferences p = new Preferences(driver);
		  p.dependencies.click();
		
			//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
			
			//driver.findElementByXPath("//android.widget.TextView[@text = '3. Preference dependencies']").click();
		
	}
				}


