package com.poc.dynamicjsonparsing.jsonparsingpoc.entity.template.modifcation.field;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class FieldModificationTemplate {
    private List<FieldAddTemplate> add;
    private List<FieldUpdateTemplate> update;
    private List<FieldDeleteTemplate> delete;
}
