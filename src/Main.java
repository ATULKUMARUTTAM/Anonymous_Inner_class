abstract class car{
    abstract void start();
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        car honda = new car() {
            @Override
            void start() {
                System.out.println("car started!!!!!");
            }
        };
        honda.start();
    }
}