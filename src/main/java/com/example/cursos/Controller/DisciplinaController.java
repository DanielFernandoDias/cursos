package com.example.cursos.Controller;

import com.example.cursos.Repositories.DisciplinaRepository;
import com.example.cursos.dtos.DisciplinaRecordDto;
import com.example.cursos.models.Disciplina;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {
    @Autowired
    DisciplinaRepository disciplinaRepository;

    @GetMapping("/get")
    public ResponseEntity<List<Disciplina>> getAllDisciplinas() {
        return ResponseEntity.status(HttpStatus.OK).body(disciplinaRepository.findAll());
    }

    @PostMapping("/post")
    public ResponseEntity<Disciplina> novaDisciplina(@RequestBody @Valid DisciplinaRecordDto disciplinaDTO) {
        var novaDisciplina = new Disciplina();
        BeanUtils.copyProperties(disciplinaDTO, novaDisciplina);
        return ResponseEntity.status(HttpStatus.CREATED).body(disciplinaRepository.save(novaDisciplina));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Disciplina> getDisciplinaById(@PathVariable Long id) {
        Optional<Disciplina> disciplinaOptional = disciplinaRepository.findById(id);
        return disciplinaOptional.map(disciplina -> ResponseEntity.status(HttpStatus.OK).body(disciplina))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDisciplina(@PathVariable Long id) {
        if (disciplinaRepository.existsById(id)) {
            disciplinaRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
