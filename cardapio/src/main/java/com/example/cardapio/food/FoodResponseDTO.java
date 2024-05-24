package com.example.cardapio.food;

public record FoodResponseDTO(long id, String title, String image, Integer price) {

    public FoodResponseDTO(FoodEntity food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
