package com.poc.dynamicjsonparsing.jsonparsingpoc.controller;

import com.poc.dynamicjsonparsing.jsonparsingpoc.repository.JsonCustomizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JsonCustomizationController {

    @Autowired
    JsonCustomizationRepository repository;

//    public String getOverridedJson(String fieldId, String customerId){
//        System.out.println("fieldId - "+fieldId+" , customerId - "+customerId);
//        JsonCustomization jsonCustomization =  repository.findByFieldIdAndCustomerId(fieldId,customerId);
//        System.out.println("jsonCustomization - "+jsonCustomization);
//        return jsonCustomization.getOverrideJson();
//    }
}
