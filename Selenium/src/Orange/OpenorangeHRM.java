package Orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenorangeHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java partices\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[contains(text(),'TASKS')]")).click();
		Thread.sleep(10000);
		for(int i=1;i<=20;i++) {
			WebElement checkbox= driver.findElement(By.xpath("//*[@id=\"tasksListForm\"]/table/tbody/tr[2]/td/table/tbody/tr["+(2+i)+"]/td[7]/input"));
		    checkbox.click();
		    Thread.sleep(4000);
		    }
		driver.findElement(By.xpath("//input[@value='Complete Selected Tasks']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Completed Tasks')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='arrow']")).click();
		driver.findElement(By.xpath("//img[@class='x-form-radio']")).click();
		Thread.sleep(10000);
		String[] arr1=new String[] {"string","One-page web site","Consulting","Web site creation","Web site maintenance","Web site creation","Web site maintenance","Updating the current web site","Web site maintenance","Administration","Finance&Accounting","General","System Administration"};
		for(int i1=0;i1<=11;i1++) {
			WebElement checkbox=driver.findElement(By.xpath("//span[@title='"+arr1[1+i1]+"']"));
			checkbox.click();
			Thread.sleep(5000);
			
		}
		driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
	}

}
