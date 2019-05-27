package br.com.americanas;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.americanas.commons.CloseBrowser;
import br.com.americanas.commons.OpenBrowser;
import br.com.americanas.commons.Utils;

public class Run {

	Utils utils = new Utils();

	@BeforeMethod
	public void pre() {

		OpenBrowser openBrowser = new OpenBrowser(utils);
		openBrowser.doOpenBrowser();

	}

	@Test
	public void createUserSuccess() {

		
		
	}

	@AfterMethod
	public void closeBrowser() {

		CloseBrowser closeBrowser = new CloseBrowser();
		closeBrowser.doCloseBrowser(utils);
	}
}
