package surpriseSharer.give;

public class GiveSurpriseAndSing extends AbstractGiveSurprises{

    GiveSurpriseAndSing(String containerType, int waitTime) {
        super(containerType, waitTime);
    }

    @Override
    public void giveWithPassion() {
        System.out.println("Singing a nice song, full of joy and genuine excitement…");
    }
}
