package surpriseSharer;

import surpriseSharer.bag.BagFactory;
import surpriseSharer.bag.IBag;
import surpriseSharer.bag.IBagFactory;

import java.util.Scanner;

public class Navigator {

    // 1. Pick number of bag:
    static void navigate(Scanner sc) {
        // Since we only have only one type of BagFactory, let's instantiate a default bagFactory.
        IBagFactory myBagFactory = new BagFactory();

        System.out.println("What type of bag do you want? (Random, Lifo, Fifo)");
        IBag myBag = myBagFactory.makeBag(sc.nextLine());

        System.out.println("How");

    }


}
