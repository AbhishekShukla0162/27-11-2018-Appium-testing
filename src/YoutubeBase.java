
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class YoutubeBase {

	
	@Test
	public AndroidDriver<AndroidElement> testApp() throws MalformedURLException{
	//		AndroidDriver<AndroidElement> capabilities()  {
		File f = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
		
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 6");
		capability.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capability);
		return driver;
	}
	}
	

