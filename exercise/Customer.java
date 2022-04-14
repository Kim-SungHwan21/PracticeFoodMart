package day5.exercise;

public class Customer {
    // 고객의 구매 목록
    private BuyList buyList;
    // 고객의 장바구니
    private Basket basket;
    Counter counter = new Counter();
    private static int MONEY = 20_000;


    public Customer(BuyList buyList) {
        this.buyList = buyList;
    }

    // 장바구니를 챙김
    public void bring(Basket basket) {
        this.basket = basket;
    }

    public Basket pickFoods(FoodStand foodStand) {
        Basket basket = new Basket();
        for (int itemIndex = 0; itemIndex < buyList.getItemsSize(); itemIndex++) {
            // [[계란 2개], [파 3개] 1
//            int amount = buyList.getItemFromIndex(itemIndex).getAmount();
            pickFoods2(foodStand, basket, itemIndex);
        }
        System.out.println("장바구니에 담긴 식품목록 입니다.");
        for (int i = 0; i < basket.getBasketSize(); i++) {
            System.out.println(basket.getBasketView(i));
        }
        return null;
    }

    public void pickFoods2(FoodStand foodStand, Basket basket, int itemIndex) {
        BuyList.Item item = buyList.getItemFromIndex(itemIndex);
        for (int i = 0; i <  item.getAmount() ; i++) {
            pickFoods3(foodStand, basket, item.getName());
        }
    }

    public void pickFoods3(FoodStand foodStand, Basket basket, String itemName) {
         for (int i = 0; i < foodStand.getFoodSize(); i++) {
            if (foodStand.getFoodFromIndex(i).getName().equals(itemName)) {
                basket.add(foodStand.removeFoodFromIndex(i));
                return;
            }
        }
    }

    public void payTox() {
        counter.totalListPrice(basket);
        System.out.println(counter.couponAccept() + "원 입니다.");
    }
}
