package com.example.demo.controllers;

import com.example.demo.dtos.ProductRecordDto;
import com.example.demo.models.ProductModel;
import com.example.demo.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/products")
    public ResponseEntity<ProductModel> saveProduct(@RequestBody @Valid ProductRecordDto productDto){
        var productModel = new ProductModel();
        productModel.setName(productDto.name());
        productModel.setValue(productDto.value());
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel));
    }

}
