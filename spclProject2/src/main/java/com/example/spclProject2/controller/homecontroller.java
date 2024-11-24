package com.example.spclProject2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import com.example.spclProject2.entity.employee;
import com.example.spclProject2.repository.dbrepo;

@RestController
public class homecontroller {

    @Autowired
    private dbrepo db;

    @GetMapping("/all")
    public ResponseEntity<List<employee>> getAll() {
        List<employee> employees = db.findAll();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping("/addone")
    public ResponseEntity<employee> addOne(@Validated @RequestBody employee employee) {
        employee savedEmployee = db.save(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<employee> updateEmployee(@PathVariable int id,@Validated @RequestBody employee employee) {
        return (ResponseEntity<employee>) db.findById(id)
                .map(existingEmployee -> {
                    existingEmployee.setName(employee.getName());
                    existingEmployee.setPosition(employee.getPosition());
                    existingEmployee.setSalary(employee.getSalary());
                    employee updatedEmployee = db.save(existingEmployee);
                    return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id) {
        if (db.existsById(id)) {
            db.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
    }
}
