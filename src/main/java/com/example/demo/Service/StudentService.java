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
    public Map<Integer,StudentEntity> getAllStudents(){
        return details;
    }
    public StudentEntity updateStudent(int id,StudentEntity st){
        if(details.containsKey(id)){
            details.put(id,st);
            return st;
        }
        return null;
    }
}