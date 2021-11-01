package surpriseSharer.give;
import surpriseSharer.bag.IBag;
import surpriseSharer.helpers.RandomHelper;

public final class GiveSurpriseFactory {
    private static final int TOTAL_NUMBER_OF_WITH_PASSION = 3;
    int waitTime;
    IBag container;

    //prevent Instantiation
    public GiveSurpriseFactory(IBag container, int waitTime){
        this.container = container;
        this.waitTime = waitTime;
    }

    public IGiveSurprise giveSurpriseGenerator(){
        int random = RandomHelper.getNewRandomInt(TOTAL_NUMBER_OF_WITH_PASSION);
        switch (random){
            case 0: return new GiveSurpriseAndApplause(this.container, this.waitTime);
            case 1: return new GiveSurpriseAndHug(this.container, this.waitTime);
            case 2: return new GiveSurpriseAndSing(this.container, this.waitTime);
            default:
                System.err.println("Error... TOTAL_NUMBER_OF_WITH_PASSION not up to date");
        }
        return null;
    }

}
