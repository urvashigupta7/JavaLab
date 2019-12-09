package lab9;

public class CurrentThread extends Thread {

    @Override
    public void run() {

        //Current thread name
        System.out.println("Current thread name : " + Thread.currentThread().getName());

    }

    public static void main(String[] args) {

        CurrentThread thread = new CurrentThread();

        //Starting the thread
        thread.start();


    }

}
