package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegadorChrome {
	
	public static WebDriver abrirChrome(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drives\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
		
	}


}
