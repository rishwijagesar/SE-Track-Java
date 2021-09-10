package Model_Layer;

import Model_Layer.Helper.ReviewHelper;

public class Review {
    private int id;
    private int setId;
    private int rating;
    private String comment;

    private final ReviewHelper reviewHelper;

    public Review() {
        this.reviewHelper = new ReviewHelper();
    }

    public void createReview() {

    }
}
