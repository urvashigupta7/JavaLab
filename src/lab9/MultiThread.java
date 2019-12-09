package lab9;

public class MultiThread extends Thread {

    @Override
    public void run() {

        //Current thread name
        System.out.println("Thread running : " + Thread.currentThread().getName());

    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            //creating multiple threads
            MultiThread thread = new MultiThread();
            thread.start();

        }

    }

}
