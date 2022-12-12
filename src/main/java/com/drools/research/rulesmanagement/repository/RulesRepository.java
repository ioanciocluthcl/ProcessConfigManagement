package com.drools.research.rulesmanagement.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RulesRepository extends MongoRepository<RuleEntity, ObjectId> {

    List<RuleEntity> findByName(String name);
}
