package edu.uninabuco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterVehicleData {
	
	protected static WebDriver driver;
	protected static WebDriverWait wait;

	public EnterVehicleData(WebDriver driver) {
		EnterVehicleData.driver = driver;
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using="make")
	WebElement comboMakeWB;
	
	@FindBy(how= How.ID, using="engineperformance")
	WebElement campoEngine;
	
	@FindBy(how= How.ID, using="dateofmanufacture")
	WebElement campoDate;
	
	public void selecionarMake(String make) {	
		Select comboMake = new Select(comboMakeWB);
		comboMake.selectByVisibleText(make);
		
	}
	
	public void preencherEngine(String engine) {
		campoEngine.sendKeys(engine);
	}
	
	public void preencherDate(String date) {
		campoDate.sendKeys(date);
	}
}
