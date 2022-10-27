package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

public static void main(String[] args) throws InterruptedException{
	

	//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	
    //Waits
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(8));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(8));
    
    driver.get("https://www.google.com");
    
    /*
    String originalwindow = driver.getWindowHandle();
    driver.navigate().to("https://www.automationstepbystep.com");
    
   
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
    
    //Navigate Statements
    driver.navigate().back();
    Thread.sleep(2000);
    driver.navigate().forward();
    Thread.sleep(2000);
    driver.navigate().refresh();
    
    
    driver.switchTo().newWindow(WindowType.TAB);
    driver.switchTo().newWindow(WindowType.WINDOW);
    driver.switchTo().window(originalwindow);
*/
   
    //Frames
    driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
    driver.switchTo().frame("packageFrame");
    driver.findElement(By.linkText("Alert")).click();
    //To come outside of that specific frame
    Thread.sleep(2000);
    driver.switchTo().defaultContent();

   /*
    //Get width and height of window
    driver.manage().window().getSize().getWidth();
    driver.manage().window().getSize().getHeight();
    
    */
    
    Dimension size= driver.manage().window().getSize();
    System.out.println(size.getWidth());
    System.out.println(size.getHeight());
    
    //we can set size also
    driver.manage().window().setSize(new Dimension(800,600));

    
    Thread.sleep(3000);
    driver.close();

}
}
