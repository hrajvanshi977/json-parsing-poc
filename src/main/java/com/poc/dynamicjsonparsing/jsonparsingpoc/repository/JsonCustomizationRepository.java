package com.poc.dynamicjsonparsing.jsonparsingpoc.repository;

import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.JsonCustomization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JsonCustomizationRepository extends JpaRepository<JsonCustomization, String> {
    JsonCustomization findByFieldIdAndCustomerId(String fieldId, String customerId);

    JsonCustomization findByCustomerId(String customerId);
}
