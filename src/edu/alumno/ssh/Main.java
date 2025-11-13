package edu.alumno.ssh;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();

		System.out.println("Números de la Lotería Primitiva:");

		// Genera 5 números principales
		for (int i = 0; i < 5; i++) {
			int numero = random.nextInt(49) + 1;
			System.out.print(numero + " ");
		}

		System.out.println();
		// Número complementario
		int complementario = random.nextInt(49) + 1;
		System.out.println("Complementario: " + complementario);

		System.out.println("¡Buena suerte en el sorteo!");

		System.out.println("Cambio realizado desde GitHub.");
	}
}
