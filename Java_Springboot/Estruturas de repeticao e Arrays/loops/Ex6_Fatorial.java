package loops;

import javax.swing.JOptionPane;

public class Ex6_Fatorial {
    public static void main(String[] args) {

        int fatorial, multi=1;

        fatorial=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que deseja ver fatorial:"));
        
        System.out.println(fatorial+" != ");
        for (int i = fatorial; i > 0; i--) {
            multi=multi*i;
            
        }

        System.out.println(multi);
    }
}
