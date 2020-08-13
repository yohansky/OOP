package Concurrent_Programming;

public class TesterThread {

    public static void main(String[] args) {
        ThreadSaya2 thread1 = new ThreadSaya2("Satu");
        ThreadSaya2 thread2 = new ThreadSaya2("Dua");

        // menjalankan method start tanpa parameter
        thread1.start();
        thread2.start();

        // menjalankan method start berparameter
        thread1.start(Thread.MAX_PRIORITY);
        thread2.start(Thread.NORM_PRIORITY);
    }
}
