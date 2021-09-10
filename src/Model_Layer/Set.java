package Model_Layer;

import Model_Layer.Helper.SetHelper;

public class Set {

    private int Id;
    private String name;
    private String day;
    private String stage;
    private String beginTime;
    private String endTime;

    private final SetHelper setHelper;

    public Set() {
        this.setHelper = new SetHelper();
    }
}
