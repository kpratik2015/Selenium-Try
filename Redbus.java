package com.clsa.qa.selenium.browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redbus {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.redbus.in/");
//		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//*[@id=\"sign-in-icon-down\"]")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"signInLink\"]")).click();
//		
//		WebElement frame = driver.findElement(By.xpath("//*[@class='modalIframe']"));
//		
//		driver.switchTo().frame(frame);
//		
//		driver.findElement(By.xpath("//*[@id=\"signInView\"]/div[2]/div/div[3]/button")).click();
//		
//		
		
		driver.get("http://spicejet.com/");
		
		
		Dimension d = driver.manage().window().getSize();
		
		driver.manage().window().setSize(new Dimension(d.width/2, d.height/2));
		
		WebElement r_trip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		if(!r_trip.isSelected())
			r_trip.click();
		
		WebElement origin = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		
		if(origin.isDisplayed()) {
			origin.clear();
			origin.sendKeys("chen");
			WebElement dest = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
			dest.clear();
			dest.sendKeys("pun");
		}
		else {
			origin = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
			Select origin_select = new Select(origin);
			origin_select.selectByVisibleText("Chennai (MAA)");
			
			WebElement dest = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1"));
			Select dest_select = new Select(dest);
			dest_select.selectByVisibleText("PNQ");
		}
		
//		driver.findElement(By.xpath("//*[@id=\"flightSearchContainer\"]/div[4]/button")).click();
//		
//		String month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText().toString();
//		
//		while( !month.equals("December") ) {
//			
//			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
//			month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText().toString();
//		}
//		
////		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[3]/a")).click();
//		
//		
//		driver.findElement(By.linkText("17")).click();
//		
		
		while(driver.findElements(By.xpath("//td[@data-month='11' and @data-year='2018']/a[text()='18']")).size() == 0 ) {
//			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		driver.findElement(By.xpath("//td[@data-month='11' and @data-year='2018']/a[text()='18']")).click();
	}

}
