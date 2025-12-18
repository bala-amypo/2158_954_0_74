package com.example.demo.Service;

import java.util.List;
import com.example.demo.Entity.Studententity;

public interface Studentservice {

    Studententity saveData(Studententity student);

    Studententity getStudent(Long id);

    List<Studententity> getAllStudents();

    Studententity updateStudent(Long id, Studententity student);

    void deleteStudent(Long id);
}