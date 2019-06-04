package br.com.selenium.objects.subscribe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.selenium.commons.Utils;

public class SubscribeObjects {
	Utils utils;

	private WebElement campoEmail = utils.getDriver().findElement(By.id("email-input"));
	private WebElement campoSenha = utils.getDriver().findElement(By.id("password-input"));
	private WebElement campoCpf = utils.getDriver().findElement(By.id("cpf-input"));
	private WebElement campoNome = utils.getDriver().findElement(By.id("name-input"));
	private WebElement campoNascimento = utils.getDriver().findElement(By.id("birthday-input"));
	private WebElement genderMasculino = utils.getDriver().findElement(By.id("gender_M"));
	private WebElement genderFeminino = utils.getDriver().findElement(By.id("gender_F"));
	private WebElement campoTelefone = utils.getDriver().findElement(By.id("phone-input"));
	private WebElement checkboxWhatsApp = utils.getDriver().findElement(By.id("receiveWhatsApp"));
	private WebElement checkboxEmails = utils.getDriver().findElement(By.id("offersEmail"));
	private WebElement submitButton = utils.getDriver().findElement(By.xpath("//button[@type='submit']"));

	public WebElement getCampoEmail() {
		return campoEmail;
	}

	public WebElement getCampoSenha() {
		return campoSenha;
	}

	public WebElement getCampoCpf() {
		return campoCpf;
	}

	public WebElement getCampoNome() {
		return campoNome;
	}

	public WebElement getCampoNascimento() {
		return campoNascimento;
	}

	public WebElement getGenderMasculino() {
		return genderMasculino;
	}

	public WebElement getGenderFeminino() {
		return genderFeminino;
	}

	public WebElement getCampoTelefone() {
		return campoTelefone;
	}

	public WebElement getCheckboxWhatsApp() {
		return checkboxWhatsApp;
	}

	public WebElement getCheckboxEmails() {
		return checkboxEmails;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

}
