package br.com.microservices.fornecedor.services;

import br.com.microservices.fornecedor.models.InfoFornecedor;
import br.com.microservices.fornecedor.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;

    public InfoFornecedor getInfoPorEstado(String estado) {
        return infoRepository.findByEstado(estado);

    }
}
