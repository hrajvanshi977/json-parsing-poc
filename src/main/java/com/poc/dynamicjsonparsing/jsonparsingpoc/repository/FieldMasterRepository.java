package com.poc.dynamicjsonparsing.jsonparsingpoc.repository;

import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.FieldMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldMasterRepository extends JpaRepository<FieldMaster, String> {
    FieldMaster findByFieldId(String fieldId);
}
