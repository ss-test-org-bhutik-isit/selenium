package whatsApp;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class sendMessages {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:/Users/Bacancy/AppData/Local/Google/Chrome/User Data/Profile 8");
		options.addArguments("--start-maximized");
		
		Thread.sleep(3000);
		WebDriver driver = new ChromeDriver(options);
		Thread.sleep(3000);
		//WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		
		driver.get("https://web.whatsapp.com/");
			
	     		
		//for(int i=1; i<=9;i++) {
		String groupDynamicPath = "//*[@title='testgroup']";
		String Message = "Hello";
		System.out.println(groupDynamicPath);
		
		driver.findElement(By.xpath(groupDynamicPath)).click(); 
		
		Thread.sleep(3000);
		//WebElement textBox = driver.findElement(By.xpath("//div[@class='_2lMWa']"));
	   //driver.findElement(By.xpath("//div[@class='fd365im1 to2l77zo bbv8nyr4 mwp4sxku gfz4du6o ag5g9lrv']"));
		/*String Text = "hello";
		StringSelection stringSelection = new StringSelection(Text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		Actions action = new Actions(driver);
		action.moveToElement(textBox).click().keyDown(Keys.CONTROL).sendKeys("v");
		*/
		//driver.findElement(By.xpath("//*[@class='g0rxnol2']")).click();
		//driver.findElement(By.xpath("//*[@class='g0rxnol2']")).sendKeys("hello");
		//driver.findElement(By.xpath("//*[@data-testid='send']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='g0rxnol2']")).click();
		//driver.findElement(By.xpath("//*[@class='_2lMWa']")).click();
		Thread.sleep(3000);
		
		Robot robot = new Robot();
		@SuppressWarnings("resource")
		
		String Text = "hello Good Morning";
		
		StringSelection stringSelection = new StringSelection(Text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		System.out.println("Typing will start in 5 seconds");
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
		images.sendKeys("C:\\Users\\Bacancy\\Pictures\\wallpaper.jpg");
		driver.findElement(By.xpath("//span[@data-testid='send']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='Attach']")).click();
		Thread.sleep(3000);
		WebElement video = driver.findElement(By.xpath("//input[@accept='image/*,video/mp4,video/3gpp,video/quicktime']"));
		Thread.sleep(3000);
		video.sendKeys("C:\\Users\\Bacancy\\Pictures\\video.mp4");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_33pCO']")).click();
		
		//msg.sendKeys(Message);
		
		/*StringBuffer msg1 = new StringBuffer()
                                 .append("H")
                                 .append("e")
                                 .append("l")
                                 .append("l")
                                 .append("o");
		msg.sendKeys(msg1);*/
		
		/*StringBuilder msg2 = new StringBuilder()
                .append("H")
                .append("e")
                .append("l")
                .append("l")
                .append("o");
       msg.sendKeys(msg2);*/
                                 
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Hello'", msg);*/
	//	Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='_3HQNh _1Ae7k']")).click();
		
		
		
		driver.close();
		
		
		}
	}
	//}
