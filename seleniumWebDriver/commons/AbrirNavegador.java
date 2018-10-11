package commons;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbrirNavegador {
	private Utils utils;

	public AbrirNavegador(Utils utils) {

		this.utils = utils;
	}

	public void abrirNavegador() {
		System.setProperty(utils.getNavegadorDriver(), utils.getEnderecoDriver());
		utils.setDriver(new FirefoxDriver());
		utils.getDriver().manage().window().maximize();
		utils.getDriver().get(utils.getUrl());

	}

	public Utils getUtils() {
		return utils;
	}

	public void setUtils(Utils utils) {
		this.utils = utils;
	}
}
