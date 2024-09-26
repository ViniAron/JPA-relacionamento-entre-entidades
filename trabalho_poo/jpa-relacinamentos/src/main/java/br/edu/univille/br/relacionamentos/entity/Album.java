package br.edu.univille.br.relacionamentos.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @ManyToOne
    private Artista artista;

    @OneToMany(mappedBy = "album")
    private List<Musica> musicas;
}