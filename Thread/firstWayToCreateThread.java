package Thread;
class  MyClassThread implements  Runnable{


    @Override
    public void run ( ) {
        System.out.println ("Hello My Thread");
    }
}
public class firstWayToCreateThread {
    public static void main ( String[] args ) {
        MyClassThread t = new MyClassThread ();
        Thread thread = new Thread (t);
        thread.start ();
    }
}

