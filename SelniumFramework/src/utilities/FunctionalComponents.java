package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class FunctionalComponents {
	
	WebDriver driver;
	
	public void launchApplication() {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Automation\\ChromeDriver\\chromedriver.exe");  
          
          // Instantiate a ChromeDriver class.     
     WebDriver driver=new ChromeDriver();  																							
       
        // Launch Website  
     driver.navigate().to("http://www.javatpoint.com/");  
       
      //Maximize the browser  
       driver.manage().window().maximize();  
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       Actions actions = new Actions(driver);
       WebElement element = driver.findElement(By.xpath("//a[contains(text(),'1st July - Radio Button Vs. Checkbox button')]"));
       //actions.contextClick(element).perform();
      
       JavascriptExecutor js =  (JavascriptExecutor) driver;
       
       js.executeScript("arguments[0].click();",element);
       actions.moveToElement(element).build().perform();
       
     //element.click();
     String abc =  driver.getCurrentUrl();
     System.out.println(abc);
      
      
      WebElement header = driver.findElement(By.xpath("//h1[contains(text(),'Radio Button Vs. Checkbox button')]"));
      String comp = header.getText();
      String act = "Radio Button Vs. Checkbox button";
      Assert.assertEquals(comp, act);
      
      
      //driver.switchTo().frame(1);
      
      Select select = new Select(driver.findElement(By.xpath("")));
      
      select.selectByValue("test");
      
     
       
       driver.quit();
      
       
	}
	
	
	
	
	public void closeApplication() {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.quit();
		
		/*Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(""))).build().perform();*/
		
	
		
	}

}
