import java.util.Date;

public class Card {
    int discount;
    Date expirationDate;
    Date enrollDate;
    String subscription;

//    we have to calculate expiration date.................................
    public Card(int discount, Date enrollDate, Date expirationDate) {
        this.discount = discount;
        this.enrollDate = enrollDate;
        this.expirationDate = expirationDate;
        this.subscription = "none";
    }

    public String checkSubscription() {
        return subscription;
    }
}
