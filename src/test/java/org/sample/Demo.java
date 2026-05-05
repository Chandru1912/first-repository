package org.sample;

import java.awt.AWTException;

import org.maven.ParentClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo extends ParentClass
{

	public static void main(String[] args) throws AWTException 
	{
		driver();
		urlGet("https://www.google.com/");
		maximizeTheWindow();
		urlTitle();
		valuePassing();
		enterPress();
		//closingBrowser();
	}
}
