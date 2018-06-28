package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	
	//Page Factory
	
	@FindBy(xpath= "/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]/font")
	WebElement UserNameLable;
	
	@FindBy(xpath= "//[")
	WebElement HomePageCRMLogo;
	
	@FindBy(xpath= "//*[@id=\"navmenu\"]/ul/li[1]/a")
	WebElement HomeTabLink;
	
	@FindBy(xpath= "//*[@id=\"navmenu\"]/ul/li[2]/a")
	WebElement CalendarTabLink;
	
	@FindBy(xpath= "//*[@id=\"navmenu\"]/ul/li[4]/a")
	WebElement ContactTabLink;
	
	@FindBy(xpath= "//*[@id=\"navmenu\"]/ul/li[9]/a")
	WebElement EmailTabLink;
	
	@FindBy(xpath= "//*[@id=\"navmenu\"]/ul/li[13]/a")
	WebElement DocsTabLink;

	
	//Initializing the Page Factory
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String VerifyHomePageTitle() {
			return driver.getTitle();
		
		}
		public HomePage ClickOnHomeTab(){
			HomeTabLink.click();
			return new HomePage();
						
		}
		public ContactsPage ClickOnContactTab() {
			ContactTabLink.click();
			return new ContactsPage(); 
		}
		
		public EmailPage ClickOnEmailTab() {
			EmailTabLink.click();
			return new EmailPage(); 
		}
		
 	
		public DocsPage ClickOnDocsTab() {
			DocsTabLink.click();
			return new DocsPage(); 
		}
		
		public boolean ValidateCRMLogo(){
			return HomePageCRMLogo.isDisplayed();
		
		}
		
		
		
		
		
		
		
		
}
