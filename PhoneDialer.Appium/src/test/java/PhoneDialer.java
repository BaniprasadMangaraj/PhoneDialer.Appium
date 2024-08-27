import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class PhoneDialer {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	
	{
		///Gather Desired Capabilites
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "OnePlus");
		capabilities.setCapability("platformVersion", "14");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "OnePlus");
		capabilities.setCapability("appPackage","com.google.android.dialer");
		capabilities.setCapability("appActivity","com.google.android.dialer.extensions.GoogleDialtactsActivity");
		
		
		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		
		AndroidDriver driver = new AndroidDriver(url, capabilities);
		
		
		Thread.sleep(5000);
		
		System.out.println("Phone dialed Lunched Sucessfully");
		
		
		//Click To The Dialer Pad
		WebElement dial  = driver.findElement(By.id("com.google.android.dialer:id/dialpad_fab"));
		dial.click();
		
		Thread.sleep(2000);
		
		
		//Call The Phone Number 7008420169
		
		//Found Location Number-7
		WebElement num7  = driver.findElement(By.id("com.google.android.dialer:id/seven"));
		num7.click();
		
		//Found Location Number-0
	    WebElement num0  = driver.findElement(By.id("com.google.android.dialer:id/zero"));
	    num0.click();
	    Thread.sleep(1000);
		////Found Location Number-0
	    WebElement num00  = driver.findElement(By.id("com.google.android.dialer:id/zero"));
	    num00.click();
	    //Found Location Number-8
	    WebElement num8  = driver.findElement(By.id("com.google.android.dialer:id/eight"));
	    num8.click();
	    //Found Location Number-4
	    WebElement num4  = driver.findElement(By.id("com.google.android.dialer:id/four"));
	    num4.click();
	    //Found Location Number-2
	    WebElement num2  = driver.findElement(By.id("com.google.android.dialer:id/two"));
	    num2.click();
	   //Found Location Number-0
	    WebElement zero  = driver.findElement(By.id("com.google.android.dialer:id/zero"));
	    zero.click();
	   //Found Location Number-1
	    WebElement num1  = driver.findElement(By.id("com.google.android.dialer:id/one"));
	    num1.click();
	   //Found Location Number-6
	    WebElement num6 = driver.findElement(By.id("com.google.android.dialer:id/six"));
	    num6.click();
	    //Found Location Number-9
	    WebElement num9  = driver.findElement(By.id("com.google.android.dialer:id/nine"));
	    num9.click();
	  
	    
	    //Check Number was correct or not
	   WebElement check = driver.findElement(By.id("com.google.android.dialer:id/digits"));
	   
	   if(check.equals("7008420169"))
	   {
		   System.out.println("Correct number");
	   }
	   else
	   {
		   System.out.println("Wrong number");
		   
	   }
	    
	    
	    
	    //Call The Number
	    WebElement call  = driver.findElement(By.id("com.google.android.dialer:id/dialpad_voice_call_button"));
	    call.click();
	    Thread.sleep(1000);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		driver.quit();

	}

}
