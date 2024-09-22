package threads;

public class ThreadsExample {

    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest('A');
        ThreadTest t2 = new ThreadTest('B');
        ThreadTest t3 = new ThreadTest('C');
        ThreadTest t4 = new ThreadTest('D');

        /** Thread main, execute o método run do t1, t2... **/
        //t1.run();
        //t2.run();
        //t3.run();
        //t4.run();

        /** JVM, comece uma nova thread: **/
        //t1.start();
        //t2.start();
        //t3.start();
        //t4.start();

        /** Forma recomendada de trabalhar com Threads,
         * utilizando a interface Runnable **/
        Thread tr1 = new Thread(new ThreadTestRunnable('A'));
        Thread tr2 = new Thread(new ThreadTestRunnable('B'));
        Thread tr3 = new Thread(new ThreadTestRunnable('C'));
        Thread tr4 = new Thread(new ThreadTestRunnable('D'));

        tr1.start();
        tr2.start();
        tr3.start();
        tr4.start();
    }
}

class ThreadTest extends Thread{
    private char c;

    public ThreadTest(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 500; i++){
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
        }
    }
}

class ThreadTestRunnable implements Runnable{
    private char c;

    public ThreadTestRunnable(char c){
        this.c = c;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 500; i++){
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
        }
    }

}