package com.codegym.services;

import com.codegym.models.Departs;
import com.codegym.models.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface StaffService {
    List<Staff> findAllStaff();
    Optional<Staff> findByStaffId(Long id);
    void saveStaff(Staff staff);
    void removeStaff(Long id);
    Iterable<Staff> getStaffByDepart(Departs departs);
}
