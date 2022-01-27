package com.seleniumgitmavenjenkin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Username {

	@Test
	public void userlogin()
	{
		System.out.println("UserloginTestcase-1");
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.quit();		
		
	}
	@Test
	public void userlogin1()
	{
		System.out.println("userloginTestcase-2");
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println("Hi vasu");
		driver.quit();		
		
	}

}
