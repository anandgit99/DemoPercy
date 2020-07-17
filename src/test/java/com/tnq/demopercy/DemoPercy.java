package com.tnq.demopercy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPercy {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().version("78").setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://practice.automationtesting.in/");

		driver.findElement(By.xpath("//*[text()='My Account']")).click();
		driver.close();

	}

}
