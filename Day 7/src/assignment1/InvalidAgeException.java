package assignment1;

/**
 * Created by marwahh on 7/26/2017.
 */
class InvalidAgeException extends Exception{
    public InvalidAgeException() {
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
