package br.edu.univille.br.relacionamentos.entity;

import br.edu.univille.br.relacionamentos.entity.Musica;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToMany
    private List<Musica> musica;

    @ManyToMany(mappedBy = "playlist")
    private List<Usuario> usuario;
}