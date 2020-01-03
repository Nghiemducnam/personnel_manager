package com.codegym.services.Impl;

import com.codegym.models.Departs;
import com.codegym.repositories.DepartRepository;
import com.codegym.services.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartServiceImpl implements DepartService {
    @Autowired
    private DepartRepository departRepository;

    public List<Departs> findAllDepartments() {
        return departRepository.findAll();
    }

    @Override
    public Optional<Departs> findById(Long id) {
        return departRepository.findById(id);
    }

    @Override
    public void saveDepart(Departs departs) {
        departRepository.save(departs);

    }

    @Override
    public void removeDepart(Long id) {
        departRepository.deleteById(id);
    }

}