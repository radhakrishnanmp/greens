package Seleniumtest;
import java.awt.Checkbox;
import java.sql.DriverManager;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class date {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAPTOP\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// implicit
	
		driver.navigate().to("https://www.adactin.com/HotelApp/index.php");
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("radhakrishnan");
		driver.findElement(By.id("password")).sendKeys("Wellpoint");
		driver.findElement(By.id("login")).click();
		WebElement drop= driver.findElement(By.id("datepick_out"));
		drop.sendKeys("06/02/2019");
		drop.clear();
		drop.sendKeys("08/02/2019");
		Select multi= new Select (driver.findElement(By.id("location")));
		
		
		List<WebElement> listoflocation = multi.getOptions();	
		for (WebElement e : listoflocation ) {
			System.out.println("the location is "+ e.getText());
			
		}
		multi.selectByIndex(1);
		driver.findElement(By.id("Submit")).click();
		
		//driver.findElement(By.id("radiobutton_1")).click();
		WebElement checkbox= driver.findElement(By.id("radiobutton_1"));
		System.out.println("displayed==>"+checkbox.isDisplayed());
		System.out.println("enabled==>"+checkbox.isEnabled());
		boolean result=checkbox.isSelected();
		System.out.println(result);
		checkbox.click();
		result=checkbox.isSelected();
		System.out.println(result);
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("radhakrishnan");
		driver.findElement(By.id("last_name")).sendKeys("r");
		driver.findElement(By.id("address")).sendKeys("chennai");
		driver.findElement(By.id("cc_num")).sendKeys("1234567997894578");
		Select cd= new Select (driver.findElement(By.id("cc_type")));
		cd.selectByIndex(1);
		Select cs= new Select (driver.findElement(By.id("cc_exp_month")));
		cs.selectByIndex(2);
		Select cm= new Select (driver.findElement(By.id("cc_exp_year")));
		cm.selectByIndex(10);
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		driver.findElement(By.id("book_now")).click();
		
		// explicit
		WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("order_no")));
		
		WebElement on=driver.findElement(By.id("order_no"));
		String msg=on.getAttribute("value");
		System.out.println("the order no is "+ msg);
	}

}
