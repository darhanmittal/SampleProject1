package com.tryLocal.tryPageModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TryPageModel {

	@FindBy(id = "lst-ib")
	private WebElement txtBoxSearch;
	
	public WebElement getTxtBoxSearch() {
		return txtBoxSearch;
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Autonmation Testing')])[2]")
	private WebElement result;
	
	public WebElement get2ndresult() {
		return result;
	}
}
