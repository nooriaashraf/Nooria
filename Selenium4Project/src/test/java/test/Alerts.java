package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    //Waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		
		//js alert
		driver.get("https://the-internet.herokuapp.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
		driver.findElement(By.linkText("JavaScript Alerts")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
	    Alert alert1 = driver.switchTo().alert();
	    String text= alert1.getText();
	    System.out.println(text);
	    alert1.accept();
	    if (driver.getPageSource().contains("You successfully clicked an alert"));
	    System.out.println("You successfully clicked an alert");
	    System.out.println("========================================");
	    
	    
	    //js confirm
	    driver.get("https://the-internet.herokuapp.com/");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("javascript:window.scrollBy(250,350)");
		driver.findElement(By.linkText("JavaScript Alerts")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
	    Alert alert2 = driver.switchTo().alert();
	    String text2= alert1.getText();
	    System.out.println(text2);
	    alert2.dismiss();
	    if (driver.getPageSource().contains("You clicked: Cancel"));
	    System.out.println("You clicked: Cancel");
	    System.out.println("========================================");
	    

	    
	    //js prompt
	    driver.get("https://the-internet.herokuapp.com/");
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("javascript:window.scrollBy(250,350)");
		driver.findElement(By.linkText("JavaScript Alerts")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	    Alert alert3 = driver.switchTo().alert();
	    String text3= alert1.getText();
	    System.out.println(text3);
	    alert3.sendKeys("Automation Step by Step");
	    Thread.sleep(2000);
	    alert3.accept();
	    if (driver.getPageSource().contains("You entered: Automation Step by Step"));
	    System.out.println("You entered: Automation Step by Step");
	    System.out.println("========================================");
	    
	    
	    
       driver.close();
       
	    
	    
	    
	    
	  
	  
		
		
		
		
		
		
		
		
	}
}
