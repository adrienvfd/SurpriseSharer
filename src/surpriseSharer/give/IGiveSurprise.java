package surpriseSharer.give;

import surpriseSharer.bag.IBag;
import surpriseSharer.surprise.ISurprise;

public interface IGiveSurprise {
    void giveOne();
    void giveAll();
    void gatherAndPut(int number);
    IBag getContainer();
    void put(ISurprise newSurprise);
    void put(IBag newBag);
}
