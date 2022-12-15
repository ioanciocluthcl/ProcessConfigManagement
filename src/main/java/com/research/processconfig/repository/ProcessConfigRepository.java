package com.research.processconfig.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;

@Repository
public interface ProcessConfigRepository extends MongoRepository<ProcessConfigEntity, ObjectId> {

    List<ProcessConfigEntity> findByTenantId(Integer tenantId);

    default ProcessConfigEntity getTenantConfig(Integer tenantId){
        ProcessConfigEntity entity = findByTenantId(tenantId).stream().sorted(Comparator.comparing(ProcessConfigEntity::getVersion).reversed()).findFirst().orElse(null);
        return entity;
    }
}
