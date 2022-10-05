package com.digitalinnovationone.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}") // anotação que indica que vamos injetar todos os valores, cujo o inicio seja app.message
    private String appMessage;

    @Value("${ENV_DB_URL:NENHUMA}") // mapear valor como default "nenhuma"
    private String dbEnvironmentVariable;

    @GetMapping("/") // vai exibir no localhost 8080
    public String getAppMessage() {
        return appMessage;
    }

    @GetMapping("/envVariable") //fazer exibição das variaveis de ambiente
    public String getEnvironmentVariable() {
        return "A seguinte variável de ambiente foi passada: " + dbEnvironmentVariable;
    }
}
