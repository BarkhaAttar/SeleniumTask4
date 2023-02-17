package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Eracceptpage;
import POM.Erlogin;
import POM.Seleniumtask3tc1_2;
import POM.Seleniumtask4tc123;
import Utility.Parametrerization;

public class SeleniumTask4test123 {
	
	
	
	
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
	public void scenario1() throws EncryptedDocumentException, IOException, InterruptedException {
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
		 Seleniumtask4tc123 seleniumtask4test123=new Seleniumtask4tc123(driver);
		 seleniumtask4test123.clickonadministration();
		 seleniumtask4test123.clickonbuisness(driver);
		 seleniumtask4test123.clickonsearch(driver);
		 seleniumtask4test123.clickonrule(driver);
		 seleniumtask4test123.clickonaccount(driver);
		 seleniumtask4test123.clickonsearch2(driver);
		 seleniumtask4test123.clickonuserid(driver);
		 seleniumtask4test123.clickonoperator(driver);
		 seleniumtask4test123.clickonbuild();
		 seleniumtask4test123.entertext();
		 seleniumtask4test123.clickondone();
		 seleniumtask4test123.clickonaddrule();
		 seleniumtask4test123.clickonsave(driver);
		 seleniumtask4test123.clickonearlyresolution(driver);
		
		 seleniumtask4test123.enterfireorder();
		 seleniumtask4test123.selectsatus(driver);
		 seleniumtask4test123.selectgroup(driver);
		 seleniumtask4test123.entercomment();
	}
}
