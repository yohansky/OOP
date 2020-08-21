package Concurrent_Programming;

public class TesterThread2 {

    public static void main(String[] args) {
        ThreadMethod thread1 = new ThreadMethod("Satu");
        ThreadMethod thread2 = new ThreadMethod("Dua");

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
            thread1.suspend();
            System.out.println("Thread Satu di-suspend.");
            Thread.sleep(1000);
            thread1.resume();
            System.out.println("Thread Satu dilanjutkan.");

            thread2.suspend();
            System.out.println("Thread Dua di-suspend.");
            Thread.sleep(1000);
            thread2.resume();
            System.out.println("THread Dua dilanjutkan.");
        } catch (InterruptedException e) {
            System.out.println("Thread utama diiterupsi");
        }

        try {
            System.out.println("Menunggu thread selesai dijalankan.");
            thread1.thread.join();
            thread2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread utama diinterupsi");
        }

        System.out.println("Main thread selesai");
    }
}
