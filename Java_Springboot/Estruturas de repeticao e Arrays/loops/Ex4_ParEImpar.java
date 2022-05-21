package loops;

import javax.swing.JOptionPane;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        int numero,count=0,par=0,impar=0,qtdNumeros;
        
        qtdNumeros = Integer.parseInt(JOptionPane.showInputDialog("Digite qtd de numero: "));

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
            
            if (numero%2 == 0) {
                par++;
            } else impar++;
           
            count++;
        } while (count<qtdNumeros);
        
        System.out.println("Par: "+par);
        System.out.println("Impar: "+impar);

    }
}
