package com.comcast.crm.generic.webdriverutility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public void maximizeWin(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void minimizeWin(WebDriver driver) {
		driver.manage().window().minimize();
	}

	public void waitForPageToLoad(WebDriver driver) {// driver arg given bcoz which browser we have to specify
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void waitForElementPresent(WebDriver driver, WebElement element) {// pass driver and any element it wil wait
																				// for that

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void switchToTabOnURL(WebDriver driver, String partialURL) {
		Set<String> set1 = driver.getWindowHandles();
		Iterator<String> it1 = set1.iterator();
		while (it1.hasNext()) {
			String windowID = it1.next();// capture the first data from the set collection
			driver.switchTo().window(windowID);

			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(partialURL)) {
				break;
			}
		}
	}

//	public void switchToTabOnTitle(WebDriver driver, String partialTitle) {
//		Set<String> set1 = driver.getWindowHandles();
//		Iterator<String> it1 = set1.iterator();
//		while (it1.hasNext()) {
//			String windowID = it1.next();// capture the first data from the set collection
//			driver.switchTo().window(windowID);
//
//			String actUrl = driver.getCurrentUrl();
//			if (actUrl.contains(partialTitle)) {
//				break;
//			}
//		}
//	}
	public void switchByTitle(WebDriver driver, String partialTitle) {
		Set<String> allwin = driver.getWindowHandles();
		for(String win:allwin) {
			driver.switchTo().window(win);
			if(driver.getTitle().contains(partialTitle)) {
				break;
			}
		}
	}

	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(WebDriver driver, String nameID) {
		driver.switchTo().frame(nameID);
	}

	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchToAlertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void switchToGetText(WebDriver driver) {
		driver.switchTo().alert().getText();
	}

	public void switchToSendKeys(WebDriver driver, String key) {
		driver.switchTo().alert().sendKeys("key");
	}

	public void switchToAlertAndCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public boolean selectByIsMultiple(WebElement element) {
		Select sel = new Select(element);
		boolean bool = sel.isMultiple();
		return bool;
	}
	public List selectGetOptions(WebElement element) {
		Select sel = new Select(element);
		 List<WebElement> options = sel.getOptions();
		return options;
	}

	public void selectByVisibleText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void selectByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void selectByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void mousemoveOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void doubleclick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

	public void contextclick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

	public void scrollToElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

	public void scrollByAmount(WebDriver driver, int X, int Y) {
		Actions act = new Actions(driver);
		act.scrollByAmount(X, Y).perform();
	}

	public void clickAndHold(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();
	}

	public void clickAndHold(WebDriver driver, WebElement src, WebElement tar) {
		Actions act = new Actions(driver);
		act.dragAndDrop(src, tar).perform();
	}

	public void takeScreenshotEntirePage(WebDriver driver, String imageName) throws IOException {
		TakesScreenshot tks = (TakesScreenshot) driver;
		File temp = tks.getScreenshotAs(OutputType.FILE);
		File src = new File("./screenShots/" + imageName + ".png");
		FileHandler.copy(temp, src);

	}

	public void takeScreenshotWebEelement(WebDriver driver, WebElement ele, String imageName) throws IOException {
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File src = new File("./screenShots/" + imageName + ".png");
		FileHandler.copy(temp, src);
	}
	
//	public void alertHandled

}