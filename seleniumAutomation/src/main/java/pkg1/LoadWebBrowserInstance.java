package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadWebBrowserInstance implements Runnable 
{
	private String url;
	public LoadWebBrowserInstance(String url)
	{
		this.url = url;
	}
	
	public void run() {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\javaprograms\\eclipse workplace\\seleniumAutomation\\src\\main\\resources\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\repos\\NewRepo\\seleniumAutomation\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	}

}
