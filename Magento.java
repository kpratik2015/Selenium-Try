package com.clsa.qa.selenium.browsers;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Magento {
	
	public static void main(String[] args) throws InterruptedException {
		
		new Magento().register();
		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://magento.com/");
//		
//		WebElement products = driver.findElement(By.linkText("Products"));
//		
//		Actions act = new Actions(driver); 
//		
//		act.moveToElement(products).build().perform();
//		
//		act.keyDown(Keys.SHIFT).build().perform(); // shift is pressed
//		
//		// anything in between with shift 
//		
//		act.keyUp(Keys.SHIFT).build().perform(); // shift is lifted 
//		
//		driver.quit(); // browsers spawned by the browser are also closed
	}
	
	public void register() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://magento.com/");
		
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/div/nav/div/ul/li[9]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div[2]/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Pratik");
		
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Kataria");
		
		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("hello@pratikkataria.com");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Welcome123");
		
		driver.findElement(By.xpath("//*[@id=\"confirmation\"]")).sendKeys("Welcome123");
		
		driver.findElement(By.xpath("//*[@id=\"agree_terms\"]")).click();
		
		WebElement frame = driver.findElement(By.xpath("//*[@role='presentation']"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Terms and Conditions")).click();
		
		System.out.println(driver.getWindowHandle());
		
		Set<String> winids = driver.getWindowHandles();
		
		driver.switchTo().window(winids.toArray()[1].toString());
		
		driver.findElement(By.linkText("Magento Privacy Policy")).click();
		
//		driver.switchTo().window(winids.toArray()[0].toString());
//		OR
		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);
		
		driver.close();
		
//		driver.quit(); // browsers spawned by the browser are also closed
		
	}
	
	public void login() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://magento.com/");
		
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/div/nav/div/ul/li[9]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("natarajan.ramanathan93@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Welcome123");
		
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		
		String ID = driver.findElement(By.xpath("//*[@id=\"screen-page\"]/div[3]/div[2]/div[1]/div/div[1]/span")).getText();
		
		
		
		System.out.println("ID match as per expectation: " + ID.equals("ID: MAG003417822"));
		
		
		driver.findElement(By.linkText("Log Out")).click();
//		driver.close(); // only particular browser closes
		
		driver.quit(); // browsers spawned by the browser are also closed
	}
	

}
