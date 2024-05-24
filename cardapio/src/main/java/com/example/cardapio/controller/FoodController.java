package com.example.cardapio.controller;

import com.example.cardapio.food.FoodEntity;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodResponseDTO;
import com.example.cardapio.services.CreateFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private CreateFoodService createFoodService;

    @PostMapping("/")
    public ResponseEntity<Object> create(@RequestBody FoodEntity foodEntity) {
        try {
            var result = this.createFoodService.execute(foodEntity);
            return ResponseEntity.ok().body(result);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @Autowired
    private FoodRepository repository;
    @GetMapping
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}
