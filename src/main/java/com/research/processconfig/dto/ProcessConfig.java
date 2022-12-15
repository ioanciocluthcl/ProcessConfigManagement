package com.research.processconfig.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProcessConfig {
    @NotNull
    private Integer tenantId;
    private Integer version;
    private String config;
    private LocalDateTime date;

}
