package br.com.americanas.commons;

import java.util.Random;

public class GeraEmail {

	public String geraEmail() {

		Random random = new Random();

		String email = "automacao_";
		String dominio = "@email.com";
		int numeroAleratorio = random.nextInt(999999);

		String emailAleatorio = email + numeroAleratorio + dominio;

		// System.out.println("E-mail gerado: " + emailAleatorio);
		System.out.println(emailAleatorio);
		return emailAleatorio;
	}

}
