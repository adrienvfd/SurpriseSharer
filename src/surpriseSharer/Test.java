package surpriseSharer;

import surpriseSharer.bag.BagFactory;
import surpriseSharer.bag.IBag;
import surpriseSharer.bag.IBagFactory;
import surpriseSharer.give.GiveSurpriseFactory;
import surpriseSharer.give.IGiveSurprise;
import surpriseSharer.helpers.Separation;
import surpriseSharer.surprise.GatherSurprises;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

    static void scenario01(Scanner sc) {

        // Let's create a GiveSurprise Object that will contain Bag #1
        // Pick a bagType (Random, lifo, fifo);
        String bagType;
        int waitTime;
        do {
            System.out.println("Let's create Bag #1");
            System.out.print("What type of bag do you want (Random, Lifo, Fifo)?\t");
            bagType = sc.nextLine().toUpperCase();
            System.out.print("How long do you want to wait between each gift given (in s)?\t");
            waitTime = sc.nextInt();
            sc.nextLine();
        } while (!Arrays.stream(IBag.TYPES_OF_BAGS).toList().contains(bagType));


        // Create a GiveSurpriseFactory based on user Input.
        GiveSurpriseFactory myGiveSurpriseFactory = new GiveSurpriseFactory(bagType, waitTime);
        // Create an object of type IGiveSurprise
        IGiveSurprise myGiveSurprise = myGiveSurpriseFactory.giveSurpriseGenerator();

        // Gather n surprises...
        System.out.print("How many surprises do you want to gather?\t");
        myGiveSurprise.gatherAndPut(sc.nextInt());
        sc.nextLine();

        // Print container:
        myGiveSurprise.getContainer().printSurpriseList();
        Separation.separate();

        // Create Bag #2:
        IBagFactory myBagFactory = new BagFactory();
        IBag myBag;
        do {
            System.out.println("Let's Create Bag #2");
            System.out.print("What type of bag do you want (Random, Lifo, Fifo)?\t");
            bagType = sc.nextLine().toUpperCase();
        } while (!Arrays.stream(IBag.TYPES_OF_BAGS).toList().contains(bagType));
        myBag = myBagFactory.makeBag(bagType);

        Separation.separate();
        System.out.println("Let's add 3 random surprises to this bag...");
        myBag.put(GatherSurprises.gather(3));
        myBag.printSurpriseList();
        Separation.separate();

        // Add One or All surprises to the first bag?
        String oneOrAll;
        do {
            System.out.println("Add ONE or ALL objects to bag #1 using objects from bag #2?");
            oneOrAll = sc.nextLine().toUpperCase();
        } while (!oneOrAll.equals("ONE") && !oneOrAll.equals("ALL"));

        if (oneOrAll.equals("ONE")){
            myGiveSurprise.put(myBag.takeOut());
        } else if (oneOrAll.equals("ALL")){
            myGiveSurprise.put(myBag);
        }

        //Print status:
        Separation.separate();
        System.out.println("myGiveSurprise Bag#1 status: ");
        myGiveSurprise.getContainer().printSurpriseList();
        Separation.separate();
        System.out.println("Bag#2 status:");
        myBag.printSurpriseList();
        Separation.separate();


        //Give 1 surprise or give AllSurprises?
        System.out.println("Let's go back to te original myGiveSurprise object: ");
        while (!myGiveSurprise.getContainer().isEmpty()) {
            System.out.print("Do you want to give one surprise or all surprises (type ONE or ALL)? \t");
            String userInput = sc.nextLine().toUpperCase();

            if (userInput.equals("ONE")) {
                myGiveSurprise.giveOne();
            } else if (userInput.equals("ALL")) {
                myGiveSurprise.giveAll();
            } else {
                System.err.println("Input Error");
            }
        }

        // Print Bag#1
        System.out.println("BAG #1: ");
        myGiveSurprise.getContainer().printSurpriseList();
    }
}
