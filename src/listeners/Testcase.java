package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerTest.class)
public class Testcase {
	public WebDriver driver;
	
	@Test
	public void login() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Test\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 System.out.println("Login Testcase started");
		 driver.navigate().to("https://www.facebook.com/");
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 driver.manage().window().maximize();
		 driver.findElement(By.cssSelector("#email")).sendKeys("priyankas11@rocketmail.com");
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#pass")).sendKeys("Priya@72");
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#u_0_b")).click();
		 Thread.sleep(3000);
		 driver.quit();
		 
		 System.out.println("Git Repository Demo");
	}
	
	@Test
	public void TestFail()
	{
		System.out.println("The method is failed");
		Assert.assertTrue(false);
	}

	

	}


