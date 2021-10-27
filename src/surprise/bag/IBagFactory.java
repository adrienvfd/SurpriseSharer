package surprise.bag;


public interface IBagFactory {
    String[] TYPES_OF_BAGS = {"RANDOM", "FIFO", "LIFO"};

    // Create a new container, according to the specified type
    IBag makeBag(String type);
}
