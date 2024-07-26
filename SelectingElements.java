package testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingElements {

	public static void main(String[] args) throws InterruptedException {
		// Seelcting elements from colors
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//clicking single element
		/*
		driver.findElement(By.xpath("//option[@value='white']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='green']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='yellow']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='blue']")).click();
		Thread.sleep(1000);
		*/
		
		//printing all the values
		/*
		List<WebElement> options=driver.findElements(By.xpath("//select[@class='form-control' and @id='colors']"));
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		*/
		
		
		driver.quit();
	}

}
