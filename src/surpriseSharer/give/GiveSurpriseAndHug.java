package surpriseSharer.give;

import surpriseSharer.bag.IBag;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {

    GiveSurpriseAndHug(String containerType, int waitTime) {
        super(containerType, waitTime);
    }

    @Override
    protected void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");
    }
}
