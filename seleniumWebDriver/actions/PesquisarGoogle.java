package actions;

import org.apache.xml.serializer.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumWebDriver.commons.Classes;

public class PesquisarGoogle {
	Classes classes = new Classes();
	Utils utils;

	@BeforeMethod
	// BeforeMethod executa sempre antes de todo @Test
	public void abrirNavegador() {

		classes.abrirNavegador.abrirNavegador();

	}

	@Test
	// é a esecução de cada teste
	public void digitarCampoDePesquisa() {

		WebElement inputPesquisa = classes.utils.getDriver().findElement(By.id("lst-ib"));
		inputPesquisa.sendKeys("automacao de testes");
	}

	@Test
	public void clicarBotaoPesquisar() {
		digitarCampoDePesquisa();

		WebElement botaoPesquisar = classes.utils.getDriver()
				.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[3]/center[1]/input[1]"));

		botaoPesquisar.click();
	}

	@AfterMethod
	// AfterMethod executa sempre antes de todo @Test
	public void fecharNavegador() {
		classes.fecharNavegador.fecharNavegador();
	}

	public Utils getUtils() {
		return utils;
	}

	public void setUtils(Utils utils) {
		this.utils = utils;
	}
}
