import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class browser extends WebApp {

	public static void main(String[] args) throws MalformedURLException {
	AndroidDriver<AndroidElement> driver = capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.findElementByXPath("//android.widget.TextView[@text = 'Chrome']").click();
	
    driver.get("http//:google.com");
	
	
	

	}

}
