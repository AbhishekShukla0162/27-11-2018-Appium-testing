import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;

import  static java.time.Duration.ofSeconds;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class gesture extends FirstDemo {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//tap
		//import two package 
		//1- for tapOption == import static io.appium.java_client.touch.TapOptions.tapOptions
		//2 - Element Object ==import static io.appium.java_client.touch.offset.ElementOption.element;
		
		WebElement ExpandableLists=driver.findElementByXPath("//android.widget.TextView[@text = 'Expandable Lists']");	
	    TouchAction touch = new TouchAction(driver);
		touch.tap(tapOptions().withElement(element(ExpandableLists))).perform();	
	    
		
		//
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		
		// long  press 
		
		WebElement PeopleNames= driver.findElementByXPath("//android.widget.TextView[@text = 'People Names']");
		touch.longPress(longPressOptions().withElement(element(PeopleNames)).withDuration(ofSeconds(2))).release().perform();
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
			
		
	}

}





























