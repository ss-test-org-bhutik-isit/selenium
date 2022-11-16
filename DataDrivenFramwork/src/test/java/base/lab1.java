package base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class lab1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:/Users/bhautik/AppData/Local/Google/Chrome/User Data");
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://web.whatsapp.com/");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		
		//div[@class='_2nY6U vq6sj _3A-iD _37S5u'][@data-testid='cell-frame-container']
		    
		
	    
        
        
        
        
        driver.findElement(By.xpath("//*[text()='testgroup']")).click();
	    driver.findElement(By.xpath("//*[@class='_21nHd']")).click();
	    
	    
	    
	    
	    WebElement element = driver.findElement(By.xpath("//div[@class='tt8xd2xn dl6j7rsh mpdn4nr2 avk8rzj1']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(3000);

		List<WebElement> num = driver.findElements(By.xpath("//div[@class='_2nY6U vq6sj _3A-iD _37S5u']"));
	    int numSize = num.size();
       
	    System.out.println(numSize);
		
				
	  
    	
    	
	       Thread.sleep(3000);
    	    for(int i=2; i<=numSize-2; i++) {
 	
			
			//JavascriptExecutor js = (JavascriptExecutor) driver; 
			//js.executeScript("window.scrollBy(0,250)", "");
	
	    	
	    	Actions action = new Actions(driver);

	    	WebElement link = num.get(i);
	    	action.contextClick(link).perform();
	    	
	    	
	    	
	    	
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@aria-label='Make group admin']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd gjuq5ydh'][@data-testid='content'])[1]")).click();
			
		
	    
	    
	    
	    }
		
		   
		   
		   
	
	
	}

}
