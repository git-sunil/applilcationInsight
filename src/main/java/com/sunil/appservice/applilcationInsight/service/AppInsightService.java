package com.sunil.appservice.applilcationInsight.service;

import com.sunil.appservice.applilcationInsight.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppInsightService {
    public List<Product> getAllProducts();
    public Product getPorduct(Integer productId);
}
