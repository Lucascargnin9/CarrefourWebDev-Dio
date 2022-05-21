package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ex3_numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            
            int numero = random.nextInt(100);

            numerosAleatorios[i] = numero;

        }

        System.out.println("Numeros aleatorios: ");
        for (int i : numerosAleatorios) {
            System.out.println(i);
        }
        System.out.println("Sucessores: ");
        for (int i : numerosAleatorios) {
            System.out.println(i+1);
        }

    }
}
