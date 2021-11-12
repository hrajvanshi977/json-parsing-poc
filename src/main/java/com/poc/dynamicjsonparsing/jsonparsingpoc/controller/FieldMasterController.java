package com.poc.dynamicjsonparsing.jsonparsingpoc.controller;

import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.FieldMaster;
import com.poc.dynamicjsonparsing.jsonparsingpoc.repository.FieldMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldMasterController {

    @Autowired
    FieldMasterRepository repository;

    public FieldMaster getFieldMaster(String fieldId){
        FieldMaster fieldMaster =  repository.findByFieldId(fieldId);
        return fieldMaster;
    }
}
