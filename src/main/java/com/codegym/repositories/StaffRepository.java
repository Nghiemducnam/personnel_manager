package com.codegym.repositories;

import com.codegym.models.Departs;
import com.codegym.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
    Iterable<Staff> findAllByDeparts(Departs departs);
}
