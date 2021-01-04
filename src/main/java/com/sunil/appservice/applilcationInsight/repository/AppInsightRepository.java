package com.sunil.appservice.applilcationInsight.repository;

import com.sunil.appservice.applilcationInsight.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppInsightRepository extends JpaRepository<Product,Integer> {
}
