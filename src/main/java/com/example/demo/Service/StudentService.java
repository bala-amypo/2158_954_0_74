package com.example.demo.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.example.demo.Entity.StudentEntity;

@Service
public class StudentService{
    Map<Integer,StudentEntity> details = new HashMap<>();

    public StudentEntity saveData(StudentEntity st){
        details.put(st.getId(),st);
        return st;
    }
    public StudentEntity getStudent(int id){
        return details.get(id);
    }
}