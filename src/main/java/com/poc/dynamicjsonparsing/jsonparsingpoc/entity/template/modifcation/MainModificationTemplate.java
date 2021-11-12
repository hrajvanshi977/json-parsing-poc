package com.poc.dynamicjsonparsing.jsonparsingpoc.entity.template.modifcation;

import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.template.modifcation.field.FieldModificationTemplate;
import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.template.modifcation.section.SectionModificationTemplate;
import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.template.modifcation.tab.TabModificationTemplate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MainModificationTemplate {
    private TabModificationTemplate tabModification;
    private SectionModificationTemplate sectionModification;
    private FieldModificationTemplate fieldModification;
}
