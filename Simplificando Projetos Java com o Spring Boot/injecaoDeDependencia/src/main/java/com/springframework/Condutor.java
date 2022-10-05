package com.springframework;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {
    public static void main(String[] args) {
        Condutor condutor = new Condutor(new Moto());
        condutor.automovel();
    }

    @Autowired // diz pro spring q é uma injeção de dependência
    private Veiculo veiculo;

    public Condutor(Veiculo obj) { //vai ser instanciado o veiculo com referencia ao obj
        this.veiculo = obj;
    }

    public void automovel(){
        veiculo.acao();
    }
}
