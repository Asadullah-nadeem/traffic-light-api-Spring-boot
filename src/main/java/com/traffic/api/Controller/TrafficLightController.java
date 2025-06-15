package com.traffic.api.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/traffic")
public class TrafficLightController {

    @GetMapping("/status")
    public String getStatus(@RequestParam long seconds) {
        long cycle = seconds % 190;

        if (cycle <= 125) return "RED - Waiting for data load.";
        else if (cycle <= 130) return "YELLOW - Get ready...";
        else return "GREEN - Data successfully loaded!";
    }
}
