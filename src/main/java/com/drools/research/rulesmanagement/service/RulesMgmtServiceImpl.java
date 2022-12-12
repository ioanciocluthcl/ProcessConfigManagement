package com.drools.research.rulesmanagement.service;

import com.drools.research.rulesmanagement.dto.Rule;
import com.drools.research.rulesmanagement.repository.RuleEntity;
import com.drools.research.rulesmanagement.repository.RulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;

@Service
public class RulesMgmtServiceImpl implements RulesMgmtService{

    @Autowired
    protected RulesRepository rulesRepository;

    @Autowired
    protected RulesMapper rulesMapper;

    @Override
    public Rule save(Rule rule) {
        return null;
    }

    @Override
    public Rule getLatest(String name) {
        RuleEntity latestRule = rulesRepository.findByName(name).stream().sorted(Comparator.comparing(RuleEntity::getVersion).reversed()).findFirst().get();
        Rule rule = rulesMapper.ruleEntityToRule(latestRule);
        return rule;
    }
}
