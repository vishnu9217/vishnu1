package vishnu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru {

	public static void main(String[] args) {
		System.setProperty("webdriver .chrome.driver","\"C:\\Users\\vishn\\OneDrive\\Desktop\\Selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/"); 
		driver.findElement(By.name("userName")).sendKeys("vishnu");
		driver.findElement(By.name("password")).sendKeys("@!23");
		
		driver.findElement(By.name("submit")).click();
		

	}

}
