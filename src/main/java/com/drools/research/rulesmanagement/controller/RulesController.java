package com.drools.research.rulesmanagement.controller;

import com.drools.research.rulesmanagement.repository.RuleInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RulesController {

    @GetMapping("rules")
    public RuleInfo getRules(){
        return RuleInfo.builder().name("Drools").build();

    }
}
