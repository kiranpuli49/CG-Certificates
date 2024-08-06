package Test.Maven_2;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test {

	

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("Start the Progress");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//		driver.quit();
//	driver.findElement(By.xpath("//a[@id=\"nav_automobile\"]")).click();
//		System.out.println("end");
		Thread.sleep(5000);
		AutomobilePage at = new AutomobilePage(driver);
		at.clickAutomobile();
		at.make();
		at.EnginePerformance();
		at.dateofmanufacture();
		at.numberofseats();
		at.fuel();
		at.listprice();
		at.licenseplatenumber();
		at.annualmileage();
		at.next();
		/////////////////////////Insurant data//////////////////
		at.fName();
		at.lName();
		at.DOB();
		at.Gender();
		at.Address();
		at.Country();
		at.Zipcode();
		at.city();
		at.occupation();
		at.Hobies();
//		at.upload();
		at.next1();
		///////////////////////////////Product data/////////////////
		
		at.Sdate();
		at.InsuranceSum();
		at.MeritRatting();
		at.damageinsurance();
		at.optional();
		at.courtesycar();
		at.next2();
		
		////////////////////price/////////////////
		at.price();
		at.next3();
		////////////////////sendquote//////////
		at.Email();
		at.Phone();
		at.username();
		at.password();
		at.confirmpassword();
		at.sendemail();
		at.okay();
		
		

	}
	

}
