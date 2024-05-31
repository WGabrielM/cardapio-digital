package com.example.cardapio.food;

public record FoodResponseDTO(Long id, String title, String image, Integer price) {

    public FoodResponseDTO(FoodEntity food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
