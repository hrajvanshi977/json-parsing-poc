package com.poc.dynamicjsonparsing.jsonparsingpoc.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class FieldMaster {

    @Id
    @Column(name="field_id")
    private String fieldId;

    @Column(name="field_Label")
    private String name;

    @Column(name="default_type")
    private String type;

    @Column(name="validation_type")
    private String validationType;

    @Column(name="default_value")
    private String defaultValue;

    @Column(name="show_by_default")
    private boolean showByDefault;

    @Column(name="db_object_mapping")
    private String dbObjectMapping;

    private String validations;
}