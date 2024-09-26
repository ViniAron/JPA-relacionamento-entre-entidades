package br.edu.univille.br.relacionamentos.entity;

import br.edu.univille.br.relacionamentos.entity.Album;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "artista")
    private List<Album> albuns;
}