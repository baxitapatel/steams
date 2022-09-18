package io.pragra.learning.dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DishRun {
    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();
addDish(dishes);
       // System.out.println(dishes);

//        boolean b = dishes.stream().anyMatch(dish -> dish.getDishType() == DishType.VEG);
//        System.out.println(b);
//
//        long count = dishes.stream().count();
//        System.out.println(count);

        List<Dish> collect = dishes.stream().dropWhile(d -> d.getDishType() == DishType.NON_VEG).collect(Collectors.toList());
        System.out.println(collect);

//
//        Optional<Dish> first = dishes.stream()
//                .filter(d -> d.getDishType() == DishType.VEG)
//                .filter(d -> d.getCusineType() == CusineType.INDIAN)
//                .distinct()
//                .findFirst();
//        if (first.isPresent()){
//            System.out.println(first.get());
//        }



    }
    private static void addDish(List<Dish>dishes){
        dishes.add(
                Dish.builder()
                        .name("ButterChicken")
                        .cusineType(CusineType.INDIAN)
                        .ingredient(Arrays.asList("Chicken","Salt","Onione","Spices"))
                        .dishType(DishType.NON_VEG)
                        .price(12.99)
                        .build()


        );
        dishes.add(
                Dish.builder()
                        .name(" VegByriyani")
                        .cusineType(CusineType.INDIAN)
                        .ingredient(Arrays.asList("Vegetable","Rice","Salt","Onione","Spices"))
                        .dishType(DishType.VEG)
                        .price(15.99)
                        .build()
        );
        dishes.add(
                Dish.builder()
                        .name(" VegByriyani")
                        .cusineType(CusineType.INDIAN)
                        .ingredient(Arrays.asList("Vegetable","Rice","Salt","Onione","Spices"))
                        .dishType(DishType.VEG)
                        .price(15.99)
                        .build()
        );
        dishes.add(
                Dish.builder()
                        .name("Dosa")
                        .cusineType(CusineType.INDIAN)
                        .ingredient(Arrays.asList("Rice","Salt","Onione","Spices"))
                        .dishType(DishType.VEG)
                        .price(10.99)
                        .build()
        );
        dishes.add(
                Dish.builder()
                        .name("Hakka Noodle")
                        .cusineType(CusineType.CHINESE)
                        .ingredient(Arrays.asList("Noodles","Salt","Onione","Spices"))
                        .dishType(DishType.VEG)
                        .price(18.99)
                        .build()
        );
        dishes.add(
                Dish.builder()
                        .name("Chilli Chicken")
                        .cusineType(CusineType.INDIAN)
                        .ingredient(Arrays.asList("Chillis","Chicken","Onione","Spices"))
                        .dishType(DishType.NON_VEG)
                        .price(20.99)
                        .build()
        );


    }
}
