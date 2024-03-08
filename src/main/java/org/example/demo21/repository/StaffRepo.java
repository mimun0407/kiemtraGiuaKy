package org.example.demo21.repository;

import org.example.demo21.model.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface StaffRepo extends JpaRepository<Staff,Integer> {
        List<Staff>findByFullNameContaining(String name);
}
