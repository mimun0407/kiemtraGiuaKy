package org.example.demo21.service;

import org.example.demo21.model.Staff;

import java.util.List;
import java.util.Optional;

public interface IStaffService {
    List<Staff> findAll();
    List<Staff>findByName(String name);
    Optional<Staff> findById(int id);
    void delete(int id);
    void update(Staff student);
    void create(Staff student);
}
