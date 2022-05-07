package com.jparepo.jparepository.repositories;

import com.jparepo.jparepository.model.Materie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MaterieRepository extends JpaRepository<Materie, Integer> {
    @Query(value = "SELECT * FROM materii m " +
            "JOIN profesori ON m.id = profesori.id " +
            "WHERE " +
            "profesori.id = ?1 ",
            nativeQuery = true
    )
    List<Materie> findMateriiById(Integer id);
}
