package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumtask4tc123 {
	
	@FindBy(xpath="//body/nav[@id='topnav']/div[1]/div[2]/ul[1]/li[4]")private WebElement administartion;
	@FindBy(xpath="//a[contains(text(),'Business Rule Configuration')]")private WebElement buisness;
	@FindBy(xpath="//a[@id='MCCTRLSUM']")private WebElement MC_navigator;
	@FindBy(xpath="//body/div[@id='erMCTemplate']/form[@id='ControlNavigatorForm']/div[@id='erViewNavigator']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")private WebElement search;
    @FindBy(xpath="//span[contains(text(),'LT958 - Workflow Letter')]")private WebElement LT;
    @FindBy(css="#NewRuleButton")private WebElement rules;
    @FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='RuleCriteriaForm']/div[@id='erViewRuleCriteria']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")private WebElement search2;
	@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='RuleCriteriaForm']/div[@id='erViewRuleCriteria']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[2]/span[1]/span[3]")private WebElement account;
	@FindBy(xpath="//span[@id='select2-selectedOperator-container']")private WebElement selectsop;
	@FindBy(xpath="//body/span[1]/span[1]/span[1]/input[1]")private WebElement search3;
	 @FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='RuleCriteriaForm']/div[@id='erViewRuleCriteria']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[5]/span[1]/span[3]")private WebElement user_id;
	@FindBy(xpath="//li[@id='select2-selectedOperator-result-7lct-==']")private WebElement equal;
	@FindBy(xpath="//button[@id='showDialog_ruleExpressionPane1']")private WebElement build;
	@FindBy(xpath="//textarea[@id='value1']")private WebElement texts;
	@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='RuleCriteriaForm']/div[4]/div[3]/div[1]/button[1]")private WebElement done;
	@FindBy(xpath="//button[@id='addSegment']")private WebElement add_rule;
	@FindBy(xpath="//button[@id='saveCriteria']")private WebElement Save_next;
	@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='IntMCValueForm']/div[@id='mcValuePage']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[1]/span[1]/span[1]")private WebElement QC;
	@FindBy(xpath="//span[contains(text(),'0020 - test 001')]")private WebElement test001;
	@FindBy(xpath="//thead/tr[2]/td[2]/input[1]")private WebElement checkbox;
	@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='IntMCValueForm']/div[2]/div[1]/button[2]/i[1]")private WebElement Save_Next;
	@FindBy(xpath="//input[@id='selectedFireIndex']")private WebElement fire_order;
	@FindBy(xpath="//a[@id='2023-02-16']")private WebElement date;
	@FindBy(xpath="//button[@id='submitForm_finish']")private WebElement finish;
	@FindBy(xpath="//span[@id='select2-mcRuleStatus-container']")private WebElement status;
	@FindBy(xpath="//body/span[1]/span[1]/span[1]/input[1]")private WebElement select;
	@FindBy(xpath="//span[@id='select2-configGroup-container']")private WebElement group;
	@FindBy(xpath="//body/span[1]/span[1]/span[1]/input[1]")private WebElement group_select;
	@FindBy(xpath="//textarea[@id='comments']")private WebElement comment;
	@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='WizardConfirmForm']/div[2]/div[1]/span[1]/button[3]/i[1]")private WebElement commit;
	
	
		
	public Seleniumtask4tc123 (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickonadministration() {
	
		administartion.click();
		
	}
	
	
	public void clickonbuisness(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(buisness).moveToElement(MC_navigator).click().build().perform();

	}
//	public void MC_navigator() {
//		
//		MC_navigator.click();
//	}
	public void clickonsearch(WebDriver driver) {
		search.sendKeys("LT958");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		act.moveToElement(LT).click().build().perform();
		
	}
	public void clickonrule(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",rules);
    rules.click();
     }
	
	public void clickonaccount(WebDriver driver) {
		search2.sendKeys("account number");
		Actions  act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		act.moveToElement(account).click().build().perform();
		selectsop.click();
		search3.sendKeys("Equal to");
		act.sendKeys(Keys.ENTER).build().perform();
		build.click();
		texts.sendKeys("BS4999");
		done.click();
		add_rule.click();
		search2.clear();
	}
	public void clickonsearch2(WebDriver driver) {
		search2.sendKeys("user id");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		
	}
	public void clickonuserid(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(user_id).click().build().perform();
	}
	public void clickonoperator(WebDriver driver) {
		selectsop.click();
		search3.sendKeys("Equal to");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
	public void clickonbuild() {
		build.click();
	}
	public void entertext() {
		texts.sendKeys("cscbarkha");
	}
	public void clickondone() {
		done.click();
		
	}
	
	
	public void clickonaddrule() {
		add_rule.click();
	}
	
	public void clickonsave(WebDriver driver){
		((JavascriptExecutor)driver).executeScript("window.scrollBy(600,400)");
		Save_next.click();
}
	public void clickonearlyresolution(WebDriver driver) {
		WebDriverWait waitt=new WebDriverWait(driver,Duration.ofMillis(2000));
        waitt.until(ExpectedConditions.visibilityOf(QC));
	    	QC.click();
		QC.click();
		Actions act=new Actions(driver);
		act.moveToElement(test001).click().build().perform();
		checkbox.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",Save_Next);
    	Save_Next.click();
    }
	 public void enterfireorder() {
	    	fire_order.sendKeys("1");
	    	date.click();
	    	finish.click();
	    }
	    public void selectsatus(WebDriver driver) {
	    	status.click();
	    	select.sendKeys("Testing - config status");
	    	Actions act=new Actions(driver);
			act.sendKeys(Keys.ENTER).build().perform();
	    }
	    public void selectgroup(WebDriver driver) {
	    	group.click();
	    	group_select.sendKeys("SeleniumQA - For Selenium QA");
	    	Actions act=new Actions(driver);
			act.sendKeys(Keys.ENTER).build().perform();
	    }
	    public void entercomment() {
	    	comment.sendKeys("Test");
	    	commit.click();
	    }

	
	}

