package Adapter;

public class ModelProductReviews {
    private String reviewsPersonName, reviewsDate, reviewsWord;
    private int reviewsPersonImg, ratingReviews;

    public String getReviewsPersonName() {
        return reviewsPersonName;
    }

    public String getReviewsDate() {
        return reviewsDate;
    }

    public String getReviewsWord() {
        return reviewsWord;
    }

    public int getReviewsPersonImg() {
        return reviewsPersonImg;
    }

    public int getRatingReviews() {
        return ratingReviews;
    }

    public void setReviewsPersonName(String reviewsPersonName) {
        this.reviewsPersonName = reviewsPersonName;
    }

    public void setReviewsDate(String reviewsDate) {
        this.reviewsDate = reviewsDate;
    }

    public void setReviewsWord(String reviewsWord) {
        this.reviewsWord = reviewsWord;
    }

    public void setReviewsPersonImg(int reviewsPersonImg) {
        this.reviewsPersonImg = reviewsPersonImg;
    }

    public void setRatingReviews(int ratingReviews) {
        this.ratingReviews = ratingReviews;
    }
}
