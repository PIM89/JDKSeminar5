public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Philosophers philosophers = new Philosophers(String.valueOf(i + 1),3);
            philosophers.start();
        }
    }
}