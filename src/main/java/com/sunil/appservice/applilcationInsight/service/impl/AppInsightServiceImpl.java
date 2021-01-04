package com.sunil.appservice.applilcationInsight.service.impl;

import com.sunil.appservice.applilcationInsight.entity.Product;
import com.sunil.appservice.applilcationInsight.repository.AppInsightRepository;
import com.sunil.appservice.applilcationInsight.service.AppInsightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class AppInsightServiceImpl implements AppInsightService {

    @Autowired
    AppInsightRepository appInsightRepository;

    @Override
    public List<Product> getAllProducts() {
        return appInsightRepository.findAll();
    }

    @Override
    public Product getPorduct(Integer productId) {
        return appInsightRepository.findById(productId).orElse(null);
    }
}
