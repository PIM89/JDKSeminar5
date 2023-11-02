public class Philosophers extends Thread {
    private String name;
    private int countMeals = 1;
    private int countRef = 1;
    private int maxMeals;
    private static final int DURATION_MEALS = 500;

    public Philosophers(String name, int maxMeals) {
        this.name = name;
        this.maxMeals = maxMeals;
    }

    @Override
    public void run() {
        while (countMeals != maxMeals + 1) {
            eat();
            think();
        }
    }

    public void eat() {
        System.out.println("Филосов " + name + " обедает (" + countMeals + " из 3)");
        countMeals++;
        try {
            Thread.sleep(DURATION_MEALS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void think() {
        System.out.println("Филосов " + name + " размышляет (" + countRef + " из 3)");
        countRef++;
    }
}