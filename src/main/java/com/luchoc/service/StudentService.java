package com.luchoc.service;

import com.luchoc.domain.Student;
import com.luchoc.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public Collection<Student> getAllStudents() {
        return repo.getAllStudents();
    }

    public Student getStudentById(int id) {
        return repo.getStudentById(id);
    }

    public void insertStudent(Student student) {
        repo.insertStudent(student);
    }

    public void updateStudent(Student student) {
        repo.updateStudent(student);
    }

    public void deleteStudent(int id) {
        repo.deleteStudent(id);
    }
}
