package Orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclassmethods {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "D:\\java partices\\Selenium\\chromedriver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.toolsqa.com/automation-practice-form");
     Select continent=new Select(driver.findElement(By.xpath("//select[@name='continents']")));
    continent.selectByVisibleText("Africa");
    Thread.sleep(10000);
     continent.selectByIndex(3);
     Thread.sleep(10000);
     continent.selectByValue("EU");
     Thread.sleep(10000);
    
	}

}
