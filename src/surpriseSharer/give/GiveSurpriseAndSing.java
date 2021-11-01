package surpriseSharer.give;

import surpriseSharer.bag.IBag;

public class GiveSurpriseAndSing extends AbstractGiveSurprises{

    GiveSurpriseAndSing(String containerType, int waitTime) {
        super(containerType, waitTime);
    }

    @Override
    protected void giveWithPassion() {
        System.out.println("Singing a nice song, full of joy and genuine excitement…");
    }
}
