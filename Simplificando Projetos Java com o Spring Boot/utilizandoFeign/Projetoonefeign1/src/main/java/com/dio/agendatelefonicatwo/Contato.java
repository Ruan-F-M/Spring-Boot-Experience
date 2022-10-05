package com.dio.agendatelefonicatwo;

import lombok.Builder;
import lombok.Data;

@Data //conjunto de varias outras anotações como o getters and setters
@Builder
public class Contato {

    private Long id;
    private String nome;
    private String telefone;

}
