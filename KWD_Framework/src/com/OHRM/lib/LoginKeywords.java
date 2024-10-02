package com.OHRM.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginKeywords {
		
		WebDriver driver;
		
		public void launchBrowser() {
			
			 driver = new ChromeDriver();
		}
		
		public void navigateURL() throws InterruptedException {
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(5000);

	}
		public void enterUsername() {
			driver.findElement(By.name("username")).sendKeys("Admin");
		}
		public void enterPassword() {
			driver.findElement(By.name("password")).sendKeys("admin123");
		}
		public void clickLogin() {
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}

}
