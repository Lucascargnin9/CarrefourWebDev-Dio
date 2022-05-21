/**
 * main
 */
public class main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio calculadora");
        calculadora.soma(3, 4);
        calculadora.subtracao(5, 9);
        calculadora.multiplicacao(4.8, 32.2);
        calculadora.divisao(25, 100);

        //Mensagem
        mensagem.obterMensagem(22);
        mensagem.obterMensagem(5);
        mensagem.obterMensagem(13);

        //Emprestimo
        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular(1000, 5);
        
    }
}