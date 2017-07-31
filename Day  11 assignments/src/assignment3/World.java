package assignment3;

/**
 * Created by marwahh on 7/31/2017.
 */
public class World {
    static int i = 0;

    public static void main(String[] args) {

        for (int j = 0; j < 20; j++) {

            Thread worker1 = new Thread(()->{i++});
            worker1.start();

            Thread worker2 = new Thread(()->{
                System.out.println(i);
            });
            worker2.start();
        }
        System.out.println("Finish");

    }
}
