package com.epam.project1.mobileconnection.Corporation;

public class FreeInternet extends Contract {

    private int amountOfInternet;
    private int sms;
    private int minutesOnAnotherProviders;

    private enum TypeOfTariff{

        Cheap(2000, 50, 50, 50), Middle(4000, 100, 100, 100), High(6000, 150, 150, 150), Ultra(20000, 500, 500, 500);

        private int amountOfInternet;
        private int sms;
        private int minutesOnAnotherProviders;
        private int packageOfServicePrice;

        TypeOfTariff(int amountOfInternet, int sms, int minutesOnAnotherProviders, int packageOfServicePrice) {
            this.amountOfInternet = amountOfInternet;
            this.sms = sms;
            this.minutesOnAnotherProviders = minutesOnAnotherProviders;
            this.packageOfServicePrice = packageOfServicePrice;
        }
    }

    FreeInternet(int subscriptionFee, String type) {
        super(subscriptionFee);
        boolean flag = true;
        for (FreeInternet.TypeOfTariff x : FreeInternet.TypeOfTariff.values()) {
            if (x.name().equalsIgnoreCase(type)){
                this.packageOfServicePrice = x.packageOfServicePrice;
                this.amountOfInternet = x.amountOfInternet;
                this.sms = x.sms;
                this.minutesOnAnotherProviders = x.minutesOnAnotherProviders;
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("This type of tariff doesn't exist yet, try one more time!");
    }

    public int getAmountOfInternet() {
        return amountOfInternet;
    }

    public int getSms() {
        return sms;
    }

    public int getMinutesOnAnotherProviders() {
        return minutesOnAnotherProviders;
    }

    @Override
    public String toString() {
        return "com.epam.project1.mobileconnection.Corporation.FreeInternet{" +
                "subscriptionFee=" + subscriptionFee +
                ", packageOfServicePrice=" + packageOfServicePrice +
                ", amountOfInternet=" + amountOfInternet +
                ", amountOfMoney=" + amountOfMoney +
                ", sms=" + sms +
                ", minutesOnAnotherProviders=" + minutesOnAnotherProviders +
                ", packageOfSevices=" + packageOfSevices +
                '}';
    }
}

