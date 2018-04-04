package com.epam.project1.mobileconnection.Corporation;

public abstract class Contract extends Tariff {

    public Contract(int subscriptionFee) {
        super(subscriptionFee);
    }

    @Override
    void call() {
        if (packageOfSevices == false){
                amountOfMoney -= subscriptionFee;
                System.out.println("Goodok...");
            }
        else
            System.out.println("Goodok...");
    }
}
