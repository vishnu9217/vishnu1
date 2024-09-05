package vishnu;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;;

public class Draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\OneDrive\\Desktop\\Selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement From=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement To=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions act = new Actions(driver);
		act.dragAndDrop(From,To).build().perform();
		WebElement from1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement to1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(from1, to1).build().perform();
	}

}
	