package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.Studententity;
import com.example.demo.Service.Studentservice;

@RestController
@RequestMapping("/students")
public class Studentcontroller {

    @Autowired
    private Studentservice ser;

    @PostMapping
    public Studententity save(@RequestBody Studententity student) {
        return ser.saveData(student);
    }

    @GetMapping("/{id}")
    public Studententity getById(@PathVariable Long id) {
        return ser.getStudent(id);
    }

    @GetMapping
    public List<Studententity> getAll() {
        return ser.getAllStudents();
    }

    @PutMapping("/{id}")
    public Studententity update(
            @PathVariable Long id,
            @RequestBody Studententity student) {
        return ser.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        ser.deleteStudent(id);
        return "Deleted Successfully";
    }
}