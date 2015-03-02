package edu.upc.eetac.dsa.rlorenzo.ejercicio4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FicheroBinario {

	private int entero;
    private double decimal;
    private char caracter;

    public FicheroBinario(int integer, double decimal, char character) {
        this.entero = integer;
        this.decimal = decimal;
        this.caracter = character;
    }

    public int getInteger() {
        return entero;
    }

    public void setInteger(int integer) {
        this.entero = integer;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public char getCharacter() {
        return caracter;
    }

    public void setCharacter(char caracter) {
        this.caracter = caracter;
    }

    public void saveToFile(String filename) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
        dos.writeInt(entero);
        dos.writeDouble(decimal);
        dos.writeChar(caracter);
        dos.close();
    }

    public final static FicheroBinario readFromFile(String filename) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(filename));
        int entero = dis.readInt();
        double decimal = dis.readDouble();
        char caracter = dis.readChar();

        return new FicheroBinario(entero, decimal, caracter);
    }

}
