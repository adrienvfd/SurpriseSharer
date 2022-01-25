package surprise.give;
import surprise.ISurprise;
import surprise.bag.BagFactory;
import surprise.bag.IBag;
import surprise.bag.IBagFactory;
import java.util.concurrent.TimeUnit;



public abstract class AbstractGiveSurprises {
    BagFactory bagFactory = new BagFactory();
    IBag container;
    int waitTime; // wait time in seconds

    /*
    (…)	Constructorul va primi 2 parametri:
1. tipul containerului (i.e. unul dintre tipurile de containere definite anterior - "RANDOM", "FIFO" sau "LIFO"). Parametrul are tipul String.
2. un timp de asteptare. Utilizarea concreta a acestuia va fi explicata in continuare.

     */

    AbstractGiveSurprises(String containerType, int waitTime){
        this.container = bagFactory.makeBag(containerType);
        this.waitTime = waitTime;

    }

    void put(ISurprise newSurprise){
        //adds a surprise to container.
        container.put(newSurprise);
    }

    void put(IBag surprises){
        //moves all the surprise from a container to this container
        container.put(surprises);
    }

    void give(){
        container.takeOut();
        giveWithPassion();
    }	// the order depends on type of container;

    void giveAll(){
        // Sleep for X seconds - code snippet
        while (!container.isEmpty()){
            this.give();
            try {
                TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    boolean isEmpty(){
        return container.isEmpty();
    }

    protected abstract void giveWithPassion();
    /* O metoda abstracta, care tine locul unei actiuni ce va fi efectuata dupa daruirea fiecarei surprize (ex: aplauze, o imbratisare etc.).
            → Obs: aceasta metoda va fi apelata imediat dupa oferirea unei surprize,
             indiferent de metoda apelata pentru impartirea surprizelor (i.e. give() sau giveAll()).
            → Obs2: metoda va fi vizibila doar in interiorul pachetului si pe lantul de mostenire. */


}
