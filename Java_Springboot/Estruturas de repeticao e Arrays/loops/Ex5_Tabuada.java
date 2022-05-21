package loops;

import javax.swing.JOptionPane;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        int tabuada;

        tabuada=Integer.parseInt(JOptionPane.showInputDialog("Tabuada de qual numero?"));

        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" x "+tabuada+" = "+i*tabuada);
        }

    }
}
