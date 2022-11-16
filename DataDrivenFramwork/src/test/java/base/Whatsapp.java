package base;


import java.io.File;
import java.io.FileInputStream;
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

public class Whatsapp {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:/Users/Bacancy/AppData/Local/Google/Chrome/User Data");
		options.addArguments("--start-maximized");
		
		Thread.sleep(3000);
		WebDriver driver = new ChromeDriver(options);
		Thread.sleep(3000);
		driver.get("https://web.whatsapp.com/");
		
		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		
		
	//	driver.findElement(By.xpath("//span[@data-icon='menu']")).click();
		//driver.findElement(By.xpath("//*[@aria-label='New group']")).click();
		
		File excelPath = new File( "C:\\Users\\Bacancy\\Documents\\whatsapp.xlsx"); 
		FileInputStream fis = new FileInputStream(excelPath);
		
		//XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		XSSFSheet sheet = workbook.getSheetAt(0);		
		
		//get cell value
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
		
		
		//sheet.getRow(1).createCell(0).setCellValue(x1);
	    System.out.println("this is set value for cell"+x1);
		
		Thread.sleep(3000);
	    
		for(int i=y+1; i<=z; i++ ) {
			Thread.sleep(3000000);
			driver.findElement(By.xpath("//div[@class='_2cNrC'][@data-testid='menu-bar-menu']")).click();
			driver.findElement(By.xpath("//*[@aria-label='New group']")).click();
		   
			int rows2 = sheet.getLastRowNum();
		
			for (int j=1; j<=rows2; j++) {
			
			System.out.println(j);
			XSSFRow getrow = sheet.getRow(j);
			 // get each row 
			int i1=2;
			
				
			XSSFCell celli = getrow.getCell(i+1);
			String link = celli.getStringCellValue();
			System.out.println(link);
			driver.findElement(By.xpath("//*[@class='_2PZbe copyable-text selectable-text']")).clear();
			driver.findElement(By.xpath("//*[@class='_2PZbe copyable-text selectable-text']")).sendKeys(link);
			
			List<WebElement> element = driver.findElements(By.xpath("//div[@data-testid='contact-list-key']"));
			int elementSize = element.size();
			if(elementSize!=0) {
				driver.findElement(By.xpath("//div[@data-testid='contact-list-key']")).click();
			}else {
				continue;
			}
			
			i1++;
			
			
			
	        Thread.sleep(5000);
		}
		
	    
	    String groupName = "testgroup"+i;
	    driver.findElement(By.xpath("//*[@data-icon='arrow-forward']")).click();
	    driver.findElement(By.xpath("//*[@data-testid='pluggable-input-body']")).sendKeys(groupName);
	    driver.findElement(By.xpath("//*[@data-testid='checkmark-medium']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@class='_21nHd']")).click();
	    driver.findElement(By.xpath("//*[text()='Group settings']")).click();
	    driver.findElement(By.xpath("//*[text()='Send messages']")).click();
	    driver.findElement(By.xpath("//*[text()='Only admins']")).click();
	    driver.findElement(By.xpath("//*[@class='_20C5O _2Zdgs']")).click();
		}
	    FileOutputStream fos = new FileOutputStream(excelPath);
		workbook.write(fos);
	driver.close();	
	}
	
	}
