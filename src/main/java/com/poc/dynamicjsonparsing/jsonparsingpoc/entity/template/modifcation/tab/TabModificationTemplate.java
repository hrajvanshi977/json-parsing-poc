package com.poc.dynamicjsonparsing.jsonparsingpoc.entity.template.modifcation.tab;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TabModificationTemplate {
    private List<TabAddTemplate> add;
    private List<TabUpdateTemplate> update;
    private List<String> delete;
}
