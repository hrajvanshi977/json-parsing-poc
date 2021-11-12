package com.poc.dynamicjsonparsing.jsonparsingpoc.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
public class ValidationMaster {

    @Id
    private Long id;

    private String type;

    private String params;
}
