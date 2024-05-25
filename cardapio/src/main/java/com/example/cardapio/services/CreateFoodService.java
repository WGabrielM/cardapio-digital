package com.example.cardapio.services;

import com.example.cardapio.food.FoodEntity;
import com.example.cardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateFoodService {

    @Autowired
    private FoodRepository foodRepository;

    public FoodEntity execute(FoodEntity foodEntity) {
        return this.foodRepository.save(foodEntity);
    }

}
