package com.example.springbootwebclient;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/college")
public class CollegeController {

    @GetMapping("/{collegeId}")
    public ResponseEntity<College> getCollegeDetails(@PathVariable("collegeId") Long collegeId){
        College college1=new College();
        college1.setCollegeId(1L);
        college1.setAddress("istanbul");
        college1.setCollageName("büşra");

        return new ResponseEntity<College>(college1,HttpStatus.OK);

    }
}
