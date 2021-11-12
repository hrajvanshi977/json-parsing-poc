package com.poc.dynamicjsonparsing.jsonparsingpoc.entity.template.modifcation.tab;

import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.TabMasterTemplate;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TabAddTemplate {
    private String after;
    private TabMasterTemplate data;
}
