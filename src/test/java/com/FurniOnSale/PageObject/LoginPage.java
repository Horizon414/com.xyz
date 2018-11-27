package com.FurniOnSale.PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver rdriver;
	public LoginPage(WebDriver ldriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

		
	
}
