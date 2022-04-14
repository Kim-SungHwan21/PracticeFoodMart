package day5.exercise;

import java.util.Scanner;

public class Counter {
    Scanner in = new Scanner(System.in);
    static double listPrice;
    PercentCoupon percentCoupon = new PercentCoupon();
    OneThousandCoupon oneThousandCoupon = new OneThousandCoupon();
    Basket basket;
    int num;

    public void totalListPrice(Basket basket) {
        for (int i = 0; i < basket.getBasketSize(); i++) {

            listPrice += basket.getBasketFormIndex(i).getPrice();
            }
        System.out.println("합계: " + listPrice + "원 입니다.");

        }

    public double couponAccept(){
        System.out.println("쿠폰을 사용하시겠습니까? 미사용:1번 천원할인 쿠폰:2번 10%할인 쿠폰:3번");
        num = in.nextInt();
        if(num == 1){
            System.out.println("쿠폰을 사용하지 않습니다.");
        } else if (num == 2){
            System.out.println("천원할인 쿠폰을 사용합니다.");
            oneThousandCoupon.discount(listPrice);
        } else if (num == 3) {
            System.out.println("10%할인 쿠폰을 사용합니다.");
            percentCoupon.discount(listPrice);
        }

        return listPrice;
    }


}







