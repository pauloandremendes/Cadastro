package com.cadastro.Cadastro.Controller;

import com.cadastro.Cadastro.Model.DTO.ImagemProdutoDTO;
import com.cadastro.Cadastro.Model.DTO.ProdutoDTO;
import com.cadastro.Cadastro.Model.Domain.ImagemProduto;
import com.cadastro.Cadastro.Model.Domain.Produto;
import com.cadastro.Cadastro.Service.ImagemProdutoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.modelmapper.ModelMapper;

import java.io.IOException;

@RestController
@RequestMapping(value = "/imagemProduto")
@Api(value = "Upload de imagens.")
public class ImagemProdutoController {

    private final ImagemProdutoService imagemProdutoService;

    public ImagemProdutoController(ImagemProdutoService imagemProdutoService) {
        this.imagemProdutoService = imagemProdutoService;
    }

    @PostMapping
    @ApiOperation(value = "Realiza a importação de imagens")
    public void upload(@RequestBody final MultipartFile arquivo) throws IOException {
        imagemProdutoService.upload(arquivo);
    }

}
