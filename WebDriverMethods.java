package testing;

import java.time.Duration;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// SeleniumWebDriver methods
		//---------------------------
		//1) getmethods or get():We can accees these methods through web driver instance
		//get(url):it returns the url on the browser
		//driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();
		
		//getTitile:will return the title of the page
		//System.out.println("title of the page:" +driver.getTitle());
		//getCurrentUrl:will return of the current url of the page
		//System.out.println("current url :"+ driver.getCurrentUrl());
		//getPageSource:will return the page source code | In simple words Dom
		//System.out.println(driver.getPageSource());
		//getwindowhandle;will return the id of window
		//System.out.println(driver.getWindowHandle());
		//or you can store in string format
		/*
		 String WinId=driver.getWindowHandle();
		System.out.println("window id is :" +WinId );
	     */
		//getWindowHandles:will return the id's of windows
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//we use this wait it will help to find the element with given time
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String>WinIds=driver.getWindowHandles();
		System.out.println(WinIds);
		*/
		
		//2)Conditional methods:access these commands through webElement
		//-----------------------------------------------------------------
		//-->this will return the boolean values
		//isDisplayed():It will check wheather the element is displayed or not
		/*
		Boolean status=driver.findElement(By.xpath("//img[@class='wikipedia-icon']")).isDisplayed();
		System.out.println(status);
		*/
		//isEnabled():this will check the dropDown,input,radiobuttons etc...
		/*
		Boolean status=driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
		System.out.println(status);
		*/
		
		//isSelected():which will tell element is selected or not
		/*
		WebElement male_rdo=driver.findElement(By.xpath("//input[@id='male']"));
		WebElement female_rdo=driver.findElement(By.xpath("//input[@id='female']"));
		System.out.println("before Selection...");
		System.out.println(male_rdo.isSelected());
		System.out.println(female_rdo.isSelected());
		//clicking male radion buttom
		System.out.println("after clicking male radio btn");
		male_rdo.click();
		System.out.println(male_rdo.isSelected());
		System.out.println(female_rdo.isSelected());
		//radio btn selects only one opton 
		//clicking female raduo button
		System.out.println("after clicking female radio btn");
		female_rdo.click();
		System.out.println(male_rdo.isSelected());
		System.out.println(female_rdo.isSelected());
		*/
		//browser methods
		//-------------------
		//close():this will close a particular window at a time
		/*
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		driver.close();
		*/
		//quit():this will close all the windows at a time
		/*
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		driver.quit();
		*/
		//Wait Methods
		//--------------
		//there are 2 types of waits are there
		//1)Implicit wait:This wait will be applicable for all the inputs/statements
		//-->It helps to overcome the problem of synchronization.
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("rahul");
		Thread.sleep(2000);
		driver.close();		
		*/
		//Explicit wait:In this it will consider conditions and time
		/*
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement txtName=myWait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//input[@id='name']")));
		txtName.sendKeys("Rahul gannaji");
		WebElement txtName1=myWait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//input[@id='email']")));
		txtName1.sendKeys("Rahulgannaji@.com");
		*/
		
		//5)Navigational methods:which is used to navigate to the pages
		//--------------------------------------------------------------
		/*
		//navigate().to (url):it will navigate to the page
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		//Navigate().to back():it will go back to page line "undo"
		driver.navigate().back();
		Thread.sleep(2000);
		//Navigate().to forward():it will come to page like "redo"
		driver.navigate().forward();
		Thread.sleep(2000);
		//Navigate().to refresh():it will refresh the page
		driver.navigate().refresh()
		Thread.sleep(2000);
		driver.close();	
		*/
		
	}

}
