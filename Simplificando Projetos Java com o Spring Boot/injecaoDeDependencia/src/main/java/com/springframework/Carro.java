package com.springframework;

public class Carro implements Veiculo {

    @Override //significa um método modificado
    public void acao() {
        System.out.println("É um carro.");
    }
}
