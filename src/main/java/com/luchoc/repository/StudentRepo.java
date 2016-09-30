package com.luchoc.repository;

import com.luchoc.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepo {
    private static Map<Integer, Student> students;

    // for now and just for testing
    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Luis", "Math"));
                put(2, new Student(2, "Sam", "tv"));
                put(3, new Student(3, "Sebastian", "sports"));
            }
        };
    }

    public Collection<Student> getAllStudents() {
        return students.values();
    }

    public Student getStudentById(int id) {
        return students.get(id);
    }

    public void insertStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void updateStudent(Student student) {
        Student toUpdate = students.get(student.getId());
        toUpdate.setName(student.getName());
        toUpdate.setCourse(student.getCourse());
    }

    public void deleteStudent(int id) {
        students.remove(id);
    }
}
