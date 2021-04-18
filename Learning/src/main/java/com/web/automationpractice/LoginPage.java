package com.web.automationpractice;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumPractice.Learning.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id='email']")
	WebElement userNameInput;

	@FindBy(xpath="//*[@id='passwd']")
	WebElement passwordInput;
	
	@FindBy(xpath="//*[@name='SubmitLogin']")
	WebElement loginButton; 

	
	@FindBy(xpath="//*[@class='logout']")
	WebElement logoutButton;
	
	@FindBy(xpath="//*[@class='product-container']")
	WebElement product;
	
	@FindBy(xpath="//*[@title='Women']")
	WebElement womanTab;
	
	@FindBy(xpath="//*[@title='Add to cart']")
	WebElement addToCart;
	
	@FindBy(xpath="//*[@title='Continue shopping']")
	WebElement continueShoppingButton;
	
	@FindBy(xpath="//*[@title='View my shopping cart']")
	WebElement cartButton;
	
	@FindBy(xpath="//*[@class='cart_quantity_delete']")
	WebElement deleteCart;
	
	
	public void loginToApplication(String username, String password) throws IOException{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		userNameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		loginButton.click();
	}
	
	
	public void addToCart() {
		womanTab.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(product));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", product);
		Actions act = new Actions(driver);
		act.moveToElement(product).build().perform();
		addToCart.click();
		wait.until(ExpectedConditions.elementToBeClickable(continueShoppingButton));
		continueShoppingButton.click();
	}
	
	public void removeFromCart() {
		cartButton.click();
		deleteCart.click();
	}
	
	public void logoutFromApplication() {  
		logoutButton.click();
	}
	
	
}
