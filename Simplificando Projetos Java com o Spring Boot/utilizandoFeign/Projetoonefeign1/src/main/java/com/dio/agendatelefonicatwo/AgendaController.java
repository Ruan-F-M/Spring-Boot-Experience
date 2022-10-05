package com.dio.agendatelefonicatwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class AgendaController {

    @GetMapping
    public Contato retornaContato() {
        return Contato.builder()
                .id(1L)
                .nome("Ruan")
                .telefone("(99) 9999-9999")
                .build();

    }
}
