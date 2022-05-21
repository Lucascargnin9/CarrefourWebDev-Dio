
/**
 * carro
 */
class carro {

    String cor,modelo;
    int capacidadeTanque;

    //Construtor aqui
    //lista de parametros vazia
    carro(){

    }

    //sobrecarga do construtor
    //this serve para ilustrar o que pertence ao objeto
    carro(String cor, String modelo, int capacidadeTanque){
       this.cor = cor;
       this.modelo = modelo;
       this.capacidadeTanque = capacidadeTanque; 
    }

    //colocando um valor no atributo cor
    void setCor(String cor){
        this.cor = cor;
    }

    //retornando a cor
    String getCor(){
        return cor;
    }

    //colocando um valor no atributo modelo
    void setModelo(String modelo){
        this.modelo = modelo;
    }

    //retornando modelo
    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque (int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    //Metodo para calcular total para encher o tanque
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque*valorCombustivel;
    }
}