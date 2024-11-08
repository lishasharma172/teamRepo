package com.vtiger.crm.pomrepo;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
/**
 * @author shalini
 * 
 * contains login page elements & business lib like login
 * 
 */

public class LoginPage extends WebDriverUtility {// rule 1: create a seperate java class\
	// rule2: Object creation(identify all ele bt @findby
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // this means current object reference,this will take care initialize
												// the object loading the object
	}

	@FindBy(name = "user_name")
	private WebElement usernameEdt;

	@FindBy(name = "user_password")
	private WebElement passwordnameEdt;

	@FindBy(id = "submitButton")
	private WebElement loginBtn;

	// rule3: Object Initialization(done in test script)
	// rule4: Object Encapsulation
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordnameEdt() {
		return passwordnameEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	/**
	 * login to application based username, password, url argument
	 * @param url
	 * @param username
	 * @param password
	 */

	// provide actions
	public void loginToapp(String url, String username, String password) {
		driver.manage().window().maximize();
		waitForPageToLoad(driver);
		driver.get(url);
		usernameEdt.sendKeys(username);
		passwordnameEdt.sendKeys(password);
		loginBtn.click();
	}

}
