package com.digitalinnovatione.personapi.controller;

import com.digitalinnovatione.personapi.config.SwaggerConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
@Slf4j
public class PersonController {

    private SwaggerConfig swaggerConfig;

    @GetMapping
    public String message() {
        log.info("Test funcional");
        return "Teste de ínicio Swagger";
    }

}

