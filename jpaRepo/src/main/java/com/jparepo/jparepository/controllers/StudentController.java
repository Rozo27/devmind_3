package com.jparepo.jparepository.controllers;

import com.jparepo.jparepository.model.Adresa;
import com.jparepo.jparepository.model.Materie;
import com.jparepo.jparepository.model.Student;
import com.jparepo.jparepository.model.StudentiToMaterie;
import com.jparepo.jparepository.repositories.AdresaRepository;
import com.jparepo.jparepository.repositories.MaterieRepository;
import com.jparepo.jparepository.repositories.StudentRepository;
import com.jparepo.jparepository.repositories.StudentiToMateriiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.Optional;

@RestController
@RequestMapping("/studentController")
public class StudentController {
    private final StudentRepository studentRepository;
    private final MaterieRepository materieRepository;
    private final StudentiToMateriiRepository studentiToMateriiRepository;
    private final AdresaRepository adresaRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository, MaterieRepository materieRepository, StudentiToMateriiRepository studentiToMateriiRepository, AdresaRepository adresaRepository) {
        this.studentRepository = studentRepository;
        this.materieRepository = materieRepository;
        this.studentiToMateriiRepository = studentiToMateriiRepository;
        this.adresaRepository = adresaRepository;
    }

    @PostMapping("/enroll")
    public ResponseEntity<StudentiToMaterie> enrollStudentToCourse(@RequestParam(name = "studentId") Integer studentId, @RequestParam(name = "materieId") Integer materieId) {
        Optional<Student> student = studentRepository.findById(studentId);
        Optional<Materie> materie = materieRepository.findById(materieId);
        if (student.isPresent() && materie.isPresent()) {
            StudentiToMaterie studentiToMaterie = studentiToMateriiRepository.save(
                    new StudentiToMaterie(
                            null,
                            student.get(),
                            materie.get()
                    ));
            return ResponseEntity.status(HttpStatus.OK)
                    .body(studentiToMaterie);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .build();
    }

    @PostMapping()
    public ResponseEntity<Student> createNewStudent(@RequestBody Student student) {
//        student.getAdresa().setStudent(student);
        Student savedStudent = studentRepository.save(student);
        return ResponseEntity.status(HttpStatus.OK)
                .body(savedStudent);
    }

    @PostMapping("/id/{id}/adresa")
    public ResponseEntity<Student> updateStudentAddress(@RequestBody Adresa adresa, @PathVariable Integer id) {
        Student student = studentRepository.findById(id).get();
        if(student == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                            .build();
        student.setAdresa(adresa);
//        adresa.setStudent(student);
        studentRepository.save(student);
        return ResponseEntity.status(HttpStatus.OK)
                .body(student);
    }

    @DeleteMapping("/id")
    public ResponseEntity<Student> deleteStudent(@RequestParam Integer id) {
        Student student = studentRepository.findById(id).get();
        if(student == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .build();
//        Iterator<StudentiToMaterie> it = student.getInscrieri().iterator();
//        while(it.hasNext()) {
//            studentiToMateriiRepository.delete(it.next());
//        }
//        adresaRepository.delete(student.getAdresa());
        studentRepository.delete(student);
        return ResponseEntity.status(HttpStatus.OK)
                .body(student);
    }
}
