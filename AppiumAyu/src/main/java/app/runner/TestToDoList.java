package app.runner;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import app.pageobject.ToDoList;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestToDoList {
	private static AndroidDriver<MobileElement> driver;
	private static ToDoList toDoList;
	
	@BeforeTest
	public void befTest() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "G011A");
			capabilities.setCapability("uuid", "127.0.0.1:21513");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "7.1.2");
			capabilities.setCapability("noReset", true);
			capabilities.setCapability("appPackage", "com.splendapps.splendo");
			capabilities.setCapability("appActivity", "com.splendapps.splendo.MainActivity");
			
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
			toDoList = new ToDoList(driver);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Test(priority = 0)
	public void testAddList() throws InterruptedException {
		toDoList.addList("membaca buku");
		assertEquals(toDoList.getMsgAddList(), "Today");
	}
//	

	

	
	
	
	
}
