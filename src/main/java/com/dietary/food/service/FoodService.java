package com.dietary.food.service;

import com.dietary.food.dao.FoodRepository;
import com.dietary.food.model.Food;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

  private final FoodRepository foodRepository;

  public FoodService(FoodRepository foodRepository) {
    this.foodRepository = foodRepository;
  }

  public List<Food> getAll() {
    return foodRepository.getAll();
  }
}
