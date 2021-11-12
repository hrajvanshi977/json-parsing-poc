package com.poc.dynamicjsonparsing.jsonparsingpoc.repository;

import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.JsonMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JsonMappingRepository extends JpaRepository<JsonMapping, String> {
    JsonMapping findById(int id);
}
