package surpriseSharer.bag;

import surpriseSharer.surprise.ISurprise;

public class FifoBag extends AbstractBag {

    @Override
    public ISurprise takeOut() {
        if (getSurpriseList().isEmpty()){
            return null;
        }
        // Copy last surprise IN:
        ISurprise firstInSurprise = getSurpriseList().get(0);
        // Remove last surprise from surpriseList:
        super.removeInSurpriseList(0);
        // Return the surprise
        return firstInSurprise;
    }

}
