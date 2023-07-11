package com.vikas.springbootmultipledatabaseconnection.controller;

import com.vikas.springbootmultipledatabaseconnection.dto.ProductRequestDto;
import com.vikas.springbootmultipledatabaseconnection.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAllProduct")
    public ResponseEntity<?> getAllProduct(){
        return ResponseEntity.ok(productService.getAllProduct());
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveProduct(@RequestBody ProductRequestDto productRequestDto) {
        return ResponseEntity.ok(productService.saveProduct(productRequestDto));
    }
}
