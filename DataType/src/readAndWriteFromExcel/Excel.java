package readAndWriteFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public static void main(String[] args) throws IOException {

			File file = new File("C:\\Users\\Agile1Tech\\Documents\\TestData\\SignInData.xlsx");
			
			FileInputStream fis = new FileInputStream(file);
			
			XSSFWorkbook wb = new XSSFWorkbook (fis);
			
			XSSFSheet sheet1 = wb.getSheet("Sheet1");
			
			String userName = sheet1.getRow(1).getCell(0).getStringCellValue();
			
			String password = sheet1.getRow(1).getCell(1).getStringCellValue();
			
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace\\ProgrammingLibraries\\chromedriver.exe");
		    
			WebDriver driver = new ChromeDriver();
			 
			driver.get("https://www.saucedemo.com/");
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			loginPage lp = new loginPage(driver);
			
			

			lp.getUserName().sendKeys(userName);

			lp.getpassword().sendKeys(password);
			
			lp.getloginButton().click();
			
		
//			driver.quit();
			
			wb.close();


	}

}
