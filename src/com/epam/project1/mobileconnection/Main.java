package com.epam.project1.mobileconnection;

import com.epam.project1.mobileconnection.Corporation.Provider;

public class Main {
    public static void main(String[] args) {
        Provider provider = new Provider();
        provider.addClient();
        System.out.println(provider.getCurrentAmountOfClietns());
        provider.findAppropriateTariff(50);
    }
}
