package com.drools.research.rulesmanagement.service;

import com.drools.research.rulesmanagement.dto.Rule;
import com.drools.research.rulesmanagement.repository.RuleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class RulesMapper {

    public abstract Rule ruleEntityToRule(RuleEntity entity);
}
