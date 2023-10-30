package com.example.cardapio.food;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods")
@Entity(name = "foods")
@Getter //Gera todos os métodos de get em runtime
@NoArgsConstructor //Declara um constructor que não tem argumentos
@AllArgsConstructor //Aceita todos os argumentos do constructor
@EqualsAndHashCode(of = "id") //Id é a representação única
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
}
