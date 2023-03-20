package com.burakkutbay.springdataredisproject.service;

import com.burakkutbay.springdataredisproject.model.Student;
import com.burakkutbay.springdataredisproject.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentRepository studentRepository;

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    public Student findById(Integer id) {
        return studentRepository.findById(id).get();
    }


    public List<Student> getAllStudent() {
        List<Student> books = new ArrayList<Student>();
        studentRepository.findAll().forEach(student -> books.add(student));
        return books;
    }
}
