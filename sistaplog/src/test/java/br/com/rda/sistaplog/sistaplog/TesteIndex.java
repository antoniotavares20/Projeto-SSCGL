package br.com.rda.sistaplog.sistaplog;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TesteIndex {
	
	@Test
	public void teste() {
	//	System.setProperty("webdriver.gecko.driver","C:/Users/Antonio Tavares/Documents/seleniumIDE/drivers/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
//	WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		//existem outros modos de textes array e true
	}

}
