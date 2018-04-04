package com.epam.project1.mobileconnection.Corporation;

abstract class Tariff {

    int subscriptionFee;
    int packageOfServicePrice;
    int amountOfMoney = 0;
    boolean packageOfSevices = false;

    public Tariff(int subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public int getSubscriptionFee() {
        return subscriptionFee;
    }

    public int getPackageOfServicePrice() {
        return packageOfServicePrice;
    }

    abstract void call();

    void topUp(int amountOfMoney){
        this.amountOfMoney = amountOfMoney;
    }

    void getPackageOfServices(){
        if (amountOfMoney >= packageOfServicePrice){
            amountOfMoney -= packageOfServicePrice;
            packageOfSevices = true;
        }
        else
            System.out.println("Not enough money!");
    }
}


