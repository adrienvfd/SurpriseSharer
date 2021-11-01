package surpriseSharer.give;

import surpriseSharer.bag.IBag;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises{

    public GiveSurpriseAndApplause(IBag container, int waitTime) {
        super(container, waitTime);
    }
    @Override
    public void giveWithPassion() {
        System.out.println("Loud applause to you... For it is in giving that we receive");
    }
}
