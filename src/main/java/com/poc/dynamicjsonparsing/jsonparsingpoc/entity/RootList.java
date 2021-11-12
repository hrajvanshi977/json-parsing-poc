package com.poc.dynamicjsonparsing.jsonparsingpoc.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RootList {
    private String name;

    private boolean isDisplayMobile;

    private String section;

    private List<FieldMaster> fields;
}
