/**
 * Created by MattBrown on 10/26/15.
 */
public class AnonClassFunctionExample {
    public static void main(String[] args) {
        //run code from separate method (step #1)
        sayHello();

        // Run code from anonn class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from an anonymous class!");
            }
        };
        r1.run();

        //Run code from anon feature
        Runnable r2 = () -> {
            System.out.println("Hello from an anonymous function!");
        };
        r2.run();
    }

    static void sayHello(){//run code from saparate method (step #2)
        System.out.println("Hello from a separate method!");
    }
}
