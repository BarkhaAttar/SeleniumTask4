package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTask4tc91011 {
	
	
	@FindBy(xpath="//body/nav[@id='topnav']/div[1]/div[2]/ul[1]/li[3]/a[1]")private WebElement report;
	@FindBy(xpath="//a[@id='ERRPTAUDIT']")private WebElement  audit;
	@FindBy(xpath="//button[@id='searchAction']")private WebElement status_report;
	@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/a[1]/i[1]")private WebElement view_report;
	
	
	
	public SeleniumTask4tc91011(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickonreport(WebDriver driver) {
		report.click();
		Actions act=new Actions(driver);
		act.moveToElement(audit).click().build().perform();
		status_report.click();
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",view_report);
		  WebDriverWait waitt3=new WebDriverWait(driver,Duration.ofMillis(2000));
	       waitt3.until(ExpectedConditions.elementToBeClickable(view_report));
		act.moveToElement(view_report).click().build().perform();
		
		
	}
	
	
	
	
	
	
}

