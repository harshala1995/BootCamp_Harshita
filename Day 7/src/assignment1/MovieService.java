package assignment1;

/**
 * Created by marwahh on 7/26/2017.
 */
public class MovieService {
    static void buy(User user, double price) throws InvalidPriceException {
        if (price < 2000) {
            if (price < 0) {
                InvalidPriceException e = new InvalidPriceException("Input value can not be zero or negative!!!");
                throw e;
            }
            InvalidPriceException e = new InvalidPriceException("Price cannot be less than 2000");
            throw e;
        }
    }

    static void watch(User user) throws InvalidAgeException, InvalidRatingException, AgeOutOfBoundException {
        if (user.getAge() < 0) {
            InvalidAgeException e = new InvalidAgeException("Invalid age");
            throw e;
        } else if (user.getAge() < 10) {
            AgeOutOfBoundException e = new AgeOutOfBoundException("Age less than 10");
            throw e;
        } else if (user.getAge() < 20) {
            AgeOutOfBoundException e = new AgeOutOfBoundException("Invalid age");
            throw e;
        } else if (user.getRating() < 3) {
            InvalidRatingException e = new InvalidRatingException("Invalid age");
            throw e;
        }
    }
}
