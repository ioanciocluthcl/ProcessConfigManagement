package com.drools.research.rulesmanagement.service;

import com.drools.research.rulesmanagement.dto.Rule;

public interface RulesMgmtService {
    Rule save(Rule rule);
    Rule getLatest(String name);
}
