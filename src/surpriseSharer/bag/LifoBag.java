package surpriseSharer.bag;

import surpriseSharer.surprise.ISurprise;

public class LifoBag extends AbstractBag {

    @Override
    public ISurprise takeOut() {
        if(getSurpriseList().isEmpty()){
            return null;
        }
        // Copy last surprise IN:
        ISurprise lastInSurprise = getSurpriseList().get(getSurpriseList().size() - 1);
        // Remove last surprise from surpriseList:
        super.removeInSurpriseList(getSurpriseList().size() - 1);
        // Return the surprise
        return lastInSurprise;
    }
}
