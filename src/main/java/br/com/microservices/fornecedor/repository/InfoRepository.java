package br.com.microservices.fornecedor.repository;

import br.com.microservices.fornecedor.models.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {
}
