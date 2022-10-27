package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*
		//Enter Key
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("selenium" +Keys.ENTER);
        */
		
		/*
       //Key Down()
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("selenium" +Keys.ENTER);
        Actions actionProvider = new Actions(driver);
        Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
        keydown.perform();
        */
		
		//key up()
		 driver.get("https://www.google.com");
	        WebElement searchbox = driver.findElement(By.name("q"));
	        Actions actionProvider = new Actions(driver);
	        actionProvider.keyDown(Keys.SHIFT).sendKeys(searchbox, "selenium").keyUp(Keys.SHIFT).sendKeys("selenium");
	        searchbox.clear();
	              
	      System.out.print("This is executed & passed");
        
        Thread.sleep(2000);
        driver.quit();
        
        
        
        
        
        
        
        
	}
}
