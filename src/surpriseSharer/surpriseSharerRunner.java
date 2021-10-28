package surpriseSharer;

import surpriseSharer.bag.*;
import surpriseSharer.give.AbstractGiveSurprises;
import surpriseSharer.give.GiveSurpriseAndApplause;
import surpriseSharer.surprise.GatherSurprises;
import surpriseSharer.surprise.ISurprise;

import java.util.ArrayList;
import java.util.Scanner;


public class surpriseSharerRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BagFactory myBagFactory = new BagFactory();

        IBag myRandomBag = myBagFactory.makeBag("random");
        IBag myLifoBag = myBagFactory.makeBag("LiFo");
        IBag myFiFoBag = myBagFactory.makeBag("FiFo");

        myRandomBag.printSurpriseList();

        System.out.println("======= STARTS RANDOM =======");
        ArrayList<ISurprise> surprises = GatherSurprises.gather(5);
        ISurprise surprise = GatherSurprises.generateRandomSurprise();

        BagFactory bag1 = new BagFactory();
        IBag randomBag =  bag1.makeBag("random");

        randomBag.put(surprise);
        System.out.println();

        for (int i = 0; i < surprises.size(); i++) {
            randomBag.put(surprises.get(i));
            System.out.println("[MAIN.RANDOM]: " + "Step " + (i + 1) + ": ");
            surprises.get(i).enjoy();
        }

        System.out.println("[MAIN.RANDOM]: Initialize surprises.GiveSurpriseAndApplause");
        AbstractGiveSurprises giveSurprise1 = new GiveSurpriseAndApplause("random", 3);
        System.out.println("[MAIN.RANDOM]: ===== STARTING copying surprises from random to Bag =====");
        giveSurprise1.put(randomBag);
        System.out.println("[MAIN.RANDOM]: ===== ENDING copying surprises  =====");

        System.out.println("[MAIN.RANDOM]: surprises.GiveSurpriseAndApplause.GiveWithPassion");
        giveSurprise1.giveWithPassion();

    }
}
