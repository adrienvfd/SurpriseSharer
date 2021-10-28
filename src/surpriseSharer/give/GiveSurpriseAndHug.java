package surpriseSharer.give;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {

    GiveSurpriseAndHug(String containerType, int waitTime) {
        super(containerType, waitTime);
    }

    @Override
    public void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");
    }
}
