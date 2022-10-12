package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

public static void main(String[] args) throws InterruptedException {
	

	//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
    
    driver.get("https://www.google.com");
    driver.navigate().to("https://www.automationstepbystep.com");
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
    
    driver.navigate().back();
    Thread.sleep(2000);
    driver.navigate().forward();
    Thread.sleep(2000);
    driver.navigate().refresh();
    
   
    driver.close();
    
    
   
	
	
}
}
