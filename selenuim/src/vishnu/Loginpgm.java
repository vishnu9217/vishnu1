package vishnu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpgm {
	public void login() {
		try {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\vishn\\OneDrive\\Desktop\\Selinium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			driver.findElement(By.id("email")).sendKeys("vishnu@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("@123");
			driver.findElement(By.id("loginbutton")).click();
		}
		catch(Exception exp)
		{
			System.out.println(exp);
		}
	}


	

public static void main(String[] args) {
	Loginpgm obj=new Loginpgm ();
	obj.login();
}

}

		

	


