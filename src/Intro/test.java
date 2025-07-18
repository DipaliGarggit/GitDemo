package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	public String baseUrl= "https://rahulshettyacademy.com/dropdownsPractise/";
	public WebDriver driver;
	@BeforeClass
	public void bfclass() {
		System.out.println("Before test class");
	}
	@BeforeTest
	public void setBaseURL() {
		System.setProperty("webdriver.chrome.driver", "/Users/DipaliGa/Documents/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	@Test
	public void verifyTitle() {
		String expectedTitle="QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test (priority =0)
	public void c_test() {
		Assert.fail();
	}
	@Test
	public void a_test() {
		Assert.assertTrue(true);
	}
	@Test
	public void b_test() {
		throw new SkipException("Skipping b_Test...");
	}
	@AfterTest
	public void endSession() {
		driver.quit();
	}
	@AfterClass
	public void afclass() {
		System.out.println("After test class");
	}

}

