import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VarrerTabela {
	WebDriver driver;

	public void varrerTabela() {

		List<WebElement> trs = driver.findElements(By.tagName("tr"));
		ArrayList<String> resultado = new ArrayList<String>();
		for (WebElement tr : trs) {

			List<WebElement> tds = tr.findElements(By.tagName("td"));

			for (WebElement td : tds) {

				resultado.add(td.getText());

			}

		}
	}

}
