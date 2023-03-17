package com.example.consumingtest;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetingService {
    RestTemplate restTemplate = new RestTemplate();
    public Population[] getPopulation() {
        Population[] population = restTemplate.getForObject(
                "https://analisi.transparenciacatalunya.cat/resource/nw5s-4ixa.json", Population[].class);
        System.out.println(getPopulation());
        return population;
    }
}
