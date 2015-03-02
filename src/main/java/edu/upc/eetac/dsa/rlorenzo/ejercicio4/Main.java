package edu.upc.eetac.dsa.rlorenzo.ejercicio4;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		FicheroBinario testWrite = new FicheroBinario(3, 7.5, 'a');
		testWrite.saveToFile("Lectura-Escritura-FicheroBinario");

		FicheroBinario Leer = FicheroBinario.readFromFile("Lectura-Escritura-FicheroBinario");
		System.out.println("entero = " + Leer.getInteger());
		System.out.println("decimal = " + Leer.getDecimal());
		System.out.println("caracter = " + Leer.getCharacter());

		File file = new File("Lectura-Escritura-FicheroBinario");
		file.delete();
	}
		
}
