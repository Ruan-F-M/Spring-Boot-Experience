package com.springbeans.ProjetoLivrariaParaImplementacaodeBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Kimetsu no Yaiba");
        livro.setCodigo("F69EY");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome ("Koyoharu Gotouge");
        livro.exibir();

        ((AbstractApplicationContext) factory).close();
    }

}
