import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class carlene {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manje\\eclipse-workspace\\Adactin\\driver\\chromedriver110.exe");
	WebDriver driver= new ChromeDriver();
		driver.get("https://www.caratlane.com/");
		driver.manage().deleteAllCookies();
		Alert a= driver.switchTo().alert();
		a.accept();
	}
}
