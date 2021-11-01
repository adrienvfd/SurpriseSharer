package surpriseSharer.surprise;

import java.util.ArrayList;
import surpriseSharer.helpers.RandomHelper;
public final class GatherSurprises {
    private static final int NUMBER_OF_SURPRISE_TYPES = 3;

    //o metoda statica, gather(int n), ce primeste un numar intreg n si returneaza un array continand n surprize.
    //o metoda statica, gather(), care va returna o singura surpriza.


    // We prevent instantiation of the class:
    private GatherSurprises(){}

    private static ISurprise generateRandomSurprise() {
        int randomNum = RandomHelper.getNewRandomInt(NUMBER_OF_SURPRISE_TYPES);
        switch (randomNum) {
            case 0: return FortuneCookie.generate();
            case 1: return Candies.generate();
            case 2: return MinionToy.generate();
            default:
                System.err.println("error, NUMBER_OF_SURPRISE_TYPES not up to date");
                return null;
        }
    }

    public static ArrayList<ISurprise> gather(int n){
        ArrayList<ISurprise> surpriseArrayList= new ArrayList<>();
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                surpriseArrayList.add(generateRandomSurprise());
            }
        }
        return surpriseArrayList;
    }
}
