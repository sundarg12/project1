package org.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage (){
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(id="email")
	//@FindBys({ @FindBy(id="email"), @FindBy(id="email") })
	private WebElement un;
	
	@FindBy(id="pass")
	//@FindAll({ @FindBy(id="pass") , @FindBy(id="pass") })
	private WebElement pw;
	
	@FindBy(name="login")
	private WebElement ln;
	
	public WebElement getun() {
		return un;
	}
	public WebElement getpw() {
		return pw;
	}
	public WebElement getln() {
		return ln;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
