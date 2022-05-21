package loops;

import javax.swing.JOptionPane;

public class Ex3_MaioreMedia {
    public static void main(String[] args) {

        double numero, maior=0,soma=0;
        int count =0;
        do {
            numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
            soma=numero+soma;
            if (numero>maior) maior=numero;
            count++;
        } while (count<5);
            System.out.println("Maior: "+maior);
            System.out.println("Media: "+(soma/count));
    }
}
