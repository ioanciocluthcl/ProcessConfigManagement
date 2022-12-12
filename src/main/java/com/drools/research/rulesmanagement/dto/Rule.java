package com.drools.research.rulesmanagement.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class Rule {
    private String name;

}
