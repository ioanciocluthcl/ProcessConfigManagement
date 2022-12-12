package com.drools.research.rulesmanagement.repository;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("rules")
public class RuleEntity {
    @Id
    private ObjectId id;

    @NotBlank
    private String name;

    private String content;

    private Integer version;
}
