package loops;

import javax.swing.JOptionPane;

public class Ex2_Nota {
    public static void main(String[] args) {
        int nota;
    
        do {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Digite uma nota de 0 a 10: "));
        } while (nota<=10 && nota>=0);
    
    }
}
