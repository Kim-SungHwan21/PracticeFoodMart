package day5.exercise;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<Food> foods = new ArrayList<>();


    public Food getBasketView(int index) {
        return foods.get(index);
    }

    public Food getBasketFormIndex(int index){
        return foods.get(index);
    }

    public int getBasketSize(){
        return foods.size();
    }

    @Override
    public String toString() {
        return "Basket{" +
                "foods=" + foods +
                '}';
    }

    public void add(Food food) {foods.add(food);
    }

}
