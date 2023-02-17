package Test;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Eracceptpage;
import POM.Erlogin;
import POM.SeleniumTask4tc4_5678;
import POM.Seleniumtask4tc123;
import Utility.Parametrerization;

public class SeleniumTask4test45678 {
	
	
	
	WebDriver driver;
	@BeforeMethod
	
	public void browseon() {
		driver=Browser.openBrowser();
	}
	@Test
	public void scenario3() throws EncryptedDocumentException, IOException
	{
		Eracceptpage eracceptpage=new Eracceptpage(driver);
	     eracceptpage.clickonaccept(driver);	 
		 Erlogin erlogin=new Erlogin(driver);
//		 erlogin.EnteruserID("cscbarkha",driver);
		 String username=Parametrerization.getData(0, 1);
		 erlogin.EnteruserID(username, driver);
		 String password=Parametrerization.getData(1, 1);
		 erlogin.Enterpass(password, driver);	 
//		 erlogin.Enterpass("Chava*4999+2022",driver);
		 erlogin.Clickonlogin();
		 }
		 
	@Test
	public void scenario1() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
		Eracceptpage eracceptpage=new Eracceptpage(driver);
	     eracceptpage.clickonaccept(driver);
		 Erlogin erlogin=new Erlogin(driver);
//		 erlogin.EnteruserID("cscbarkha",driver);
		 String username=Parametrerization.getData(0, 1);
		 erlogin.EnteruserID(username, driver);
		 String password=Parametrerization.getData(1, 1);
		 erlogin.Enterpass(password, driver);
//		 erlogin.Enterpass("Chava*4999+2022",driver);
		 erlogin.Clickonlogin();
		 SeleniumTask4tc4_5678 seleniumtask4tc4_5678=new SeleniumTask4tc4_5678(driver);
//		 seleniumtask4tc4_5678.clickonadministration();
//		 seleniumtask4tc4_5678.clickonbuisness(driver);
//		 seleniumtask4tc4_5678.clickonsearch(driver);
//		 seleniumtask4tc4_5678.clickonrule(driver);
//		 seleniumtask4tc4_5678.clickonaccount(driver);
//		 seleniumtask4tc4_5678.clickonsearch2(driver);
//		 seleniumtask4tc4_5678.clickonuserid(driver);
//		 seleniumtask4tc4_5678.clickonoperator(driver);
//		 seleniumtask4tc4_5678.clickonbuild();
//		 seleniumtask4tc4_5678.entertext();
//		 seleniumtask4tc4_5678.clickondone();
//		 seleniumtask4tc4_5678.clickonaddrule();
//		 seleniumtask4tc4_5678.clickonsave(driver);
//		 seleniumtask4tc4_5678.clickonearlyresolution(driver);
//		 seleniumtask4tc4_5678.enterfireorder();
//		 seleniumtask4tc4_5678.selectsatus(driver);
//		 seleniumtask4tc4_5678.selectgroup(driver);
//		 seleniumtask4tc4_5678.entercomment();
		
		 seleniumtask4tc4_5678.clickonworkflow(driver);
		 seleniumtask4tc4_5678.clickonagreement(driver);
		 seleniumtask4tc4_5678.clickonaddcomment(driver);
		 seleniumtask4tc4_5678.entercomment1(driver);
	}
}



