package com.poc.dynamicjsonparsing.jsonparsingpoc.entity.template.modifcation.section;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class SectionModificationTemplate {
    private List<SectionAddTemplate> add;
    private List<SectionUpdateTemplate> update;
    private List<SectionDeleteTemplate> delete;
}
