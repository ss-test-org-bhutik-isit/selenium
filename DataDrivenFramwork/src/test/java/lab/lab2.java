package lab;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab2 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				 
		        //FirefoxOptions options = new FirefoxOptions();
		        ChromeOptions options = new ChromeOptions();
				options.addArguments("user-data-dir=C:/Users/Bacancy/AppData/Local/Google/Chrome/User Data");
				options.addArguments("--start-maximized");
				
				Thread.sleep(3000);
				WebDriver driver = new ChromeDriver(options);
				Thread.sleep(3000);
				driver.get("https://web.whatsapp.com/");
				Thread.sleep(10000);
				driver.close();
		
		
		
		
	}}