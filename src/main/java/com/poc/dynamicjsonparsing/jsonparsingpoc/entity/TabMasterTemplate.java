package com.poc.dynamicjsonparsing.jsonparsingpoc.entity;

import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.template.modifcation.tab.SectionMasterTemplate;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TabMasterTemplate {
    private String tabName;
    private List<SectionMasterTemplate> sections;
}
