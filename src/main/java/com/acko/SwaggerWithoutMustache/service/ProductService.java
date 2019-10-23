package com.acko.SwaggerWithoutMustache.service;

import com.acko.SwaggerWithoutMustache.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public ResponseEntity<List<Product>> getAllProducts(){
        Product product = new Product();
        product.setProductId("1");
        product.setProductName("Product A");
        product.setProductPrice(100);
        product.setProductId("2");
        product.setProductName("Product B");
        product.setProductPrice(200);
        product.setProductId("3");
        product.setProductName("Product C");
        product.setProductPrice(300);
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
}
