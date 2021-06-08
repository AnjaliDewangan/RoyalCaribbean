package com.cyient.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.Super.WDriverWrapper;

@Test
public class FindACrusisesTest extends WDriverWrapper{
	
	@Test
	public void invalidCredentialTest() throws InterruptedException {
		
		//driver.findElement(By.xpath("//*[local-name()='svg:logo'][@class='highlight__content']")).click();
		driver.findElement(By.xpath("//div[@class='email-capture__body']//*[local-name()='svg']")).click();
		driver.findElement(By.xpath("//div[@class='headerMainToolbar__menu__icon']")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Find a Cruise ')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2021-2022 Cruises')]")).click();
		Thread.sleep(1000);Thread.sleep(1000);
		
		driver.findElement(By.id("rciFirstName")).sendKeys("anji");
		driver.findElement(By.id("rciLastName")).sendKeys("panji");

		driver.findElement(By.xpath("//select[@class='md-input']")).click();
		driver.findElement(By.xpath("//option[@value='IND']")).click();

		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();

		String actualValue = driver.findElement(By.xpath("//span[@id='rciEmailAddressMissing']")).getText();
		Assert.assertEquals(actualValue, "Missing Email Address");
	}
}
