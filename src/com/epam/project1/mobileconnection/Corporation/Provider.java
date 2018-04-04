package com.epam.project1.mobileconnection.Corporation;

import com.epam.project1.mobileconnection.Utils.Utils;
import java.util.Arrays;
import java.util.Comparator;

public class Provider {

    private final int MAX_AMOUNT_OF_CLIENTS = 100;
    private int currentAmountOfClients = 0;

    private Tariff[] clients = new Tariff[MAX_AMOUNT_OF_CLIENTS]; //Сколько клиентов, столько и тарифов

    public Tariff[] getClients() {
        return clients;
    }

    public int getCurrentAmountOfClietns() {
        return currentAmountOfClients;
    }

    public void addClient() {
        System.out.println("Choose Prepaid or com.epam.project1.mobileconnection.Corporation.Contract");
        switch (Utils.readData()) {
            case "Prepaid":
                System.out.println("Choose InternetAccess or SimpleTariff");
                switch (Utils.readData()) {
                    case "InternetAccess":
                        System.out.println("Choose Cheap or Middle or High or Ultra");
                        switch (Utils.readData()) {
                            case "Cheap":
                                clients[currentAmountOfClients] = new InternetAccess(3, "Cheap");
                                currentAmountOfClients++;
                                break;
                            case "Middle":
                                clients[currentAmountOfClients] = new InternetAccess(3, "Middle");
                                currentAmountOfClients++;
                                break;
                            case "High":
                                clients[currentAmountOfClients] = new InternetAccess(3, "High");
                                currentAmountOfClients++;
                                break;
                            case "Ultra":
                                clients[currentAmountOfClients] = new InternetAccess(3, "Ultra");
                                currentAmountOfClients++;
                                break;
                            default:
                                System.out.println("This type of tariff doesn't exist yet, try one more time!");
                        }
                        break;
                    case "SimpleTariff":
                        System.out.println("Choose Cheap or Middle or High or Ultra");
                        switch (Utils.readData()) {
                            case "Cheap":
                                clients[currentAmountOfClients] = new SimpleTariff(3, "Cheap");
                                currentAmountOfClients++;
                                break;
                            case "Middle":
                                clients[currentAmountOfClients] = new SimpleTariff(3, "Middle");
                                currentAmountOfClients++;
                                break;
                            case "High":
                                clients[currentAmountOfClients] = new SimpleTariff(3, "High");
                                currentAmountOfClients++;
                                break;
                            case "Ultra":
                                clients[currentAmountOfClients] = new SimpleTariff(3, "Ultra");
                                currentAmountOfClients++;
                                break;
                            default:
                                System.out.println("This type of tariff doesn't exist yet, try one more time!");
                        }
                        break;
                    default:
                        System.out.println("This type of tariff doesn't exist yet, try one more time!");
                }
                break;
            case "com.epam.project1.mobileconnection.Corporation.Contract":
                System.out.println("Choose com.epam.project1.mobileconnection.Corporation.FreeInternet or Conversational");
                switch (Utils.readData()) {
                    case "com.epam.project1.mobileconnection.Corporation.FreeInternet":
                        System.out.println("Choose Cheap or Middle or High or Ultra");
                        switch (Utils.readData()) {
                            case "Cheap":
                                clients[currentAmountOfClients] = new FreeInternet(3, "Cheap");
                                currentAmountOfClients++;
                                break;
                            case "Middle":
                                clients[currentAmountOfClients] = new FreeInternet(3, "Middle");
                                currentAmountOfClients++;
                                break;
                            case "High":
                                clients[currentAmountOfClients] = new FreeInternet(3, "High");
                                currentAmountOfClients++;
                                break;
                            case "Ultra":
                                clients[currentAmountOfClients] = new FreeInternet(3, "Ultra");
                                currentAmountOfClients++;
                                break;
                            default:
                                System.out.println("This type of tariff doesn't exist yet, try one more time!");
                        }
                        break;
                    case "Conversational":
                        System.out.println("Choose Cheap or Middle or High or Ultra");
                        switch (Utils.readData()) {
                            case "Cheap":
                                clients[currentAmountOfClients] = new Conversational(3, "Cheap");
                                currentAmountOfClients++;
                                break;
                            case "Middle":
                                clients[currentAmountOfClients] = new Conversational(3, "Middle");
                                currentAmountOfClients++;
                                break;
                            case "High":
                                clients[currentAmountOfClients] = new Conversational(3, "High");
                                currentAmountOfClients++;
                                break;
                            case "Ultra":
                                clients[currentAmountOfClients] = new Conversational(3, "Ultra");
                                currentAmountOfClients++;
                                break;
                            default:
                                System.out.println("This type of tariff doesn't exist yet, try one more time!");
                        }
                        break;
                    default:
                        System.out.println("This type of tariff doesn't exist yet, try one more time!");
                        break;
                }
            default:
                System.out.println("This type of tariff doesn't exist yet, try one more time!");
        }
    }

    public void showAmountOfClients() {
        System.out.println("Current amount of clienta: " + currentAmountOfClients);
    }

    public void sortBySubscriptionFee() {
        Arrays.sort(clients, new Comparator<Tariff>() {
            @Override
            public int compare(Tariff o1, Tariff o2) {
                if (o1.subscriptionFee < o2.subscriptionFee)
                    return -1;
                else if (o1.subscriptionFee > o2.subscriptionFee)
                    return 1;
                else
                    return 0;
            }
        });
    }

    public void findAppropriateTariff(int packageOfServicePrice) {
        for (Tariff x : clients) {
              if (x != null && x.packageOfServicePrice == packageOfServicePrice)
                  System.out.println(x);
        }
    }
}
