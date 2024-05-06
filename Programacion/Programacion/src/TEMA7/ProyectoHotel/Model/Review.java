package TEMA7.ProyectoHotel.Model;

public class Review {

    private int number_reviews;
    private String last_review;
    private int reviews_per_month;

    public Review(int number_reviews, String last_review, int reviews_per_month) {
        this.number_reviews = number_reviews;
        this.last_review = last_review;
        this.reviews_per_month = reviews_per_month;
    }


    public int getNumber_reviews() {
        return number_reviews;
    }

    public void setNumber_reviews(int number_reviews) {
        this.number_reviews = number_reviews;
    }

    public String getLast_review() {
        return last_review;
    }

    public void setLast_review(String last_review) {
        this.last_review = last_review;
    }

    public int getReviews_per_month() {
        return reviews_per_month;
    }

    public void setReviews_per_month(int reviews_per_month) {
        this.reviews_per_month = reviews_per_month;
    }
}
