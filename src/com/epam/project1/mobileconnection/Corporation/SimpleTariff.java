package com.epam.project1.mobileconnection.Corporation;

import com.epam.project1.mobileconnection.Corporation.Prepaid;

public class SimpleTariff extends Prepaid {

    private int sms;
    private int minutesOnAnotherProviders;

    private enum TypeOfTariff{

        Cheap(50, 100, 50), Middle(100, 150, 75), High(150, 250, 100), Ultra(500, 10000, 500);

        private int sms;
        private int minutesOnAnotherProviders;
        private int packageOfServicePrice;

        TypeOfTariff(int sms, int minutesOnAnotherProviders, int packageOfServicePrice) {
            this.sms = sms;
            this.minutesOnAnotherProviders = minutesOnAnotherProviders;
            this.packageOfServicePrice = packageOfServicePrice;
        }
    }

    SimpleTariff(int subscriptionFee, String type) {
        super(subscriptionFee);
        boolean flag = true;
        for (SimpleTariff.TypeOfTariff x : SimpleTariff.TypeOfTariff.values()) {
            if (x.name().equalsIgnoreCase(type)){
                this.packageOfServicePrice = x.packageOfServicePrice;
                this.sms = x.sms;
                this.minutesOnAnotherProviders = x.minutesOnAnotherProviders;
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("This type of tariff doesn't exist yet, try one more time!");
    }

    public int getSms() {
        return sms;
    }

    public int getMinutesOnAnotherProviders() {
        return minutesOnAnotherProviders;
    }


    @Override
    public String toString() {
        return "SimpleTariff{" +
                "subscriptionFee=" + subscriptionFee +
                ", packageOfServicePrice=" + packageOfServicePrice +
                ", sms=" + sms +
                ", minutesOnAnotherProviders=" + minutesOnAnotherProviders +
                ", amountOfMoney=" + amountOfMoney +
                ", packageOfSevices=" + packageOfSevices +
                '}';
    }
}
