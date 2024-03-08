package org.example.demo21.service;

import org.example.demo21.model.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IStaffService {
    Page<Staff> findAll(Pageable pageable);
    List<Staff>findByName(String name);
    Optional<Staff> findById(int id);
    void delete(int id);
    void update(Staff student);
    void create(Staff student);
}
