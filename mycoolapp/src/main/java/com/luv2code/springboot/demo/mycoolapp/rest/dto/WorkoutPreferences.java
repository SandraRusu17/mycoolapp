package com.luv2code.springboot.demo.mycoolapp.rest.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "workout-pref")
public class WorkoutPreferences {
    private String distance;
    private Long minCaloriesBurn;
    private Long minTimeMinutes;
}
