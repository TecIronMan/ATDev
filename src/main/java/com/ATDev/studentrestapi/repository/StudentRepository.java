package com.ATDev.studentrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ATDev.studentrestapi.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
