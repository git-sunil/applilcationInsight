package com.sunil.appservice.applilcationInsight.rest.impl;

import com.sunil.appservice.applilcationInsight.entity.Product;
import com.sunil.appservice.applilcationInsight.rest.AppInsightApi;
import com.sunil.appservice.applilcationInsight.service.AppInsightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class AppInsightApiImpl implements AppInsightApi {

    @Autowired
    AppInsightService appInsightService;

    @Override
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(appInsightService.getAllProducts(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Product> getProduct(Integer id) {
        return new ResponseEntity<>(appInsightService.getPorduct(id),HttpStatus.OK);
    }
}
