package com.example.cursos.Repositories;

import com.example.cursos.models.Curso;
import com.example.cursos.models.CursoDisciplina;
import com.example.cursos.models.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CursoDisciplinaRepository extends JpaRepository<CursoDisciplina, Long> {
    @Query("SELECT cd.curso FROM CursoDisciplina cd WHERE cd.disciplina.id = :disciplinaId")
    List<Curso> findCursosByDisciplinaId(@Param("disciplinaId") Long disciplinaId);

    @Query("SELECT cd.disciplina FROM CursoDisciplina cd WHERE cd.curso.id = :cursoId")
    List<Disciplina> findDisciplinaByCursoId(@Param("cursoId") Long cursoId);

    @Query("SELECT cd.curso FROM CursoDisciplina cd WHERE cd.curso.id = :cursoId")
    Optional<Curso> findCursoById(@Param("cursoId") Long cursoId);

    @Modifying
    @Query("DELETE FROM CursoDisciplina cd WHERE cd.curso.id = :cursoId")
    void deleteByCursoId(@Param("cursoId") Long cursoId);

    @Modifying
    @Query("DELETE FROM CursoDisciplina cd WHERE cd.curso.id = :cursoId AND cd.disciplina.id = :disciplinaId")
    void deleteByCursoIdAndDisciplinaId(@Param("cursoId") Long cursoId, @Param("disciplinaId") Long disciplinaId);



}
