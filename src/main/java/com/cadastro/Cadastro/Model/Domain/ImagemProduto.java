package com.cadastro.Cadastro.Model.Domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@lombok.Setter
@lombok.Getter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@Entity
@Table(name = "ImagemProduto")
public class ImagemProduto {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String name;

    private String type;

    @Lob
    private byte[] data;
}
