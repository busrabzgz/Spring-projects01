package com.example.springbootresttemplate.api;


import com.example.springbootresttemplate.model.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/test")
public class RestClientController {
    private static final  String webUrl="http://localhost:8080/api/users/getAllUsers";


    private  final RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAllUsers(){
        Object result=restTemplate.getForEntity(webUrl,Object.class);
        System.out.println(result);
        return null;


    }

}
