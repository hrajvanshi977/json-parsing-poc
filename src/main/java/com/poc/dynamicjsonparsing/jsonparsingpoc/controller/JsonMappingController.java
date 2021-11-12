package com.poc.dynamicjsonparsing.jsonparsingpoc.controller;

import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.JsonMapping;
import com.poc.dynamicjsonparsing.jsonparsingpoc.repository.JsonMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JsonMappingController {

    @Autowired
    JsonMappingRepository repository;
}
