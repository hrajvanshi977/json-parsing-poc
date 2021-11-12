package com.poc.dynamicjsonparsing.jsonparsingpoc.repository;

import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.SectionMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectionMasterRepository extends JpaRepository<SectionMaster, String> {
    List<SectionMaster> findAll();

    SectionMaster findBySectionId(String sectionId);
}
