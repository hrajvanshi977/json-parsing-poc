package com.poc.dynamicjsonparsing.jsonparsingpoc.entity.template.modifcation.field;

import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.FieldMaster;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FieldUpdateTemplate {
    private String tabId;
    private String sectionId;
    private String fieldId;
    private FieldMaster data;
}
