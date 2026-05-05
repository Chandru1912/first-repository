package org.maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentClass 
{
	public static WebDriver wb;
	public static Alert a;
	public static Actions act;
	public static WebElement searchBox;
	
	public static void driver() 
	{
		wb = new ChromeDriver();
	}
	
	public static void urlGet(String path) 
	{
		wb.get(path);
	} 
	
	public static void maximizeTheWindow()
	{
		wb.manage().window().maximize();
	}
	
	public static void urlTitle() 
	{
		String Title=wb.getTitle();
		System.out.println(Title);
	} 
	
	public static void urlCurrent() 
	{
		String Currenturl=wb.getCurrentUrl();
		System.out.println(Currenturl);
	} 
	
	public static void valuePassing()
	{
	  WebElement searchBox = wb.findElement(By.className("gLFyf"));
	  searchBox.sendKeys("Toyota");
	}
	
	public static void switchToFrame(int index)
	{
		wb.switchTo().frame(index);
	}
	
	public static void switchToWindow(String ur)
	{
		wb.switchTo().window(ur);
	}
	
	public static String getWindowHandle()
	{
		String s= wb.getWindowHandle();
		return s ;
	}
	
	public static Set<String> getWindowHandles()
	{
		Set<String> s= wb.getWindowHandles();
		return s;
	}
	
	public static void valuesToSet()
	{
		List<String> li= new LinkedList();
		li.addAll(getWindowHandles());
	}
	
	public static void alertPresent()
	{
		WebDriverWait wait= new WebDriverWait(wb,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void elementSelection()
	{
		WebDriverWait wait= new WebDriverWait(wb,Duration.ofSeconds(10));
		boolean bool = false;
		wait.until(ExpectedConditions.elementSelectionStateToBe(searchBox,bool));
	}
	
	public static void title()
	{
		WebDriverWait wait= new WebDriverWait(wb,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs(getWindowHandle()));
	}
	 
	public static void navigateBack()
	{
		wb.navigate().back();
	}
	
	public static void refreshingTheWindow()
	{
		wb.navigate().refresh();
	}
	
	public static void navigateForward()
	{
		wb.navigate().forward();
		
	}
	
	public static void selectByIndex(WebElement searchBox,int value)
	{
		Select s= new Select(searchBox);
		s.selectByIndex(value);
	}
	
	public static void selectByValue(WebElement searchBox,String val)
	{
		Select s= new Select(searchBox);
		s.selectByValue(val);
	}
	
	public static void selectByText(WebElement searchBox,String values)
	{
		Select s= new Select(searchBox);
		s.selectByVisibleText(values);
	}
		
	public static void enterPress() throws AWTException
	{
	  Robot r= new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void alertAccepting()
	{
		wb.switchTo().alert();
		a.accept();
	}
	
	public static void alertDismiss()
	{
		wb.switchTo().alert();
		a.accept();
	}
	public static void alertSendkeys()
	{
		wb.switchTo().alert();
		a.sendKeys("Level Completed");
	}
	public static void alertGettext()
	{
		wb.switchTo().alert();
		String text= a.getText();
		System.out.println(text);
	}
	
	public static void performDraganddrop()
	{
		new Actions(wb);
		act.dragAndDrop(null,null).perform();	
	}
	
	public static void click()
	{
		searchBox.click();
	}
	
	public static void sendKeys()
	{
		searchBox.sendKeys("Chandru");
	}
	public static void performkeyUp()
	{
		new Actions(wb);
		act.keyUp(null,null).perform();	
	}
	
	public static void performkeyDown()
	{
		new Actions(wb);
		act.keyDown(null,null).perform();	
	}
	
	public static void performContextClick()
	{
		new Actions(wb);
		act.contextClick().perform();	
	}
	public static void performDoubleClick()
	{
		new Actions(wb);
		act.doubleClick().perform();	
	}
	public static void performBuild()
	{
		new Actions(wb);
		act.build().perform();	
	}
	
	public static void executingJavascript()
	{
		JavascriptExecutor j=(JavascriptExecutor)wb;
		j.executeScript("arguments[0].getAttribute('value','Toyota')", searchBox);
	}
	
	public static void closingBrowser() 
	{
		wb.quit();
	} 
	public static void quitingBrowser() 
	{
		wb.close();
	} 
	
	public static void visiblity()
	{
		WebDriverWait wait= new WebDriverWait(wb,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(searchBox));
		
	}
	
	public static void visibilityOfAll()
	{
		WebDriverWait wait= new WebDriverWait(wb,Duration.ofSeconds(10));
		WebElement li = null;
		wait.until(ExpectedConditions.visibilityOfAllElements(li,searchBox));		
	}
	
	public static void visiblityElementLocation()
	{
		WebDriverWait wait= new WebDriverWait(wb,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(null));		
	}
	
	public static void textInValue()
	{
		WebDriverWait wait= new WebDriverWait(wb,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementValue(searchBox, null));
	}
	
	public static void isDisplayed()
	{
		if(searchBox.isDisplayed())
		{
			System.out.println("Displayed");
		}
		else
		{
			System.out.println("NotDisplayed");
		}	
	}
	
	public static void presenceOfAllElementsLocatedBy()
	{
		WebDriverWait wait= new WebDriverWait(wb,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(null));
		
	}
	
	public static void textPresent()
	{
		WebDriverWait wait= new WebDriverWait(wb,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(searchBox, null));
	}
	
	public static void textInElement()
	{
		WebDriverWait wait= new WebDriverWait(wb,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(null, null));		
	}
	
	public static void isEnabled()
	{
		if(searchBox.isEnabled())
		{
			System.out.println("Enabled");
		}
		else
		{
			System.out.println("NotEnabled");
		}	
	}
	
	public static void isSelected()
	{
		if(searchBox.isDisplayed())
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("NotSelected");
		}	
	}
	
	public static void parentFrame()
	{
		wb.switchTo().parentFrame();
	}
	
	public static void defaultFrame()
	{
		wb.switchTo().defaultContent();
	}

}
