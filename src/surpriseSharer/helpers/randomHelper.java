package surpriseSharer.helpers;

import java.util.Random;

public final class randomHelper {

    private static Random randomElement = new Random();

    // Returns a random number between [0, max[
    public static int getNewRandomInt(int max){
        return randomElement.nextInt(max);
    }
}
