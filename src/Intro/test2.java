package Intro;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test2 {
	
	
	@Test
	public void aWebloginCarLoan() {
		System.out.println("1.weblogincar");
	}
	@BeforeMethod
	public void beforeevery()
	{
	System.out.println("before method execution");	
	}
	@Test(groups= {"Smoke"})
	public void bMobileLoginCarLoan() {
		System.out.println("2.mobilelogincarloan");		
	}
	@Test (groups= {"Smoke"})
	public void cLoginAPIcarLoan() {
		System.out.println("3.carLoginAPI");
	
	}

}

