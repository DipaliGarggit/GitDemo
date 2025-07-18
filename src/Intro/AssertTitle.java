package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertTitle {
	public static String baseUrl = "https://rahulshettyacademy.com/dropdownsPractise/";
	
	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/DipaliGa/Documents/chromedriver.exe");
		
		driver.get(baseUrl);
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		//verifyHomepageTitle();
		driver.quit();	
		
	}
	public static void verifyHomepageTitle() {
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle=driver.getTitle();
		try {
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Test Passed");
		}	catch(Throwable e) {
			System.out.println("Test Failed");
		}
	}

}
