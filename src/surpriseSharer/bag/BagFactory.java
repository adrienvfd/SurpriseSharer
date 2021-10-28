package surpriseSharer.bag;

import java.util.Arrays;

public class BagFactory implements  IBagFactory{

    public IBag makeBag(String type) {
        type = type.toUpperCase();
        // Let's find the index of String in Allowed types of bags.
        int index = Arrays.stream(IBag.TYPES_OF_BAGS).toList()
                .indexOf(type);

        switch (index){
            case 0: return new RandomBag();
            case 1: return new FifoBag();
            case 2: return new LifoBag();
            default:
                System.err.printf("Error: this type of surprise.bag does not exist");
                return null;
        }
    }
}
