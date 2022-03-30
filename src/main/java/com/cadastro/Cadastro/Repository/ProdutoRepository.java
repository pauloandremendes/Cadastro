package com.cadastro.Cadastro.Repository;

import com.cadastro.Cadastro.Model.Domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
