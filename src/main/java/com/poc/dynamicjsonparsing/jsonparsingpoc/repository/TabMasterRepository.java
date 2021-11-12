package com.poc.dynamicjsonparsing.jsonparsingpoc.repository;

import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.TabMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TabMasterRepository extends  JpaRepository<TabMaster, String> {
    TabMaster findByTabId(String tabId);
}
