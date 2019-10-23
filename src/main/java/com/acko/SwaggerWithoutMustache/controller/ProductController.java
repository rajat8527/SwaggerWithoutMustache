package com.acko.SwaggerWithoutMustache.controller;

import com.acko.SwaggerWithoutMustache.api.ProductApi;
import com.acko.SwaggerWithoutMustache.model.Product;
import com.acko.SwaggerWithoutMustache.service.ProductService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
public class ProductController implements ProductApi {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/getAllProducts")
    public CompletableFuture<ResponseEntity<List<Product>>> getAllProducts(){
        return new CompletableFuture<ResponseEntity<List<Product>>>();
    }

}
