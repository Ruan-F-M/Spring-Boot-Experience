package com.dio.springboottest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@WebMvcTest //utilizado pra fazer testes de requisições
@ExtendWith(SpringExtension.class) //pra poder usar recurso do junit e jupiter
public class TestIntController {

    @Autowired //dizer que estamos injetando
    private MockMvc mvc;

    @Test
    public void testInt() throws Exception {
        RequestBuilder requisicao = get("/test");
        MvcResult resultado = mvc.perform(requisicao).andReturn();
        assertEquals("Bem-vindo, DIO", resultado.getResponse().getContentAsString());
    }

    @Test
    public void testIntComArgumento() throws Exception {
        mvc.perform(get("/test?nome=Ruan"))
                .andExpect(content().string("Bem-vindo, Ruan"));
    }

}
