package com.poc.dynamicjsonparsing.jsonparsingpoc.entity;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class JsonMapping {

    @Id
    private int id;

    @Column(name="financier_id")
    private String financierId;

    @Column(name="property_id")
    private String propertyId;

    @Column(name="geo_id")
    private String geoId;

    @Column(name="master_json")
    private String masterJson;


}
