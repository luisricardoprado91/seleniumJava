package br.com.selenium.commons;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	private Utils utils;

	public OpenBrowser(Utils utils) {

		this.utils = utils;
	}

	public void doOpenBrowser() {
		System.setProperty("webdriver.gecko.driver", "lib\\geckodriver.exe");
		utils.setDriver(new ChromeDriver());
		utils.getDriver().manage().window().maximize();
		utils.getDriver().get("https://www.americanas.com.br");

	}

	public Utils getUtils() {
		return utils;
	}

	public void setUtils(Utils utils) {
		this.utils = utils;
	}

}
