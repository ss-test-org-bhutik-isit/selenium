package base;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sendMessages {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		
		Properties OR = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:/Users/bhautik/AppData/Local/Google/Chrome/User Data/Profile 6");
		options.addArguments("--start-maximized");
		
		Thread.sleep(3000);
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		
		driver.get("https://web.whatsapp.com/");
			
		
		String x = OR.getProperty("firstGroup");
	    int a = Integer.parseInt(x);
		
	    String z = OR.getProperty("lastGroup");
	    int b = Integer.parseInt(z);
	    System.out.println(a+b);
		
		for(int i=a; i<=b;i++) {
		String groupDynamicPath = "//*[@title='testgroup"+i+"']";
		String groupDynamicPath1 = "testgroup"+i;
		/*String Message = "Hello";
		System.out.println(groupDynamicPath);
		
		driver.findElement(By.xpath(groupDynamicPath)).click(); 
		*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_13NKt copyable-text selectable-text']")).sendKeys(groupDynamicPath1);
		Thread.sleep(3000);
		driver.findElement(By.xpath(groupDynamicPath)).click(); 
		
		String Text = "hello Good Morninghello Good Morninghello Good Morninghello Good Morninghello Good Morninghello Good Morninghello Good Morninghello Good Morninghello Good Morninghello Good Morninghello Good Morninghello Good Morning";
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/footer[1]/div[1]/div[1]/span[2]/div[1]/div[2]/div[1]")).sendKeys(Text);
		
		/*Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("//*[@class='_2lMWa']")).click();
		Thread.sleep(3000);
		Robot robot = new Robot();
		@SuppressWarnings("resource")
		
		String Text = "hello bhautik here";
		
		/*StringSelection stringSelection = new StringSelection(Text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		System.out.println("The spamming will start in 5 seconds");
		Thread.sleep(3000);
	
		
			
		Thread.sleep(1000);
			
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_2lMWa']")).sendKeys("hello bhautik here");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='Attach']")).click();
		WebElement images = driver.findElement(By.xpath("//input[@accept='image/*,video/mp4,video/3gpp,video/quicktime']"));
		images.sendKeys("C:\\Users\\bhautik\\Pictures\\wallpaper.jpg");
		driver.findElement(By.xpath("//div[@class='_33pCO']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='Attach']")).click();
		Thread.sleep(3000);
		WebElement video = driver.findElement(By.xpath("//input[@accept='image/*,video/mp4,video/3gpp,video/quicktime']"));
		Thread.sleep(3000);
		video.sendKeys("C:\\Users\\bhautik\\Pictures\\video.mp4");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_165_h _2HL9j']")).click();
		
	
		
		
		
	
		
		
		}

		//driver.close();
	
	}
	}
