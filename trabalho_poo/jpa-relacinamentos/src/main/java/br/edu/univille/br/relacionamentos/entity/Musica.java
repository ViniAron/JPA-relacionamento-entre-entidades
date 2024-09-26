package br.edu.univille.br.relacionamentos.entity;

import br.edu.univille.br.relacionamentos.entity.Album;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer duracao; // em segundos

    @ManyToOne
    private Album album;

    @ManyToMany(mappedBy = "musicas")
    private List<Playlist> playlists;

    @ManyToMany(mappedBy = "musicasFavoritas")
    private List<Usuario> usuario;
}