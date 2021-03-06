package com.jparepo.jparepository.controllers;

import com.jparepo.jparepository.model.Student;
import com.jparepo.jparepository.repositories.StudentRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/demo")
public class DemoController {
    private final StudentRepository studentRepository;

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    public DemoController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping(path = "/student/all")
    public @ResponseBody Iterable<Student> getStudents() {
        return studentRepository.findAll();
    }

    @GetMapping(path = "/student/nume/prenume")
    public @ResponseBody Optional<Student> getStudentByNumeAndPrenume(@RequestParam String nume, @RequestParam String prenume) {
        if(prenume == null) {
            return studentRepository.findByNume(nume);
        }
        return studentRepository.findByNumeAndPrenume(nume, prenume);
    }

    @GetMapping("/student/localitate")
    public @ResponseBody List<Student> getStudentByNumeAndLocalitate(@RequestParam String nume, @RequestParam String localitate) {
        return studentRepository.findByNumeAndLocalitate(nume, localitate);
    }

    @GetMapping(path = "/student/cnp/{cnp}")
    public @ResponseBody Iterable<Student> getStudent(@PathVariable String cnp) {
        Session session = (Session) entityManager.getDelegate();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("cnp"), cnp));

        Query<Student> query = session.createQuery(criteriaQuery);
        return query.getResultList();
    }

}