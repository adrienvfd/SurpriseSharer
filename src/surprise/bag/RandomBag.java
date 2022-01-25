package surprise.bag;

import surprise.ISurprise;

public class RandomBag extends AbstractBag {

    @Override
    public ISurprise takeOut() {
        if (getSurpriseList().isEmpty()){
            return null;
        }
        int randomNumber = getRandom(getSurpriseList().size());
        // Copy the surprise
        ISurprise surprise = getSurpriseList().get(randomNumber);
        // Delete the surprise from list
        super.removeInSurpriseList(randomNumber);
        // Return the surprise
        return surprise;
    }

}
