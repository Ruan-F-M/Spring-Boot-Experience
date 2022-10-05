package com.springbeans.ProjetoLivrariaParaImplementacaodeBeans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Autor implements AutorLivro {

    private String nome;

    public void exibirAutor() {
        System.out.println(this.nome);
    }

}
