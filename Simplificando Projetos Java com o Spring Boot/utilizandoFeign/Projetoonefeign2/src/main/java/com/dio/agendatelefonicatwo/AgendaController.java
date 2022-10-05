package com.dio.agendatelefonicatwo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agenda")
@Slf4j
public class AgendaController {

    @Autowired
    private ConsumindoApi consumindoApi;

    @GetMapping
    public Contato retornaContato() {
        log.info("Teste ZZZZZZZZ");
        return consumindoApi.retornaContato();
    }
}