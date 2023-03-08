package com.example.presantationdataapi.controller;

import com.example.presantationdataapi.service.CalculationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//vergi hesabıbının ekranda görüntülenmesini sağlayacak olan servis
//http://localhost:8082/300/lux
@RestController
@AllArgsConstructor
public class PresentationController {
//    private RestTemplate restTemplate = new RestTemplate();
//
//    @GetMapping("/{price}/{productType}")
//    public String showTotalPrice(@PathVariable double price, @PathVariable String productType) {
//        String resourceUrl = "http://localhost:8082/" + price + "/" + productType;
//        ResponseEntity<Double> response = restTemplate.getForEntity(resourceUrl, Double.class);
//        return "Product Price: " + price + "   ---   Product Type: " + productType + "   ---   Total Price: " + productType
//                + "   ---   Total Price: " + response.getBody();
//    }

    private CalculationService calculationService;
    @GetMapping("/{price}{productType}")
    public String showTotalPrice(@PathVariable double price ,@PathVariable String productType){
        Double totalPrice= calculationService.showTotalPrice(price, productType);
//        Bu metot Feign Client üzerinden Calculation-Service’e istek gönderir. Dönen değeri totalPrice değişkenine atarız.
        return "Product Price: " + price + "   ---   Product Type: " + productType + "   ---   Total Price: " + productType
                + "   ---   Total Price: " + totalPrice;
    }




}
