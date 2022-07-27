package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.springboot.demo.mycoolapp.rest.dto.WorkoutPreferences;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@RestController
public class FunRestController {
    // inject properties for: coach.name and team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    private final WorkoutPreferences workoutPreferences;

    @GetMapping("/team-info")
    public ResponseEntity<String> getTeamInfo() {
        return ResponseEntity.ok("Coach " + coachName + ", Team name:" + teamName);
    }

    @GetMapping("/")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello World! Time on server is : " + LocalDateTime.now());
    }

    @GetMapping("/workout")
    public ResponseEntity<String> getDailyWorkout(){
        return ResponseEntity.ok("Run 5km!");
    }

    @GetMapping("/workout-pref/distance")
    public ResponseEntity<String> getDailyWorkoutDistancePreference(){
        return ResponseEntity.ok(workoutPreferences.getDistance());
    }

    @GetMapping("/workout-pref/burned-calories")
    public ResponseEntity<Long> getDailyWorkoutBurnedCaloriesPreference(){
        return ResponseEntity.ok(workoutPreferences.getMinCaloriesBurn());
    }

    @GetMapping("/workout-pref/time-minutes")
    public ResponseEntity<Long> getDailyWorkoutTimeMinutesPreference(){
        return ResponseEntity.ok(workoutPreferences.getMinTimeMinutes());
    }
}
