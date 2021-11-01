package surpriseSharer.give;
import surpriseSharer.bag.IBagFactory;
import surpriseSharer.surprise.ISurprise;
import surpriseSharer.bag.BagFactory;
import surpriseSharer.bag.IBag;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises implements IGiveSurprise{
    private IBag container;
    private int waitTime; // wait time in seconds
    private final IBagFactory bagFactory;


    /*
    (…)	Constructorul va primi 2 parametri:
1. tipul containerului (i.e. unul dintre tipurile de containere definite anterior - "RANDOM", "FIFO" sau "LIFO"). Parametrul are tipul String.
2. un timp de asteptare. Utilizarea concreta a acestuia va fi explicata in continuare.

     */

    AbstractGiveSurprises(String containerType, int waitTime){
        bagFactory = new BagFactory();
        this.container = bagFactory.makeBag(containerType);

        if (waitTime < 0){
            waitTime = 0;
        }
        this.waitTime = waitTime;
    }

    public void put(ISurprise newSurprise){
        //adds a surprise to container.
        container.put(newSurprise);
    }

    public void put(IBag surprises){
        //moves all the surprise from a container to this container
        container.put(surprises);
    }

    private void give(){
        //ISurprise surprise = container.takeOut();
        //surprise.enjoy();
        container.takeOut().enjoy();
        surpriseSharer.helpers.Separation.separate();

        try {
            TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void giveOne(){
        surpriseSharer.helpers.Separation.separate();
        give();
        giveWithPassion();
    }

    @Override
    public void giveAll(){
        // Sleep for X seconds - code snippet
        surpriseSharer.helpers.Separation.separate();
        while (!container.isEmpty()){
            this.give();
        }
        giveWithPassion();
        surpriseSharer.helpers.Separation.separate();

    }

    @Override
    public void gatherAndPut(int number){
        container.put(surpriseSharer.surprise.GatherSurprises.gather(number));
    }

    @Override
    public IBag getContainer() {
        return container;
    }

    protected abstract void giveWithPassion();

}
