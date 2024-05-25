package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;

@Data
@Entity(name = "food")
public class FoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;
    private String image;
    private Integer price;
}
