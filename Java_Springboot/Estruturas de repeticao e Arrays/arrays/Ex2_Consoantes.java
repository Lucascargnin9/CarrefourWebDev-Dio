package arrays;

import javax.swing.JOptionPane;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        String [] vetor = new String[6];
        int qtdConsoantes =0, count=0;
        String letra;

        do {

            letra =JOptionPane.showInputDialog("Digite um valor");
            
            if (!(letra.equalsIgnoreCase("a") || 
                  letra.equalsIgnoreCase("e") || 
                  letra.equalsIgnoreCase("i") ||
                  letra.equalsIgnoreCase("o") ||
                  letra.equalsIgnoreCase("u"))) {

                vetor [count] = letra;
                qtdConsoantes++;
            }

        count++;
        } while (count<vetor.length);
        
    for (String consoante : vetor) {

        if (consoante != null) {
            System.out.println(vetor);
        }
        
    }

    System.out.println(qtdConsoantes);

    }
}
