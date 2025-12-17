package com.example.demo.Controller

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController{
    @Autowired
    StudentService ser;
    @PostMapping("/Postadd")
    public StudentEntity post(@RequestBody StudentEntity st){
        return ser.saveData(st);
    }
    @GetMapping("/getAll")
    public Map<Integer,StudentEntity> getAllStudents(){
        return ser.getAllStudents();
    }
    @GetMapping("/Getadd/{id}")
    public StudentEntity get(@PathVariable int id){
        return ser.getStudent(id);
    }
    @PutMapping("/update/{id}")
    public StudentEntity update(@PathVariable int id,@RequestBody StudentEntity st){
        return ser.updateStudent(id,st);
    }
}