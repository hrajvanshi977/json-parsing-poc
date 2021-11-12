package com.poc.dynamicjsonparsing.jsonparsingpoc.entity.template.modifcation.tab;

import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.TabMaster;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabUpdateTemplate {
    private String tabId;
    private TabMaster data;
}
