package com.aditya.goodservice.controller;

import com.aditya.goodservice.model.goodRequest;
import com.aditya.goodservice.model.goodResponse;
import com.aditya.goodservice.service.goodservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/good")
public class goodcontroller {

    @Autowired
    private  goodservice goodService;

    @PostMapping("/add")
    public ResponseEntity<Long> addProduct(@RequestBody goodRequest goodrequest){
        long goodId = goodService.addgood(goodrequest) ;
        return  new ResponseEntity<>(goodId, HttpStatus.CREATED) ;
    }
}
