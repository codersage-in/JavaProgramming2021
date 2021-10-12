package threaddemo1;
class Runner implements Runnable  //Runnable is the method which is an interface which has only one method i.e. void run()
{
    //implement is used to implement an interface . The interface keyword is used to declare a special type of class that only contains abstract methods
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello" + i);
            try {
                Thread.sleep(100); //Sleep is a static method //NotifyAll And Wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ImplementThreadClassTest0
{
    public static void main(String[] args)
    {
        Thread T1 = new Thread(new Runner()); //new Runner is to pass the instance of the class
        Thread T2 = new Thread(new Runner());
        T1.start();
        T2.start();
    }
}

//In this code we obtain continuous two line same in output as because both threads are running together.