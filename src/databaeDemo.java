import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class databaeDemo {

	public static void main(String[] args) throws SQLException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Priya\\driver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();;
		// TODO Auto-generated method stub
		String host ="localhost";
		String port ="3306";
		Connection conn = DriverManager.getConnection("jdbc:mysql://" +host+ ":" +port+ "/Qadbt", "root", "root");
		 System.out.println("Demo of Git");
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select * from employeeinfo where name = 'Sam'");
		while(rs.next())
		{
			 
			driver.get("https://login.salesforce.com/");
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(rs.getString("name"));
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(rs.getString("location"));
		}
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.close();
		
		
	}

}
