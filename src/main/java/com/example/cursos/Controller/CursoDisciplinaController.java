package com.example.cursos.Controller;

import com.example.cursos.Repositories.CursoDisciplinaRepository;
import com.example.cursos.dtos.CursoDisciplinaRecordDto;
import com.example.cursos.models.Curso;
import com.example.cursos.models.CursoDisciplina;
import com.example.cursos.models.Disciplina;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cursoDisciplina")
public class CursoDisciplinaController {
    @Autowired
    CursoDisciplinaRepository cursoDisciplinaRepository;


    @GetMapping("/cursos/{disciplinaId}")
    public List<Curso> getCursosByDisciplinaId(@PathVariable Long disciplinaId) {
        return cursoDisciplinaRepository.findCursosByDisciplinaId(disciplinaId);
    }

    @GetMapping("/disciplina/{cursoId}")
    public List<Disciplina> getDisciplinaByCursoId(@PathVariable Long cursoId) {
        return cursoDisciplinaRepository.findDisciplinaByCursoId(cursoId);
    }

    @GetMapping("/get")
    public ResponseEntity<List<CursoDisciplina>> getAllCursoDisciplinas() {
        return ResponseEntity.status(HttpStatus.OK).body(cursoDisciplinaRepository.findAll());
    }

    @PostMapping("/post")
    public ResponseEntity<CursoDisciplina> novaCursoDisciplina(@RequestBody @Valid CursoDisciplinaRecordDto cursoDisciplinaDTO) {
        var novaCursoDisciplina = new CursoDisciplina();
        BeanUtils.copyProperties(cursoDisciplinaDTO, novaCursoDisciplina);
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoDisciplinaRepository.save(novaCursoDisciplina));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<CursoDisciplina> getCursoDisciplinaById(@PathVariable Long id) {
        Optional<CursoDisciplina> cursoDisciplinaOptional = cursoDisciplinaRepository.findById(id);
        return cursoDisciplinaOptional.map(cursoDisciplina -> ResponseEntity.status(HttpStatus.OK).body(cursoDisciplina))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCursoDisciplina(@PathVariable Long id) {
        if (cursoDisciplinaRepository.existsById(id)) {
            cursoDisciplinaRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @Transactional
    @DeleteMapping("/deleteRelacoesByCursoId/{cursoId}")
    public ResponseEntity<Void> deleteRelacoesByCursoId(@PathVariable Long cursoId) {
        // Primeiro, verifique se o curso com o ID fornecido existe
        Optional<Curso> cursoOptional = cursoDisciplinaRepository.findCursoById(cursoId);

        if (cursoOptional.isPresent()) {
            // Se o curso existe, exclua todas as relações associadas a ele
            cursoDisciplinaRepository.deleteByCursoId(cursoId);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            // Se o curso não existe, retorne 404 (NOT_FOUND)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @Transactional
    @DeleteMapping("/deleteRelacao/{cursoId}/{disciplinaId}")
    public ResponseEntity<Void> deleteRelacao(@PathVariable Long cursoId, @PathVariable Long disciplinaId) {
        cursoDisciplinaRepository.deleteByCursoIdAndDisciplinaId(cursoId, disciplinaId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }



}
