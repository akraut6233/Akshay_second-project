package commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class get_Tital {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.Amazon.com");
	System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	System.out.println(driver.getTitle());
	
	
		
		
		
		
	}

}
