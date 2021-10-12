package threaddemo;
class Runner extends Thread
{
    @Override  // Override helps in getting rid of unnecessary stuff here.
    public void run()  //run() method of the thread contains the executable code of the thread This method is not static.
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Hello" + i);
            try {
                Thread.sleep(100); //Sleep is a static method
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ExtendThreadClassTest0
{
    public static void main(String[] args)
    {
        Runner R = new Runner();
        R.start(); //Causes this thread to begin execution
    }
}