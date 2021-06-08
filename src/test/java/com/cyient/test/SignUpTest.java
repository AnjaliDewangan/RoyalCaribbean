package com.cyient.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.Super.WDriverWrapper;

public class SignUpTest extends WDriverWrapper{
	@Test
	public void signUpTest() throws InterruptedException {

		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Create an account']")).click();
		
		driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("Denis");
		driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("Richie");
		driver.findElement(By.xpath("//span[text()='Month']")).click();
		driver.findElement(By.xpath("//span[text()=' April ']")).click();
		driver.findElement(By.xpath("//span[text()='Day']")).click();
		driver.findElement(By.xpath("//span[text()=' 4 ']")).click();
		driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("2021");
		driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
		driver.findElement(By.xpath("//span[text()=' India ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("anji@gmail.com");
		driver.findElement(By.xpath("//input[@data-placeholder='Create new password']")).sendKeys("anji987");

		driver.findElement(By.xpath("//span[text()='Select one security question'][1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),' What was the first concert you attended? ')]")).click();
		driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("Maholi");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='checkbox'] /..")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' Done ']")).click();
	
		Assert.assertEquals(driver.getTitle(), "Royal Caribbean");
	}
}
