package com.vikas.springbootmultipledatabaseconnection.dto;

import lombok.Data;

@Data
public class ProductRequestDto {
    private Long pid;
    private String pname;
    private double prize;
}
