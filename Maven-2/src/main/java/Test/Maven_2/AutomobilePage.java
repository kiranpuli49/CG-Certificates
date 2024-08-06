package Test.Maven_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class AutomobilePage {
	
	WebDriver driver;
	
	
	public AutomobilePage(WebDriver driver) {
		
		this.driver = driver;
	}
    public void clickAutomobile(){
    	driver.findElement(By.xpath("//a[@id=\"nav_automobile\"]")).click();
    	
    }
	public void make() {
		WebElement make = driver.findElement(By.xpath("//*[@id='make']"));
		make.click();
		Select sc = new Select(make);
		sc.selectByValue("BMW");
	}
	
	public void EnginePerformance() {
		driver.findElement(By.id("engineperformance")).sendKeys("500");
	}
	public void dateofmanufacture() throws InterruptedException {
		driver.findElement(By.id("dateofmanufacture")).sendKeys("09/08/2020");
		Thread.sleep(10000);
	}
	public void numberofseats() {
		WebElement seat = driver.findElement(By.id("numberofseats"));
		seat.click();
		Select sc = new Select(seat);
		sc.selectByValue("2");
		
	}
	public void fuel() {
		WebElement type = driver.findElement(By.id("fuel"));
		type.click();
		Select sc = new Select(type);
		sc.selectByValue("Petrol");
		
		
	}
	public void listprice() throws IOException  {
		driver.findElement(By.id("listprice")).sendKeys("5000");
		FileInputStream fs = new FileInputStream("C:\\Users\\kipuli\\Desktop\\Book1.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		for(int i = 1; i<=sheet.getLastRowNum();i++) {
			
			XSSFRow data = sheet.getRow(i);
			
			String value  = data.getCell(0).getStringCellValue();
			driver.findElement(By.id("listprice")).sendKeys(value);
		}
		
		
		
		
	
		
		
		
		
	}
	
	public void licenseplatenumber() {
		driver.findElement(By.id("licenseplatenumber")).sendKeys("AP57F2023");
	}
	public void annualmileage() {
		driver.findElement(By.id("annualmileage")).sendKeys("3455");
	}
	public void next() {
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}
	public void fName() {
		driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys("kiran");
	}

	public void lName() {
		driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys("puli");
	}
	public void DOB() {
		driver.findElement(By.id("birthdate")).sendKeys("01/09/2000");
	
	}
	public  void Gender() {
		WebElement gender = driver.findElement(By.className("ideal-radiocheck-label"));
		gender.click();
	}
	
	public void Address() {
		driver.findElement(By.id("streetaddress")).sendKeys("BEML-road,Karnataka,455555");
	}
	public void Country() {
		WebElement cou = driver.findElement(By.id("country"));
		cou.click();
		Select sc = new Select(cou);
		sc.selectByValue("India");
		
		
	}

	public void Zipcode() {
		driver.findElement(By.id("zipcode")).sendKeys("455555");
	}
	
	public void city() {
		driver.findElement(By.id("city")).sendKeys("greencity");
	}
	public void occupation() {
		WebElement occ= driver.findElement(By.id("occupation"));
		occ.click();
		Select sc= new Select(occ);
		sc.selectByValue("Employee");
		
	}
	public  void Hobies() {
		
		WebElement hob = driver.findElement(By.xpath("(//p[@class='group']/label)[6]"));
		hob.click();
	}
	
	
	public void next1() {
		driver.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();
	}
	
	
	/////////////////////product data///////////////////////
	
	public void Sdate() {
		driver.findElement(By.id("startdate")).sendKeys("09/02/2023");
	
	}
	public void InsuranceSum() {
		WebElement IS= driver.findElement(By.id("insurancesum"));
		IS.click();
		Select sc= new Select(IS);
		sc.selectByIndex(1);
		
	}
	public void MeritRatting() {
		WebElement MR= driver.findElement(By.id("meritrating"));
		MR.click();
		Select sc= new Select(MR);
		sc.selectByValue("Bonus 1");
		
	}
	public void damageinsurance() {
		WebElement DI= driver.findElement(By.id("damageinsurance"));
		DI.click();
		Select sc= new Select(DI);
		sc.selectByValue("No Coverage");
		
	}
	public void optional() {
	driver.findElement(By.xpath("(//p[@class='group']/label)[8]")).click();
	
	}
	public void courtesycar() {
		WebElement MR= driver.findElement(By.id("courtesycar"));
		MR.click();
		Select sc= new Select(MR);
		sc.selectByValue("No");
		
	}
	public void next2() {
		driver.findElement(By.id("nextselectpriceoption")).click();
	}
	
	
	////////////////////////////price///////////////
	public void price() {
		driver.findElement(By.xpath("//input[@id='selectsilver']/following-sibling::span[@class='ideal-radio']")).click();
	}
	
	public void next3() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@id='nextsendquote']")).click();
	}
	
	//////////////////////sendquoto/////////////////////////////////////
	
	public void Email() {
		driver.findElement(By.id("email")).sendKeys("nikhilshwar002@gmail.com");
	}
	
	public void Phone() {
		driver.findElement(By.id("phone")).sendKeys("8466066216");
	}
	public void username() {
		driver.findElement(By.id("username")).sendKeys("kiranPuli123");
	}
	public void password() {
		driver.findElement(By.id("password")).sendKeys("Kiran@123");
	}
	public void confirmpassword() {
		driver.findElement(By.id("confirmpassword")).sendKeys("Kiran@123");
	}
	public void sendemail() {
		driver.findElement(By.id("sendemail")).click();
	}
	public void okay()
	
	{
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
	}
	
	
	
}
