package Intro;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test3 {
	
	@Parameters({"URL"})
	@Test
	public void dWebloginCarLoanHome(String url) {
		System.out.println("4.weblogincarHome"+url);
	}
	@Test(dataProvider = "getData")
	public void eMobileLoginCarLoanHome(String username,String password) {
		System.out.println("5.mobilelogincarloanHome");		
		System.out.println(username);
		System.out.println(password);


	
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data [0][0]= "firstsetusername";
		data[0][1]="password";
		data[1][0]="secondsetusername";
		data[1][1]="secong password";
		data[2][0]="thirdsetusername";
		data[2][1]="thirs password";
		return data;
		
	}

}

