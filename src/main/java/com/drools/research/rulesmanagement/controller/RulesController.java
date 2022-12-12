package com.drools.research.rulesmanagement.controller;

import com.drools.research.rulesmanagement.dto.Rule;
import com.drools.research.rulesmanagement.repository.RulesRepository;
import com.drools.research.rulesmanagement.service.RulesMgmtService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RulesController {

    @Autowired
    protected RulesMgmtService rulesMgmtService;

    @GetMapping("rules")
    public Rule getRules(@RequestParam String name){
        return rulesMgmtService.getLatest(name);

    }
}
