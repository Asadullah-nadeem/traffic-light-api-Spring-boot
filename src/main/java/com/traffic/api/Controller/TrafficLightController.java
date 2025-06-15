package com.traffic.api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/traffic")
public class TrafficLightController {

    @GetMapping("/status")
    public String getStatus(@RequestParam(name = "seconds") long seconds) {
        long cycle = seconds % 190;

        if (cycle <= 125) {
            return "RED - Waiting for data load.";
        } else if (cycle <= 130) {
            return "YELLOW - Get ready...";
        } else {
            return "GREEN - Data successfully loaded!";
        }
    }
}
