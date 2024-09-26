package br.edu.univille.br.relacionamentos.entity;

import br.edu.univille.br.relacionamentos.entity.Artista;
import br.edu.univille.br.relacionamentos.entity.Musica;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String senha;
    private String nome;

    @ManyToMany
    private List<Playlist> playlists;

    @ManyToMany
    private List<Musica> musicasFavoritas;

    @ManyToMany
    private List<Artista> artistasSeguidos;
}