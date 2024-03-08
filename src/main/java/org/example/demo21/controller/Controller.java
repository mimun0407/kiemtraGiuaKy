package org.example.demo21.controller;

import org.example.demo21.model.Staff;
import org.example.demo21.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Staffs")
public class Controller {
    @Autowired
    IStaffService iStudentService;
    @GetMapping
    public ResponseEntity findAllStudent(@PageableDefault(value = 1) Pageable pageable){
        return new ResponseEntity<>(iStudentService.findAll(pageable), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity create(@RequestBody Staff staff){
        iStudentService.create(staff);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity Update(@RequestBody Staff staff,@PathVariable int id){
        staff.setId(id);
        iStudentService.update(staff);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity Delete(@PathVariable int id){
        iStudentService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/findName")
    public ResponseEntity findStudent(@RequestParam String name){
        return new ResponseEntity<>(iStudentService.findByName(name), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable int id){
        return new ResponseEntity<>(iStudentService.findById(id).get(),HttpStatus.OK);
    }
}
