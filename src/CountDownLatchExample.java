import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so let`s open market");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }


    public static void main(String[] args) throws InterruptedException {
        new Friend("Zaur", countDownLatch);
        new Friend("Irina", countDownLatch);
        new Friend("Helen", countDownLatch);
        new Friend("Karlos", countDownLatch);
        marketStaffsOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;
    Friend (String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " приступил к закупкам");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}