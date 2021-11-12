package com.poc.dynamicjsonparsing.jsonparsingpoc.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TabFeilds {

    private String tab_id;

    private List<SectionTabs> sections;
}
