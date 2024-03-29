package com.icolak.day39_collections.multiThreading;

public class TestMultiThreading {

    public static void main(String[] args) {

        ThreadHelloWorld thread1 = new ThreadHelloWorld(1);
        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);
        ThreadHelloWorld thread3 = new ThreadHelloWorld(3);
        ThreadHelloWorld thread4 = new ThreadHelloWorld(4);
        ThreadHelloWorld thread5 = new ThreadHelloWorld(5);

/*
        thread1.run();
        thread2.run();
        thread3.run();
        thread4.run();
        thread5.run();
*/
        // if we want the threads get to be executed at the same time(thread2 doesn't wait for thread1 to finish)
        // we have to use start method instead of run method When we use start method,
        // run method gets executed at the same time
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}