package com.example.demo.Repository;

import org.springframework.data.jpa.Repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}