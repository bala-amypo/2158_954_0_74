package com.example.demo.Service.Impl;

import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Student;

@Service
public class StudentServiceImpl implements StudentService{
    private final Map<Long,Student> store = new HashMap<>();
    private long counter = 1;

    @Override
    public Student insertStudent(Student st){
        st.setId(counter++);
        store.put(st.getId(),st);
        return st;
    }

    @Override
    public Optional<Student> getOneStudent(Long id){
        return Optional.ofNullable(Long id){
            store.remove(id);
        }
    }
}