package com.cadastro.Cadastro.Controller;

import com.cadastro.Cadastro.Model.DTO.ProdutoDTO;
import com.cadastro.Cadastro.Model.Domain.Produto;
import com.cadastro.Cadastro.Service.ProdutoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/produtos")
@Api(value = "CRUD do cadastro de produtos.")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ApiOperation(value = "Realiza a criação do produto.")
    public ProdutoDTO criar(@RequestBody final ProdutoDTO dto) {
        final Produto produto = modelMapper.map(dto, Produto.class);
        final Produto produtoSalvo = produtoService.criar(produto);
        return modelMapper.map(produtoSalvo, ProdutoDTO.class);
    }

    @GetMapping
    @ApiOperation(value = "Realiza a listagem geral do produto.")
    public List<ProdutoDTO> listar() {
        final List<Produto> produtos = produtoService.listar();
        return produtos.stream().map(produto -> modelMapper.map(produto, ProdutoDTO.class))
                .collect(Collectors.toList());
    }

    @PutMapping
    @ApiOperation(value = "Realiza a atualização(edição) do produto.")
    public ProdutoDTO atualizar(@RequestBody final ProdutoDTO dto) {
        final Produto produto = modelMapper.map(dto, Produto.class);
        final Produto produtoAtualizado = produtoService.atualizar(produto);
        return modelMapper.map(produtoAtualizado, ProdutoDTO.class);
    }

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Deleta o produto.")
    public void deletar(@PathVariable final Long id) {
        produtoService.deletar(id);
    }

}
