package com.xproce.demo.dao.repositories;

import com.xproce.demo.dao.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    public Etudiant findByEmail(String email);
}