package Model_Layer.Helper;

import Model_Layer.Set;

import java.util.ArrayList;
import java.util.Random;

public class DJHelper implements IArray{

    // statics
    private final static int BOUND = 100;
    private ArrayList<Set> setLists;

    public DJHelper(){
        this.setLists = new ArrayList<Set>();
    }

    // generate ID for DJ
    public int generateID() {
        Random random = new Random();
        return random.nextInt(this.BOUND);
    }

    @Override
    public void addToArrayList() {

    }

    @Override
    public void readArrayList() {

    }

    @Override
    public void updateArrayList() {

    }

    @Override
    public void removeArrayList() {

    }
}
