package surpriseSharer.give;


public class GiveSurpriseAndApplause extends AbstractGiveSurprises{

    public GiveSurpriseAndApplause(String container, int waitTime) {
        super(container, waitTime);
    }
    @Override
    protected void giveWithPassion() {
        System.out.println("Loud applause to you... For it is in giving that we receive");
        surpriseSharer.helpers.Separation.separate();
    }
}
