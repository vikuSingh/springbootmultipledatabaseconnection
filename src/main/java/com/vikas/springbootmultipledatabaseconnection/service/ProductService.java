package com.vikas.springbootmultipledatabaseconnection.service;

import com.vikas.springbootmultipledatabaseconnection.dto.ProductRequestDto;
import com.vikas.springbootmultipledatabaseconnection.model.product.Product;
import com.vikas.springbootmultipledatabaseconnection.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(ProductRequestDto productRequestDto) {
        Product product = new Product();
        product.setPname(productRequestDto.getPname());
        product.setPrize(productRequestDto.getPrize());
        return productRepository.save(product);
    }

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
