package com.poc.dynamicjsonparsing.jsonparsingpoc.entity.template.modifcation.tab;

import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.FieldMaster;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SectionMasterTemplate {
    private String sectionName;
    private List<FieldMaster> fields;
}
