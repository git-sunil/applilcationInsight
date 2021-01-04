package com.sunil.appservice.applilcationInsight.rest;

import com.sunil.appservice.applilcationInsight.entity.Product;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController("/")
public interface AppInsightApi {
    @GetMapping(value = "/products",produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> getAllProducts();

    @GetMapping(value = "/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer id);
}
