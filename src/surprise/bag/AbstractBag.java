package surprise.bag;

import surprise.ISurprise;

import java.util.ArrayList;
import java.util.Random;

abstract class AbstractBag implements IBag {

    private ArrayList<ISurprise> surpriseList;
    private static Random random = new Random();

    @Override
    public void put(IBag bagOfSurprises){
        while (!bagOfSurprises.isEmpty()){
            put(bagOfSurprises.takeOut());
        }
    }

    @Override
    public boolean isEmpty(){
        return surpriseList.isEmpty();
    }

    @Override
    public int size(){
        return surpriseList.size();
    }

    public static int getRandom(int max){
        return random.nextInt(max);
    }

    @Override
    public void put(ISurprise newSurprise) {
        surpriseList.add(newSurprise);
    }

    public ArrayList<ISurprise> getSurpriseList(){
        return surpriseList;
    }

    public void removeInSurpriseList(int num){
        surpriseList.remove(num);
    }


}
