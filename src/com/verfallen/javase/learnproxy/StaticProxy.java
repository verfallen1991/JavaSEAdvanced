package com.verfallen.javase.learnproxy;

interface BuySubject {
    void buy();
}

class RealBuySubject implements BuySubject {
    @Override
    public void buy() {
        System.out.println("买一台MAC!");
    }
}

class RealBuySubjectProxy implements BuySubject {
    private BuySubject bs;

    public RealBuySubjectProxy(BuySubject bs) {
        this.bs = bs;
    }

    @Override
    public void buy() {
        System.out.println("代购说今天去香港");
        bs.buy();
        System.out.println("代购:买到了，相比国行，省掉税钱，便宜了1500");
    }
}

public class StaticProxy {
    public static void main(String[] args) {
        new RealBuySubjectProxy(new RealBuySubject()).buy();
    }
}
