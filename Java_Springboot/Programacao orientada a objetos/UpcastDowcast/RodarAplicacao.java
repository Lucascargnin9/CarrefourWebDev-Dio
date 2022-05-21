package UpcastDowcast;

public class RodarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        //Upcast- funcionario e a classe mae, gerente vendedor e faxineiro sao funcionarios
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast
        //Vendedor vendedor = (Vendedor) new Funcionario();
    }
}
