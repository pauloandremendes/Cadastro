package com.cadastro.Cadastro.Service;

import com.cadastro.Cadastro.Model.DTO.ImagemProdutoDTO;
import com.cadastro.Cadastro.Model.Domain.ImagemProduto;
import com.cadastro.Cadastro.Repository.ImagemProdutoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.EntityNotFoundException;
import java.io.IOException;

@Service
public class ImagemProdutoService {

    private final ImagemProdutoRepository imagemProdutoRepository;

    public ImagemProdutoService(ImagemProdutoRepository imagemProdutoRepository) {
        this.imagemProdutoRepository = imagemProdutoRepository;
    }

    public ImagemProduto upload(final MultipartFile arquivo) throws IOException {
        final ImagemProduto imagemProduto = new ImagemProduto(null, arquivo.getOriginalFilename(), arquivo.getContentType(), arquivo.getBytes());
        return imagemProdutoRepository.save(imagemProduto);
    }
}
