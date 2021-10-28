package surpriseSharer.bag;

import surpriseSharer.surprise.ISurprise;
import surpriseSharer.helpers.randomHelper;

public class RandomBag extends AbstractBag {

    @Override
    public ISurprise takeOut() {
        if (getSurpriseList().isEmpty()){
            return null;
        }
        int randomNumber = randomHelper.getNewRandomInt(getSurpriseList().size());
        // Copy the surprise
        ISurprise surprise = getSurpriseList().get(randomNumber);
        // Delete the surprise from list
        super.removeInSurpriseList(randomNumber);
        // Return the surprise
        return surprise;
    }

}
