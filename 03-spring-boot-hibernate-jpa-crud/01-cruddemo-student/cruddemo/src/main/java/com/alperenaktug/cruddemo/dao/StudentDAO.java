package com.alperenaktug.cruddemo.dao;

import com.alperenaktug.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastname(String theLastname);

    void update (Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
