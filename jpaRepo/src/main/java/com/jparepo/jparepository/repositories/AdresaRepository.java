package com.jparepo.jparepository.repositories;

import com.jparepo.jparepository.model.Adresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresaRepository extends JpaRepository<Adresa, Integer> {
}
