package com.sztest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class BrowserTest
{

	private WebDriver driver;
	
	@Before
	public void setUp()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
	}

	@Test
	public void canSearch()
	{
		driver.get("http://duckduckgo.com/");
		driver.findElement(By.cssSelector("input#search_form_input_homepage")).sendKeys("sz\n");
		assertThat(driver.getTitle(), containsString("sz"));
	}

	@After
	public void tearDown()
	{
		driver.close();
	}
}
