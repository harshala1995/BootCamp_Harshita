package assignment1;

/**
 * Created by marwahh on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User user1 = new User(1, "abc", -1, 4);
        User user2 = new User(1, "abc", 9, 4);
        User user3 = new User(1, "abc", 12, 4);
        User user4 = new User(1, "abc", 22, 4);
        User user5 = new User(1, "abc", 22, 2);
        try {
            MovieService.buy(user1, 1000);
        } catch (InvalidPriceException invalid) {
            System.out.println(invalid.getMessage());
        }
        try {
            MovieService.buy(user1, -1000);
        } catch (InvalidPriceException invalid) {
            System.out.println(invalid.getMessage());
        }
        try {
            MovieService.buy(user1, 3000);
        } catch (InvalidPriceException invalid) {
            System.out.println(invalid.getMessage());
        }
        try {
            MovieService.watch(user1);
        } catch (InvalidRatingException invalid) {
            System.out.println(invalid.getMessage());
        } catch (InvalidAgeException invalid) {
            System.out.println(invalid.getMessage());
        } catch (AgeOutOfBoundException invalid) {
            System.out.println(invalid.getMessage());
        }
    }
}
