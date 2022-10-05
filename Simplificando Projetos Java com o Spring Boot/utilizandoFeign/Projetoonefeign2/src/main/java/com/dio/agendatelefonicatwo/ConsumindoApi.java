package com.dio.agendatelefonicatwo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Url da api
@FeignClient(name="agenda", url="http://localhost:8080/contato")
public interface ConsumindoApi {

    @RequestMapping(method = RequestMethod.GET, value="/")
    Contato retornaContato();

}