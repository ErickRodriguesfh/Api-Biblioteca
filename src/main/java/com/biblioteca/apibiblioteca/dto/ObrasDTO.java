package com.biblioteca.apibiblioteca.dto;

import com.biblioteca.apibiblioteca.entities.Obras;

public class ObrasDTO {

    private String titulo;
    private String editora;
    private String foto;
    private String autores;

    public ObrasDTO(){}

    public ObrasDTO(String titulo, String editora, String foto, String autores) {
        this.titulo = titulo;
        this.editora = editora;
        this.foto = foto;
        this.autores = autores;
    }

    public ObrasDTO(Obras entity){
        super();
        this.autores = entity.getAutores();
        this.editora = entity.getEditora();
        this.foto = entity.getFoto();
        this.titulo = entity.getTitulo();

    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }
}
