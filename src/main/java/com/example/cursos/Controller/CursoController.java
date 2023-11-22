package com.example.cursos.Controller;

import com.example.cursos.Repositories.CursoRepository;
import com.example.cursos.dtos.CursoRecordDto;
import com.example.cursos.models.Curso;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    CursoRepository cursoRepository;

    @GetMapping("/get")
    public ResponseEntity<List<Curso>> getAllCurso(){
        return ResponseEntity.status(HttpStatus.OK).body(cursoRepository.findAll());
    }


    @PostMapping("/post")
    public ResponseEntity<Curso> novoCurso(@RequestBody @Valid CursoRecordDto curso){
        var novoCurso = new Curso();
        BeanUtils.copyProperties(curso, novoCurso);
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoRepository.save(novoCurso));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Curso> getCursoById(@PathVariable Long id) {
        Optional<Curso> cursoOptional = cursoRepository.findById(id);
        return cursoOptional.map(curso -> ResponseEntity.status(HttpStatus.OK).body(curso))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurso(@PathVariable Long id) {
        if (cursoRepository.existsById(id)) {
            cursoRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> atualizarCurso(@PathVariable Long id, @RequestBody @Valid CursoRecordDto cursoAtualizado) {
        Optional<Curso> cursoOptional = cursoRepository.findById(id);
        if (cursoOptional.isPresent()) {
            Curso curso = cursoOptional.get();
            BeanUtils.copyProperties(cursoAtualizado, curso, "id"); // Copia as propriedades do DTO para o objeto persistido, ignorando o id
            return ResponseEntity.status(HttpStatus.OK).body(cursoRepository.save(curso));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
