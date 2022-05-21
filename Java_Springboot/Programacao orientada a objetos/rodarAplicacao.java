
public class rodarAplicacao {
    public static void main(String[] args) {

        //construtor sem parametros
        carro carro1 = new carro();

        //passando os parametros
        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);
        
        
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        //utilizando a sobrecarga do construtor ja passando os parametros
        carro carro2 = new carro("Cinza","Mercedez Benz AMG",66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}
