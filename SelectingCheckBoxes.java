package testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// Selecting the checkBoxes
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//selecting single checkbox
	    //driver.findElement(By.xpath("//input[@id='sunday']")).click();
		//selecting multiple checkboxes
		
	    List<WebElement>checkBoxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	    /*
	    for(WebElement CheBox:checkBoxes)
		{
			CheBox.click();
		}
		*/
	    //aproach 2
	    /*
		for(int i=0;i<checkBoxes.size();i++)
		{
			checkBoxes.get(i).click();
		}
		*/
		//Selecting last three checkboxes
	    /*
	    for(int i=4;i<checkBoxes.size();i++)
		{
			checkBoxes.get(i).click();
		}
	    */
		//selecting first 3 checkboxes
	    /*
	    for(int i=0;i<3;i++)
		{
			checkBoxes.get(i).click();
		}
	    */
	    //unselecting the checkboxesif they are selected
	    /*
	    for(int i=0;i<=3;i++)
		{
			checkBoxes.get(i).click();
		}
	    Thread.sleep(2000);
	    for(int i=0;i<checkBoxes.size();i++)
		{
			if(checkBoxes.get(i).isSelected())
			{
				checkBoxes.get(i).click();
			}
		}
	    Thread.sleep(2000);
	    driver.close();
	    */
	    
	}
}
