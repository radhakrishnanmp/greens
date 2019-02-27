package Seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class dresses {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAPTOP\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.in");
        driver.manage().window().maximize();
     /*   Actions ac =new Actions(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ac.moveToElement(driver.findElement(By.id(id)))*/
	}

}
