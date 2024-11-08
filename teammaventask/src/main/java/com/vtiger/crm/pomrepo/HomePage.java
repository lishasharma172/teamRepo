package com.vtiger.crm.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // this means current object reference,this will take care initialize
												// the object loading the object
	}

	@FindBy(linkText = "Organizations")
	private WebElement orgLink;
	
	@FindBy(linkText= "Leads")
	private WebElement leadLnk;
	
	

	public WebElement getLeadLnk() {
		return leadLnk;
	}

	@FindBy(linkText = "Contacts")
	private WebElement contactlnk;

	@FindBy(linkText = "Campaigns")
	private WebElement campaignlnk;

	@FindBy(linkText = "Service Contracts")
	private WebElement serviceContractlnk;

	@FindBy(linkText = "Projects")
	private WebElement projectslnk;

	@FindBy(linkText = "Services")
	private WebElement serviceLink;

	@FindBy(linkText = "Price Books")
	private WebElement priceBookLink;

	@FindBy(linkText = "Vendors")
	private WebElement vendorLnk;

	public WebElement getVendorLnk() {
		return vendorLnk;
	}

	public WebElement getPriceBookLink() {
		return priceBookLink;
	}

	public WebElement getServiceLink() {
		return serviceLink;
	}

	public WebElement getProjectslnk() {
		return projectslnk;
	}

	public WebElement getServiceContractlnk() {
		return serviceContractlnk;
	}

	@FindBy(linkText = "More")
	private WebElement moreLnk;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImg;

	@FindBy(linkText = "Sign Out")
	private WebElement signoutlnk;

	public WebElement getorgLink() {
		return orgLink;
	}

	public WebElement getContactlnk() {
		return contactlnk;
	}

	public WebElement getCampaignlnk() {
		return campaignlnk;
	}

	public WebElement getMoreLink() {
		return moreLnk;
	}

	public void navigateToCampaginPage() {// if want to call campaignpage just call that method this is business library
		Actions act = new Actions(driver);
		act.moveToElement(moreLnk).perform();
		campaignlnk.click();
	}

	public void navigateToServiceContract() {
		Actions act = new Actions(driver);
		act.moveToElement(moreLnk).perform();
		serviceContractlnk.click();
	}

	public void navigateToProjects() {
		Actions act = new Actions(driver);
		act.moveToElement(moreLnk).perform();
		projectslnk.click();
	}

	public void navigateToServices() {
		Actions act = new Actions(driver);
		act.moveToElement(moreLnk).perform();
		serviceLink.click();
	}

	public void navigateToPriceBookLnk() {
		Actions act = new Actions(driver);
		act.moveToElement(moreLnk).perform();
		priceBookLink.click();
	}

	public void navigateToVendorLnk() {
		Actions act = new Actions(driver);
		act.moveToElement(moreLnk).perform();
		vendorLnk.click();
	}
	
//	public void navigateToLeadLnk() {
//		Actions act = new Actions(driver);
//		act.moveToElement(moreLnk).perform();
//		leadLnk.click();
//	}
	public void navigateToLeadLnk() {
		leadLnk.click();
	}

	public void logout() {
		Actions act = new Actions(driver);
		act.moveToElement(adminImg).perform();
		act.moveToElement(signoutlnk).click().perform();
	}

}
