package com.SeleniumAutomationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selpractise {
	// WebDriverManager.chromedriver().setup();

	public static void main(String[] args) {
		WebDriver EdgeDriver = new EdgeDriver();
		EdgeDriver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java");
		EdgeDriver.close();
	}
}
