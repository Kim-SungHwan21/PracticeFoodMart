package day5.exercise;

import java.util.ArrayList;

public class FoodStand {
    private final ArrayList<Food> foods = new ArrayList<>();

    public Food getFoodFromIndex(int index){
        return foods.get(index);
    }

    public Food removeFoodFromIndex(int index){
        return foods.remove(index);
    }


    public void add(Food food) {
        foods.add(food);
    }

    public int getFoodSize(){
        return foods.size();
    }
}
