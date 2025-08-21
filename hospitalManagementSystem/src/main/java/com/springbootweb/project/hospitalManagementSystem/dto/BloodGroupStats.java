package com.springbootweb.project.hospitalManagementSystem.dto;

import com.springbootweb.project.hospitalManagementSystem.entity.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroupType;
    private final Long count;
}
