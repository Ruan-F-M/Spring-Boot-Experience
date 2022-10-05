package com.springframework;

public class Moto implements Veiculo{

    @Override //significa um método modificado
    public void acao() {
        System.out.println("É uma moto.");
    }
}
