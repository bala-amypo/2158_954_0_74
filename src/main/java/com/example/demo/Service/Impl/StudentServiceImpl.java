package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Studententity;
import com.example.demo.Repository.Studentrepository;
import com.example.demo.Service.Studentservice;

@Service
public class StudentserviceImpl implements Studentservice {

    @Autowired
    private Studentrepository repo;

    @Override
    public Studententity saveData(Studententity student) {
        return repo.save(student);
    }

    @Override
    public Studententity getStudent(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Studententity> getAllStudents() {
        return repo.findAll();
    }

    @Override
    public Studententity updateStudent(Long id, Studententity student) {
        Studententity existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(student.getName());
            existing.setAge(student.getAge());
            return repo.save(existing);
        }
        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }
}