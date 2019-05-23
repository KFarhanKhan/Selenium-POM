package com.testingPagdeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clickObjects {
	
	public clickObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Sign in")
	
	public WebElement clicme;

}



