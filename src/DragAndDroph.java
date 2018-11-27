import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class DragAndDroph extends FirstDemo {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		TouchAction touch = new TouchAction(driver);
		WebElement Source=driver.findElementsByClassName("android.view.View").get(0);
		WebElement Destination=driver.findElementsByClassName("android.view.View").get(1);
		//touch.longPress(longPressOptions().withElement(element(Source))).moveTo(element(Destination)).release().perform();
		touch.longPress(element(Source)).moveTo(element(Destination)).release().perform();
		
		
	}

}
