package io.pragra.learning.dish;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class Dish {
    private String name ;
    private DishType dishType;
    public CusineType cusineType;
    public List<String> ingredient;
    private double price;


}
