package com.research.processconfig.controller;

import com.research.processconfig.dto.ProcessConfig;
import com.research.processconfig.service.ProcessConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProcessConfigController {

    @Autowired
    protected ProcessConfigService processConfigService;

    @PostMapping("/processConfig")
    public ProcessConfig saveTenantConfig(@RequestBody ProcessConfig config) {
        return processConfigService.save(config);
    }

    @GetMapping("/processConfig")
    public ProcessConfig getTenantConfig(@RequestParam Integer tenantId) {
        return processConfigService.getTenantConfig(tenantId);

    }
}
