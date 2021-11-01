package surpriseSharer.bag;

import surpriseSharer.surprise.ISurprise;

import java.util.ArrayList;

public interface IBag {
    public static final String[] TYPES_OF_BAGS = {"RANDOM", "FIFO", "LIFO"};

    // adds a surprise in the surprise.bag
    void put(ISurprise newSurprise);
    void put(ArrayList<ISurprise> newSurpriseList);


    // adds all the surprises from another IBag
    //   -> the 'bagOfSurprises' will be empty() afterwards
    void put(IBag bagOfSurprises);

    // removes a surprise from the surprise.bag and returns it
    ISurprise takeOut();

    // Checks if the surprise.bag is empty or not
    boolean isEmpty();

    // Returns the number of surprises
    int size();

    void printSurpriseList();
}

