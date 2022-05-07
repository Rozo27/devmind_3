package com.jparepo.jparepository.controllers;

import com.jparepo.jparepository.model.Materie;
import com.jparepo.jparepository.model.Profesor;
import com.jparepo.jparepository.repositories.MaterieRepository;
import com.jparepo.jparepository.repositories.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/profesor")
public class ProfesorController {
    private final ProfesorRepository profesorRepository;

    private final MaterieRepository materieRepository;

    @Autowired
    public ProfesorController(ProfesorRepository profesorRepository, MaterieRepository materieRepository) {
        this.profesorRepository = profesorRepository;
        this.materieRepository = materieRepository;
    }

    @GetMapping("/{id}")
    public @ResponseBody Optional<Profesor> findProfessor(@PathVariable Integer id) {
        return profesorRepository.findById(id);
    }

    @GetMapping("/id/{id}/courses")
    public @ResponseBody List<Materie> findCoursesForProfessor(@PathVariable Integer id) {
        return materieRepository.findMateriiById(id);
    }

}
