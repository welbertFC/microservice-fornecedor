package br.com.microservices.fornecedor.controllers;

import br.com.microservices.fornecedor.services.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    public void getInfoPorEstado(String estado){
        infoService.getInfoPorEstado(estado);

    }
}
