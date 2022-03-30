package com.cadastro.Cadastro.Service;

import com.cadastro.Cadastro.Model.Domain.Produto;
import com.cadastro.Cadastro.Model.Status;
import com.cadastro.Cadastro.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto criar(final Produto produto) {
        return produtoRepository.save(produto);
    }


    public List<Produto> listar() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }

    public Produto atualizar(final Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deletar(final Long id) {
        produtoRepository.deleteById(id);
    }
}
