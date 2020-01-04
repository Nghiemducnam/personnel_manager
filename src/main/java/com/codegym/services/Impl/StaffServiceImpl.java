package com.codegym.services.Impl;

import com.codegym.models.Departs;
import com.codegym.models.Staff;
import com.codegym.repositories.StaffRepository;
import com.codegym.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffRepository staffRepository;
    @Override
    public List<Staff> findAllStaff() {
        return staffRepository.findAll();
    }

    @Override
    public Optional<Staff> findByStaffId(Long id) {
        return staffRepository.findById(id);
    }

    @Override
    public void saveStaff(Staff staff) {
        staffRepository.save(staff);
    }

    @Override
    public void removeStaff(Long id) {
        staffRepository.deleteById(id);
    }

    @Override
    public Iterable<Staff> getStaffByDepart(Departs departs) {
        return staffRepository.findAllByDeparts(departs);
    }
}