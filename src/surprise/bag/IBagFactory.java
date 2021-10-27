package surprise.bag;

public interface IBagFactory {
    public static final String[] TYPES_OF_BAGS = {"RANDOM", "FIFO", "LIFO"};

    // Create a new container, according to the specified type
    IBag makeBag(String type);
}
