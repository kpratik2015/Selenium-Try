package com.clsa.qa.selenium.browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		Dimension d = driver.manage().window().getSize();
		
		driver.manage().window().setSize(new Dimension(d.width/2, d.height/2));
		
		WebElement origin = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
		
		Select origin_select = new Select(origin);
		
		origin_select.selectByIndex(3);
		
		origin_select.selectByValue("IXB");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]")).click();
		
		origin_select.selectByVisibleText("Delhi (DEL)");
		
		
		
		
	}

}
