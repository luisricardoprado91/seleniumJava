import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CadastroAmericanas {

	GeraEmail geraemail = new GeraEmail();
	GeraCpf geracpf = new GeraCpf();

	String nome = "Luis";
	String email = geraemail.geraEmail();
	String cpf = geracpf.geraCpf();
	String senha = "Teste1@12";
	String nascimento = "10/10/1990";
	String telefone = "(11) 98192-3719";
	String sexo;
	WebDriver driver;

	@BeforeMethod
	public void preRequisitos() {

		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.americanas.com.br/");

	}

	@Test(priority = 0, enabled = false)
	public void clicarBotaoCadastro() {

		WebElement abrirpopup = driver.findElement(By.xpath("//div[@class='usr-grt-text']"));
		abrirpopup.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement clicarbotao = driver.findElement(By.xpath("//a[contains(@class,'usr-signup')]"));
		clicarbotao.click();

	}

	@Test(priority = 1, enabled = false)

	public void preencherCadastro() {

		clicarBotaoCadastro();

		WebElement emailcampo = driver.findElement(By.xpath("//input[@id='email-input']"));
		emailcampo.sendKeys(email);

		WebElement senhacampo = driver.findElement(By.xpath("//input[@id='password-input']"));
		senhacampo.sendKeys(senha);

		WebElement cpfcampo = driver.findElement(By.xpath("//input[@id='cpf-input']"));
		cpfcampo.sendKeys(cpf);

		WebElement nomecampo = driver.findElement(By.xpath("//input[@id='name-input']"));
		nomecampo.sendKeys(nome);

		WebElement nascimentocampo = driver.findElement(By.xpath("//input[@id='birthday-input']"));
		nascimentocampo.sendKeys(nascimento);

		WebElement sexocampo = driver.findElement(By.xpath("//label[contains(.,'Masculino')]"));
		sexocampo.click();
		sexo = driver.findElement(By.xpath("//label[contains(.,'Masculino')]")).getText();

		WebElement telefonecampo = driver.findElement(By.xpath("//input[@id='phone-input']"));
		telefonecampo.sendKeys(telefone);
	}

	@Test(priority = 2)
	public void clicarFinalizarCadastro() {

		preencherCadastro();

		WebElement botaofinalizar = driver.findElement(By.xpath("//button[@type='submit']"));
		botaofinalizar.click();

	}

	@AfterMethod
	public void fecharJanela() {
		driver.quit();
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getSexo() {
		return sexo;
	}

}
