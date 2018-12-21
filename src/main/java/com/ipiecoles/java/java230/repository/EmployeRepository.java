package com.ipiecoles.java.java230.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.ipiecoles.java.java230.model.Employe;

import java.util.List;

public interface EmployeRepository extends PagingAndSortingRepository <Employe, Long>{
    Employe findByMatricule(String matricule);
    List<Employe> findByNomAndPrenom(String nom, String prenom);
}