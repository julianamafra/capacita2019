
import java.io.File;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import edu.uninabuco.pages.EnterVehicleData;
import edu.uninabuco.utils.Constants;

public class TestAutomobile {
	
	static WebDriver driver;
	static WebDriverWait wait;
	static EnterVehicleData vehicle;

		
	@Before
	public void setUp() throws Exception {
	   File browser = new File(Constants.PATH_CHROMEDRIVER);
	   System.setProperty("webdriver.chrome.driver", browser.getAbsolutePath());
	   driver  = new ChromeDriver();
	   wait    = new  WebDriverWait(driver,200);
	   vehicle = new EnterVehicleData(driver);
	
	}
	 

	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		driver.get("http://sampleapp.tricentis.com/101/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"nav_automobile\"]")).click();
		vehicle.selecionarMake("Honda");
		vehicle.preencherEngine("2000");
		vehicle.preencherDate("02/01/2018");
		

	}

}
