package com.seleniumgitmavenjenkin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

	@Test
	public void loginpage()
	{
		System.out.println("Testcase-1");
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println("newly added1");
		System.out.println("newly added");
		System.out.println("newly added2");
		System.out.println("newly added3");

		driver.quit();		
		
	}
	@Test
	public void loginpage1()
	{
		System.out.println("Testcase-2");
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println("newly added");
		System.out.println("newly added");
		driver.quit();		
		
	}

}
