package com.poc.dynamicjsonparsing.jsonparsingpoc.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class SectionMaster {

    @Id
    @Column(name="section_id")
    private String sectionId;

    @Column(name="section_label")
    private String sectionLabel;

    @Column(name="show_by_default")
    private boolean showByDefault;
}
