package surpriseSharer.give;

import surpriseSharer.bag.IBag;

public class GiveSurpriseAndSing extends AbstractGiveSurprises{

    GiveSurpriseAndSing(IBag container, int waitTime) {
        super(container, waitTime);
    }

    @Override
    public void giveWithPassion() {
        System.out.println("Singing a nice song, full of joy and genuine excitement…");
    }
}
