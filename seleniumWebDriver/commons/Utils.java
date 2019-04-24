package commons;
import org.openqa.selenium.WebDriver;

public class Utils {

	private String navegadorDriver = "webdriver.gecko.driver";
	private String enderecoDriver = "drivers\\geckodriver.exe";
	private String url = "https://www.google.com.br";

	private WebDriver driver;

	public String getNavegadorDriver() {
		return navegadorDriver;
	}

	public void setNavegadorDriver(String navegadorDriver) {
		this.navegadorDriver = navegadorDriver;
	}

	public String getEnderecoDriver() {
		return enderecoDriver;
	}

	public void setEnderecoDriver(String enderecoDriver) {
		this.enderecoDriver = enderecoDriver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}


}
