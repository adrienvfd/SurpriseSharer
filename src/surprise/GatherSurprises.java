package surprise;

import surprise.bag.FifoBag;

import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {
    private static Random random = new Random();
    private static final int NUMBER_OF_SURPRISE_TYPES = 3;

    //o metoda statica, gather(int n), ce primeste un numar intreg n si returneaza un array continand n surprize.
    //o metoda statica, gather(), care va returna o singura surpriza.


    private GatherSurprises(){

    }

    public static ISurprise generateRandomSurprise() {
        ISurprise newSurprise = null;

        switch (random.nextInt(NUMBER_OF_SURPRISE_TYPES)) {
            case 0:
                newSurprise = FortuneCookie.generate() ;
                break;
            case 1:
                newSurprise = Candies.generate();
                break;
            case 2:
                newSurprise = MinionToy.generate();
                break;
        }
        return newSurprise;
    }

    public static void gather(int n){
        ArrayList<ISurprise> surpriseArrayList= new ArrayList<>();

        for (int i = 0; i < n; i++){
            surpriseArrayList.add(generateRandomSurprise());
        }


    }

}
