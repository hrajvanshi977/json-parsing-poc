package com.poc.dynamicjsonparsing.jsonparsingpoc.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class TabMaster {

    @Id
    @Column(name = "tab_id")
    private String tabId;

    @Column(name = "tab_Label")
    private String tabLabel;

    @Column(name = "show_by_default")
    private boolean showByDefault;

//    @Column(name = "is_display_mobile")
//    private boolean isDisplayMobile;
}
