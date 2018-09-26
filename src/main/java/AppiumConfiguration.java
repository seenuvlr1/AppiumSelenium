import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumConfiguration {

	public AndroidDriver<MobileElement> driver;
	String Path;
	
	@BeforeClass
	public void Setup() throws MalformedURLException
	{
		Path= System.getProperty("user.dir");
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "YT911286CC");
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.APP, Path + "//App//VodQA.apk");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);
		//String sessionId = driver.getSessionId().toString();
		//System.out.println(sessionId);
	}

	@Test
	public void testcase1()
	{
	
		System.out.println("Testcase 1");
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		System.out.println("Script completed");
	}
}
