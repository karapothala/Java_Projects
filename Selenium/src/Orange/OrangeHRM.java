package Orange;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java partices\\Selenium\\chromedriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/user/submit_tt.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("============================");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'USERS')]")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Barber");
        driver.findElement(By.xpath("//div[@class='name']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).clear();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("barber@gmail.com");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='buttonIcon']")).click();
        Thread.sleep(3000);
        List<WebElement> elements=driver.findElements(By.xpath("//span[@class='approveTTIcon editing']"));
        Thread.sleep(6000);
        int  count=elements.size();
        System.out.println(count);
        /*for(int i=0; i<count; i++) {
        	String svalue=elements.get(i).getAttribute("value");
        	if(svalue.equalsIgnoreCase("approveTTIcon editing"));
        	elements.get(i).click();
        	break;*/
        	
        	for ( WebElement checkbox : elements ) {
        	    if ( !checkbox.isSelected() ) {
        	        checkbox.click();
        	
        	
        }
        	    driver.findElement(By.xpath("ext-comp-1069")).click();
        	    
        
		

	}

	}}
