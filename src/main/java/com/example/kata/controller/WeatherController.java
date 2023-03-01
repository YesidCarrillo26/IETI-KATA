package com.example.kata.controller;

import com.example.kata.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/weather/")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(@Autowired WeatherService weatherService) {
        this.weatherService = weatherService;
    }
}
