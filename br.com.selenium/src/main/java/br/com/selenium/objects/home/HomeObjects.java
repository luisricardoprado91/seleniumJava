package br.com.selenium.objects.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.selenium.commons.Utils;

public class HomeObjects {
	Utils utils;

	private WebElement loginCadastrese = utils.getDriver().findElement(By.id("h_usr-link"));
	private WebElement loginButton = utils.getDriver().findElement(By.id("h_usr-signin"));
	private WebElement cadastreButton = utils.getDriver().findElement(By.id("usr-signup"));

	public WebElement getLoginCadastrese() {

		return loginCadastrese;
	}

	public WebElement getLoginButton() {

		return loginButton;

	}

	public WebElement getCadastreseButton() {
		return cadastreButton;
	}
}
