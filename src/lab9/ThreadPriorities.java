package lab9;

public class ThreadPriorities extends Thread {
    @Override
    public void run() {

        //Current thread name and priority
        System.out.println ("Thread running : " + Thread.currentThread().getName()
                + " and Running Thread Priority : " + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {

        //creating two threads
        ThreadPriorities thread1 = new ThreadPriorities();
        ThreadPriorities thread2 = new ThreadPriorities();

        //setting priorities
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        //starting threads
        thread1.start();
        thread2.start();

    }

}
