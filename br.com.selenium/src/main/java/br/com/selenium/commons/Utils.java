package br.com.selenium.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

	private WebDriver driver = new ChromeDriver();

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {

		this.driver = driver;

	}
}
