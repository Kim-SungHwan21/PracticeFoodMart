package day5.exercise;

import java.util.Scanner;

class NhnMartShell {
    BuyList buyList;
    public static void main(String[] args) {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList buyList = inputBuyListFromShell();
        Customer share = new Customer(buyList);
        // 장바구니를 챙긴다.
        System.out.println("장바구니를 챙기세요.");
        share.bring(mart.provideBasket());
        System.out.println("장바구니를 챙겼습니다.");
        System.out.println("진열대에 식품을 확인해주세요.");
        share.pickFoods(mart.getFoodStand());
        System.out.println("카운터에서 계산을 해주세요.");
        share.payTox();
    }






    private static BuyList inputBuyListFromShell() {

        String name;
        int amount;
        int num;
        Scanner in = new Scanner(System.in);
        BuyList buyList = new BuyList();

        do {
            System.out.println("구매: 1번 ,구매중지: 2번");
            num = in.nextInt();
            if (num==1) {
                    System.out.println("무엇을 구매하시겠습니까? (양파, 계란, 파, 사과)");
                    name = in.next();
                    if (name.equals("양파") || name.equals("계란") || name.equals("파") || name.equals("사과")) {

                        System.out.println("수량을 입력해 주세요.");
                        amount = in.nextInt();

                        buyList.add(new BuyList.Item(name, amount));
                    }
            } if (num == 2) {
                break;
            }

        } while (true);
        return buyList;
    }
}

public class NhnMart {
    private final FoodStand foodStand = new FoodStand();
    private BuyList buyList;
    private Basket basket;

    public void prepareMart() {
        fillFoodStand();
    }

    private void fillFoodStand() {
        for (int i = 0; i < 2; i++) {
            foodStand.add(new Food("양파", 1_000));
        }
        for (int i = 0; i < 5; i++) {
            foodStand.add(new Food("계란", 5_000));
        }
        for (int i = 0; i < 10; i++) {
            foodStand.add(new Food("파", 500));
        }
        for (int i = 0; i < 20; i++) {
            foodStand.add(new Food("사과", 2_000));
        }
    }

    public Basket provideBasket() {
        return new Basket();
    }



    public FoodStand getFoodStand() {
        System.out.println("진열대의 식품 목록 입니다.");
        for (int i = 0; i < foodStand.getFoodSize(); i++) {
            System.out.println(foodStand.getFoodFromIndex(i));
        }
        return foodStand;
    }
}
