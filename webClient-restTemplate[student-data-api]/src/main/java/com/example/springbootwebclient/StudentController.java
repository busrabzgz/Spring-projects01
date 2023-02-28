package com.example.springbootwebclient;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentData(@PathVariable("studentId") Long studentId){
        Student student1=new Student();
        student1.setId(2L);
        student1.setAddress("aksaray");
        student1.setStudentName("furkan");
        student1.setCollegeId(1L);
        //have to call rest template or web client


        Long collegeId= student1.getCollegeId();
        RestTemplate restTemplate=new RestTemplate();
        String endpoint="http://localhost:8090/college/1";
        ResponseEntity<College> data=restTemplate.getForEntity(endpoint, College.class,collegeId);
        if (data.getStatusCodeValue())
        return new ResponseEntity<Student>(student1, HttpStatus.OK);

    }


}
