package vishnu;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {

	public void Multi() {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\OneDrive\\Desktop\\Selinium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			driver.findElement(By.linkText("Forgotten account?")).click();
			Set<String> a=driver.getWindowHandles();
			Iterator<String> it=a.iterator();
			while(it.hasNext())
			{
			String childwindow=it.next();
			driver.switchTo().window(childwindow);
			}
		}
			catch(Exception exception)
			{
				System.out.println(exception);
			}

			
		
	}

	public static void main(String[] args) {
		Multiplewindow obj=new  Multiplewindow();
		obj.Multi();
		
	}

}

	

	
