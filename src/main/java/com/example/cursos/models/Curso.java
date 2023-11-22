package com.example.cursos.models;


import jakarta.persistence.*;

@Entity
@Table(name = "Curso", schema = "universidade")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column
    private String descricao;

    @Column
    private String coordenador;

    @Column(name = "mensalidade_curso")
    private Double mensalidadeCurso;

    @Column
    private Integer duracao;

    @Column
    private Integer vagas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public Double getMensalidadeCurso() {
        return mensalidadeCurso;
    }

    public void setMensalidadeCurso(Double mensalidadeCurso) {
        this.mensalidadeCurso = mensalidadeCurso;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

}
