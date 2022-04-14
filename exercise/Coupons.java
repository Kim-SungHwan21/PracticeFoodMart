package day5.exercise;

public abstract class Coupons implements Coupon {

    @Override
    public double discount(double listPrice) {
        return listPrice;
    }
}
