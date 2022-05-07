package com.jparepo.jparepository.repositories;

import com.jparepo.jparepository.model.StudentiToMaterie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentiToMateriiRepository extends JpaRepository<StudentiToMaterie, Long> {

}
