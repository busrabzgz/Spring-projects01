package com.example.springbootwebclient;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
@AllArgsConstructor
public class StudentController {

    private WebClient.Builder webClient;



    @GetMapping("/{studentId}")
    public ResponseEntity<ResponseData> getStudentData(@PathVariable("studentId") Long studentId){
        Student student1=new Student();
        ResponseData responseData=new ResponseData();
        student1.setId(2L);
        student1.setAddress("aksaray");
        student1.setStudentName("furkan");
        student1.setCollegeId(1L);
        //have to call rest template or web client
        responseData.setStudent(student1);

        Long collegeId= student1.getCollegeId();
        // rest template

//        RestTemplate restTemplate=new RestTemplate();
//        String endpoint="http://localhost:8090/college/1";
//        ResponseEntity<College> data=restTemplate.getForEntity(endpoint, College.class,collegeId);
//        if (data.getStatusCodeValue()==200){
//            College college1 =data.getBody();
//            responseData.setCollege(college1);
//
//        }

       // web client

        College college1= webClient.build()
                .get()
                .uri("http://localhost:8090/college"+collegeId)
                .retrieve()
                .bodyToMono(College.class)
                .block();
        responseData.setCollege(college1);
        return new ResponseEntity<ResponseData>(responseData, HttpStatus.OK);

    }


}
