package Intro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practise {

	public static void main(String[] args) throws InterruptedException {


		     System.setProperty("webdriver.chrome.driver", "/Users/DipaliGa/Documents/chromedriver.exe");

			WebDriver driver =new ChromeDriver();

			driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser
			//driver.get(baseUrl);
			String actualTitle=driver.getTitle();
			System.out.println(actualTitle);
			verifyTitle(actualTitle);
			//verifyHomepageTitle();
			driver.quit();	

						
	}
	public static void verifyTitle(String title) {
		try {
		Assert.assertEquals(title, "QAClickJet - Fligh Booking for Domestic and International, Cheap Air Tickets");
		System.out.println("Test Passed ");
		}catch (Throwable e) {
			System.out.println("Test Failed");
		}
		
	}

}
