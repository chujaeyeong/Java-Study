package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview interstellar = new MovieReview();
        interstellar.title = "인터스텔라";
        interstellar.review = "good";
        reviews[0] = interstellar;

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "very good";
        reviews[1] = inception;

        for (MovieReview review : reviews) {
            System.out.println("영화이름:" + review.title + " 후기:" + review.review);
        }

    }
}
