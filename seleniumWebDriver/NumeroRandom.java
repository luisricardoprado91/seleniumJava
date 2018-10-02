public class NumeroRandom{
	
	private Utils utils;

	public NumeroRandom(Utils utils) {

		this.utils = utils;
	}

	public Actions act() {
		Actions act = new Actions(driver);
		return act;
	}

	Random gerador = new Random();
	int minimo = 000000000;
	int maximo = 999999999;
	int deAte = gerador.nextInt(999999999 - 000000000);
	
	public String contadorDeAte = Integer.toString(deAte);
	

	public Utils getUtils() {
		return utils;
	}

	public void setUtils(Utils utils) {
		this.utils = utils;
	}
}