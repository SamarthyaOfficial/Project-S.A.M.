//creating endpoint with SpringBoot
package com.samarthya.demo.student;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

//purpose of this class is to return to the user the students in json format
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("Student")
public class StudentController {

    @GetMapping//tells spring boot that this method will be served as a get request for any client to consume
    public List<Student> getAllStudents() {
        return List.of(
          new Student(UUID.randomUUID(), "James", "Bond","jamesbond45@gmail.com",Student.Gender.MALE),
          new Student(UUID.randomUUID(), "Michael", "Clington","michaelclington@yahoo.com", Student.Gender.MALE)
        );
    }
}
