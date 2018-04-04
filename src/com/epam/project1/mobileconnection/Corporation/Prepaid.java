package com.epam.project1.mobileconnection.Corporation;

public abstract class Prepaid extends Tariff {

    public Prepaid(int subscriptionFee) {
        super(subscriptionFee);
    }

    @Override
    void call() {
        if (packageOfSevices == false)
            if (amountOfMoney >= subscriptionFee) {
                amountOfMoney -= subscriptionFee;
                System.out.println("Goodok...");
            }
            else
            System.out.println("There isn't opportunity to call, please, replenish your phone balance");
        else
            System.out.println("Goodok...");
    }
}
