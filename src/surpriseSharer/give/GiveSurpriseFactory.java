package surpriseSharer.give;
import surpriseSharer.helpers.RandomHelper;

public final class GiveSurpriseFactory {
    private static final int TOTAL_NUMBER_OF_WITH_PASSION = 3;
    int waitTime;
    String containerType;

    public GiveSurpriseFactory(String containerType, int waitTime){
        if (waitTime < 0){
            waitTime = 0;
        }
        this.containerType = containerType.toUpperCase();
        this.waitTime = waitTime;
    }

    public IGiveSurprise giveSurpriseGenerator(){
        int random = RandomHelper.getNewRandomInt(TOTAL_NUMBER_OF_WITH_PASSION);
        switch (random){
            case 0: return new GiveSurpriseAndApplause(this.containerType, this.waitTime);
            case 1: return new GiveSurpriseAndHug(this.containerType, this.waitTime);
            case 2: return new GiveSurpriseAndSing(this.containerType, this.waitTime);
            default:
                System.err.println("Error... TOTAL_NUMBER_OF_WITH_PASSION not up to date");
        }
        return null;
    }

}
