package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class Base {
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{

		prop= new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\data.properties");

		prop.load(fis);
		String browserName=prop.getProperty("browser");
		//System.out.println(browserName);

		if(browserName.equals("chrome"))
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("headless");			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver=new ChromeDriver(options);
			//execute in chrome driver

		}
		else if (browserName.equals("firefox"))
		{
			driver= new FirefoxDriver();
			//firefox code
		}
		else if (browserName.equals("IE"))
		{
			//	IE code
		}
		else if(browserName.equals("MC"))
		{
			/*Map<String, String> mobileEmulation = new HashMap<String, String>();
			mobileEmulation.put("deviceName", "Nexus 5");

			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("mobileEmulation", mobileEmulation);
			options.addArguments("--disable-notifications");
			options.addArguments("headless");			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver=new ChromeDriver(options);*/
			//execute in Mobile chrome driver
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			 Map<String, String> mobileEmulation = new HashMap<String, String>();  
  
            mobileEmulation.put("deviceName", "iPhone 6");  
            Map<String, Object> chromeOptions = new HashMap<String, Object>();   
            chromeOptions.put("mobileEmulation", mobileEmulation);    
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();  
            capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);  
            driver = new ChromeDriver(capabilities); 

		}



		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;



	}

	public void getScreenshot(String result) throws IOException
	{
		//time and date stamp
		String TD=systemDateAndTime();

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\Screenshots\\"+TD+result+".png"));



	}
	public String systemDateAndTime() {

		//system current time and date stamp.

		//DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
		// Date date = new Date();
		// String date1= dateFormat.format(date);
		String date1 = new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
		return date1;
	}

}