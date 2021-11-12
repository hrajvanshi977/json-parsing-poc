package com.poc.dynamicjsonparsing.jsonparsingpoc.entity.template.modifcation.section;

import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.SectionMaster;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SectionAddTemplate {
    private String tabId;
    private String after;
    private SectionMaster data;
}
