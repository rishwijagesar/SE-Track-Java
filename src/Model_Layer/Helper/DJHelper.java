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

    // create new ArrayList
    @Override
    public void addToArrayList() {

        // add new set to list
        this.setLists.add(new Set());
    }

    // read ArrayList
    @Override
    public void readArrayList() {

    }

    // update Arraylist
    @Override
    public void updateArrayList() {

    }

    // remove arraylist
    @Override
    public void removeArrayList() {

    }
}
