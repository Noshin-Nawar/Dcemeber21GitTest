package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCrome {

	public static void main(String[] args) throws InterruptedException {
		
		
		Scanner scn = new Scanner(System.in);
		
		
		//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SALEMD\\Dec21Selenium\\1st_Selenium\\Drivers\\chromedriver.exe");
		
		
		//object creation of webdriver
		WebDriver driver = new ChromeDriver(); //object variable
		
		
		//go to website
		driver.get("https://www.google.com/");
		
		//maximize window
		driver.manage().window().maximize();
		
//		driver.get("https://www.amazon.com/");
//		driver.manage().window().maximize();
		
		//stop execution
		Thread.sleep(3000);
		//close browser
		driver.close();
		
	}
	
	
	
	
	
}
