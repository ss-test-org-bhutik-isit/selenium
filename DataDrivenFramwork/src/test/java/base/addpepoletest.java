package base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class addpepoletest {
	public static WebDriver driver;
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	
		
		//dfgdf
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:/Users/bhautik/AppData/Local/Google/Chrome/User Data");
		options.addArguments("--start-maximized");
		
		Thread.sleep(3000);
		driver = new ChromeDriver(options);
		Thread.sleep(3000);
		driver.get("https://web.whatsapp.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
		
	
	
	
		
		File excelPath = new File( "C:\\Users\\bhautik\\Documents\\addNewGroupMember.xlsx"); 
		FileInputStream fis = new FileInputStream(excelPath);
		
		//XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		XSSFSheet sheet = workbook.getSheetAt(0);		
		
		/*//get cell value
		XSSFRow rows = sheet.getRow(1);
		XSSFCell cell = rows.getCell(0);
		String x = cell.getStringCellValue();
		int y = Integer.parseInt(x);
		System.out.println("this is set value for cell"+x);
		
		//get cell value
		XSSFRow rows1 = sheet.getRow(1);
		XSSFCell cell1 = rows1.getCell(1);
		String x1 = cell1.getStringCellValue();
		int z = Integer.parseInt(x1);
*/
		
		
		
	
	
	
	
		
		
		
		
		for(int i=1; i<=3; i++) {
	   	
	        System.out.println(i);
	        String groupName = "testgroup"+i;
	        String groupDynamicPath = "//*[@title='testgroup"+i+"']";
	        //driver.findElement(By.xpath("//div[@class='_3Qnsr']")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@class='_16C8p']")).click();
	        driver.findElement(By.xpath("//*[@class='_1UWac _3hKpJ focused']")).sendKeys(groupName);
		    driver.findElement(By.xpath(groupDynamicPath)).click(); 
		    driver.findElement(By.xpath("//*[@class='_21nHd']")).click();
		    driver.findElement(By.xpath("//*[@data-testid='add-user']")).click();
		  
		    
		    int rows2 = sheet.getLastRowNum();
		    for (int j=1; j<=rows2; j++) {
				
				System.out.println(j);
				XSSFRow getrow = sheet.getRow(j);
				 // get each row 
				int i1=2;
				
					
				XSSFCell celli = getrow.getCell(i+1);
				String link = celli.getStringCellValue();
				System.out.println(link);
				driver.findElement(By.xpath("//div[@title='Search input textbox']")).clear();
				driver.findElement(By.xpath("//div[@title='Search input textbox']")).sendKeys(link);
				Thread.sleep(5000);
			    driver.findElement(By.xpath("//button[@class='i5tg98hk f9ovudaz przvwfww gx1rr48f shdiholb phqmzxqs gtscxtjd ajgl1lbb thr4l2wc cc8mgx9x eta5aym1 d9802myq e4xiuwjv g0rxnol2 ln8gz9je']")).click();
				
								
				
				
				
				
		        
			}
			 
		    driver.findElement(By.xpath("//*[@data-testid='checkmark-medium']")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@data-testid='popup-controls-ok']")).click();
		    
		}
		
		
	   
		
		Thread.sleep(10000);
		driver.close();
	
		//return 0;
	}
}
	
	
	
	
	
	
				
		
	
	
