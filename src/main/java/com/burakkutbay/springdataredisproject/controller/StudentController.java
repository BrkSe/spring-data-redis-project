package com.burakkutbay.springdataredisproject.controller;

import com.burakkutbay.springdataredisproject.model.Student;
import com.burakkutbay.springdataredisproject.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/student")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @Cacheable(value = "student", key = "#id")
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable("id") Integer id) {
        return studentService.findById(id);
    }


    @CacheEvict(value = "student", key="#id")
    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable("id") Integer id) {
        studentService.deleteStudent(id);
    }

    @PostMapping("/student")
    public void saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @CachePut(value = "student", key = "#student.id")
    @PutMapping("/student/update")
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }
}
