package surpriseSharer;

import surpriseSharer.bag.BagFactory;
import surpriseSharer.bag.IBag;
import surpriseSharer.bag.IBagFactory;
import surpriseSharer.give.GiveSurpriseFactory;
import surpriseSharer.surprise.GatherSurprises;
import surpriseSharer.surprise.ISurprise;

import java.util.ArrayList;
import java.util.Scanner;

public class NavigatorScenario01 {

    static void navigate(Scanner sc) {
        // Since we only have one type of BagFactory, let's instantiate a default bagFactory.
        IBagFactory myBagFactory = new BagFactory();

        // Pick a bagType (Random, lifo, fifo);
        String bagType;
        IBag myBag;
        do {
            System.out.println("What type of bag do you want? (Random, Lifo, Fifo)");
            bagType = sc.nextLine().toUpperCase();
            myBag = myBagFactory.makeBag(bagType);
        } while (myBag == null);

        // Gather n surprises...
        System.out.println("How many surprises do you want to gather?");
        ArrayList<ISurprise> newSurpriseList = GatherSurprises.gather(sc.nextInt());

        // Put the surprises in the bag:
        myBag.put(newSurpriseList);

        // Setting Waiting time between gifts
        System.out.println("When gifts are given, what wait-time do you want?");
        int waitTime = sc.nextInt();
        sc.nextLine();

        // Creating a GiveSurpriseFactory with the current Bag & current waitTime
        GiveSurpriseFactory myGiveSurpriseFactory = new GiveSurpriseFactory(myBag, waitTime);

        //Give 1 surprise or give AllSurprises?
        while (!myBag.isEmpty()) {
            System.out.println("Do you want to give one surprise or all surprises (type ONE or ALL)");
            String userInput = sc.nextLine().toUpperCase();

            if (userInput.equals("ONE")) {
                myGiveSurpriseFactory.giveSurpriseGenerator().give();
            } else if (userInput.equals("ALL")) {
                myGiveSurpriseFactory.giveSurpriseGenerator().giveAll();
            } else {
                System.err.println("Input Error");
            }
        }




    }


}
