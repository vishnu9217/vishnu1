package vishnu;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
 
	public void findScreenShot() {
		try
		{
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\vishn\\OneDrive\\Desktop\\Selinium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			
			File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			org.openqa.selenium.io.FileHandler.copy(screen,new File("C:\\Users\\vishn\\OneDrive\\Desktop\\vishnu\\abc.jpeg"));
		}
		catch(Exception exception)
		{
		System.out.println(exception);
}
}
public static void main(String[] args) {
	Screenshot  Obj=new Screenshot();
	Obj.findScreenShot();
		

	}

}