package org.example.demo21.service;

import org.example.demo21.model.Staff;
import org.example.demo21.repository.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StaffService implements IStaffService{
    @Autowired
    StaffRepo staffRepo;
    @Override
    public List<Staff> findAll() {
        return staffRepo.findAll();
    }

    @Override
    public List<Staff> findByName(String name) {
        return staffRepo.findByFullNameContaining(name);
    }

    @Override
    public Optional<Staff> findById(int id) {
        return staffRepo.findById(id);
    }

    @Override
    public void delete(int id) {
            staffRepo.deleteById(id);
    }

    @Override
    public void update(Staff staff) {
            staffRepo.save(staff);
    }

    @Override
    public void create(Staff staff) {
            staffRepo.save(staff);
    }
}
