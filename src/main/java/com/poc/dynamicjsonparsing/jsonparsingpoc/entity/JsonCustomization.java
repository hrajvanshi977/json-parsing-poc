package com.poc.dynamicjsonparsing.jsonparsingpoc.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class JsonCustomization {

    @Id
    private int id;

    @Column(name="customer_id")
    private String customerId;

    @Column(name="field_id")
    private String fieldId;

    @Column(name="property_id")
    private String propertyId;

    @Column(name="geo_id")
    private String geoId;

    @Column(name="custom_json")
    private String customJson;
}
