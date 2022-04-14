package day5.exercise;

public class PercentCoupon extends Coupons{

    @Override
    public double discount(double listPrice) {

        if (listPrice > 10_000 ) {
            return listPrice;
        }
        return  listPrice * 0.9;
    }
}
