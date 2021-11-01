package surpriseSharer.give;

import surpriseSharer.bag.IBag;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {

    GiveSurpriseAndHug(IBag container, int waitTime) {
        super(container, waitTime);
    }

    @Override
    public void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");
    }
}
