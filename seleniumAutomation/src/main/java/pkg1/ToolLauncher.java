package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolLauncher {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\javaprograms\\eclipse workplace\\seleniumAutomation\\src\\main\\resources\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\repos\\NewRepo\\seleniumAutomation\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		
	}

}
