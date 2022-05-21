public class mensagem {

    public static void obterMensagem(int hora) {
        if (hora>=5 && hora<13) {
            mensagemBomDia();
        } if (hora>=13 && hora<19) {
            mensagemBoaTarde();
        } if (hora>=19 && hora<5) {
            mensagemBoaNoite();
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Boa Tarde!");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Boa Noite!");
    }
    
}
