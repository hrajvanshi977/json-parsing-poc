package com.poc.dynamicjsonparsing.jsonparsingpoc.entity.template.modifcation.field;

import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.FieldMaster;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FieldAddTemplate {
    private String after;
    private String tabId;
    private String sectionId;
    private FieldMaster data;
}
