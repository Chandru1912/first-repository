package org.maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumClass 

{
   public static void main(String[] args) throws InterruptedException 
   {
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.flipkart.com/");
	      driver.manage().window().maximize();
	      Actions a = new Actions(driver);
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
	    //  WebElement login = driver.findElement(By.xpath("(//a[contains(@class,'K05FV0')])[1]"));
	     // a.moveToElement(login).perform();
	      //driver.findElement(By.xpath("//a[@class='CfNfim' and @title='My Profile']")).click();
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	      List<WebElement> li = driver.findElements(By.xpath("//div[@class='nIDtl3']//p"));
	      for (WebElement p : li)
	      {
	    	  System.out.println(p.getText());
	      }
	      js.executeScript("window.scrollTo(0,0)");
	      Thread.sleep(3000);
	      List<WebElement> elements = driver.findElements(By.xpath("//input[@name='q']"));

//	      for (WebElement ele : elements) 
//	      {
//	          if (ele.isDisplayed()) {
//	              ele.sendKeys("watches");	              
//	          }
//	      }
   }
}
