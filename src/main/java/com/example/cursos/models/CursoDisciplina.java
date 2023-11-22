package com.example.cursos.models;

import jakarta.persistence.*;

@Entity
@Table(name = "CursoDisciplina", schema = "universidade")
public class CursoDisciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCursoDisciplina")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idCurso", referencedColumnName = "id")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "idDisciplina", referencedColumnName = "id")
    private Disciplina disciplina;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
