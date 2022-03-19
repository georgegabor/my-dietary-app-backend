package com.dietary.food.controller;

import com.dietary.food.model.Food;
import com.dietary.food.service.FoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/foods")
public class FoodController {
  private final Logger LOGGER = LoggerFactory.getLogger(FoodController.class);

  private final FoodService foodService;

  public FoodController(FoodService foodService) {
    this.foodService = foodService;
  }

  @GetMapping
  public List<Food> getAll() {
    LOGGER.info("Getting foods");

    return foodService.getAll();
  }

  @PostMapping
  public Food create(@RequestBody Food food) {
    LOGGER.info("Creating new Food: {}", food);

    return foodService.create(food);
  }
}
