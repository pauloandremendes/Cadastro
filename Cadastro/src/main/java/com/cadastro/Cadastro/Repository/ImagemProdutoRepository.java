package com.cadastro.Cadastro.Repository;

import com.cadastro.Cadastro.Model.Domain.ImagemProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagemProdutoRepository extends JpaRepository<ImagemProduto, String> {

}
