package com.aditya.goodservice.service;

import com.aditya.goodservice.entity.good;
import com.aditya.goodservice.model.goodRequest;
import com.aditya.goodservice.repository.goodRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.springframework.beans.BeanUtils.copyProperties;

@Service
@Log4j2
public class goodserviceImpl implements  goodservice{

    @Autowired
    private goodRepository goodrepository ;

    @Override
    public long addgood(goodRequest goodrequest){
        //log.info("Adding Product..") ;
        good product = good.builder()
                .goodName(goodrequest.getName())
                .quantity(goodrequest.getQuantity())
                .price(goodrequest.getPrice())
                .build() ;

        goodrepository.save(product) ;

        return product.getGoodId();

    }

}
