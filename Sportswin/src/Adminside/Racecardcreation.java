package Adminside;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Racecardcreation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java partices\\Sportswin\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://106.51.139.32/sportswin-admin/#/login");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin@itwinetech");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
        Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        Thread.sleep(5000);
        Actions actions1=new Actions(driver);
        WebElement Raceseason1=driver.findElement(By.xpath("//a[contains(text(),'Race Setup')]"));
        Thread.sleep(5000);
       actions1.moveToElement(Raceseason1).build().perform();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//a[contains(text(),'Race Season')]")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bangalore season");
       Thread.sleep(5000);
       Select Racevenue=new Select(driver.findElement(By.xpath("//select[@formcontrolname='racevenue']")));
       Racevenue.selectByVisibleText("Bangalore");
       Thread.sleep(5000);
       Select Racecalender=new Select(driver.findElement(By.xpath("//select[@formcontrolname='financialyear']")));
       Racecalender.selectByVisibleText("2019");
       Thread.sleep(5000);
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       Thread.sleep(10000);
       Actions action2=new Actions(driver);
       WebElement Raceseason2=driver.findElement(By.xpath("//a[contains(text(),'Race Season')]"));
       action2.moveToElement(Raceseason2).build().perform();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//a[contains(text(),' Race Season Dates ')]")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
       Thread.sleep(5000);
       Select Racevenue1=new Select(driver.findElement(By.xpath("//select[@formcontrolname='venue']")));
       Racevenue1.selectByVisibleText("Bangalore");
       Thread.sleep(5000);
       
       
       
        

	}

}
