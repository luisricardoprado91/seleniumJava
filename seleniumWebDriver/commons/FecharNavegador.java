package commons;

public class FecharNavegador {
	private Utils utils;

	public FecharNavegador(Utils utils) {

		this.utils = utils;
	}

	public void fecharNavegador() {
		utils.getDriver().quit();
	}

	public Utils getUtils() {
		return utils;
	}

	public void setUtils(Utils utils) {
		this.utils = utils;
	}
}
