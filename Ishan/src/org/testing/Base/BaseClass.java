package org.testing.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public ChromeDriver d ;
	@BeforeMethod
public void before() throws IOException
{
	System.setProperty("webdriver.chrome.driver", "../GitHubLogin_Logout/chromedriver.exe");
	d = new ChromeDriver();
	d.get("https://github.com/login");
	d.manage().window().maximize();
	}
@AfterMethod
public void after()
{
    d.close();
}
}