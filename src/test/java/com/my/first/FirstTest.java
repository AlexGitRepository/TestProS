package com.my.first;

import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
    
	private WebDriver driver;
	private String baseUrl = "https://www.google.com.ua";
	
	@BeforeTest
    public void setUp() throws Exception {
    	driver = new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
	
	@Test
	public void testOne() throws Exception {	
		driver.get(baseUrl);
		assertTrue(true);
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}
}
