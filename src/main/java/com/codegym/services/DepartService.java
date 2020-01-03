package com.codegym.services;

import com.codegym.models.Departs;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartService {
    List<Departs> findAllDepartments();
    Optional<Departs> findById(Long id);
    void saveDepart(Departs departs);
    void removeDepart(Long id);
}
