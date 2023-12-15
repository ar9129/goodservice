package com.aditya.goodservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class goodResponse {
    private String goodName ;
    private long goodId ;
    private long quantity ;
    private long price ;
}




