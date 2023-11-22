package com.example.cursos.dtos;

import com.example.cursos.models.Curso;
import com.example.cursos.models.Disciplina;

public record CursoDisciplinaRecordDto(
                                       Curso curso,
                                       Disciplina disciplina) {
}
