package com.vikas.springbootmultipledatabaseconnection.model.product;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.*;

@Data
@Entity
@Table(schema = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;
    private String pname;
    private double prize;

}
