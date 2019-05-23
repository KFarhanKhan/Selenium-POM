package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.testingPagdeObjects.clickObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mainPageLunching {
	WebDriver driver;

	@BeforeTest

	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		String text = driver.getTitle();
		System.out.println("your Title is " + text);

	}

	@Test
	public void signin() {
		clickObjects ck = new clickObjects(driver);
		ck.clicme.click();

	}

	

	@AfterTest
	public void closeUp() {
		driver.close();

	}
}
