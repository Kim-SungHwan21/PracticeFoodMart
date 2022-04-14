package day5.exercise;

import java.util.ArrayList;


public class BuyList {


    private final ArrayList<Item> items = new ArrayList<>();

    public int getItemsSize(){
        return items.size();
    }

    public Item getItemFromIndex(int index){
        return items.get(index);
    }

    public void add(Item item) {
        items.add(item);
    }

    public static class Item {
        private final String name;

        private final int amount;

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", amount=" + amount +
                    '}';
        }

        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }
    }
}
