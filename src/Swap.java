import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;


public class Swap  extends FirstDemo{

	public static void main(String[] args) throws MalformedURLException {
	AndroidDriver<AndroidElement>driver = capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElementByXPath("//android.widget.TextView[@text = 'Views']").click();
	driver.findElementByXPath("//android.widget.TextView[@text ='Date Widgets']").click();
	driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
	
	
	//is taggName Have some Special Character ,,we can not use this taggname 
	// in this condition we can USe (*) this use any taggname for this valur which is acceptable 
	
	driver.findElementByXPath("//*[@content-desc = '9']").click();
	//swap 
	
	TouchAction touch = new TouchAction(driver);
	WebElement First = driver.findElementByXPath("//*[@content-desc = '15']");
	WebElement Second = driver.findElementByXPath("//*[@content-desc = '45']");
	
	touch.longPress(longPressOptions().withElement(element(First)).withDuration(ofSeconds(2))).moveTo(element(Second)).release().perform();
	
	
	}

}
