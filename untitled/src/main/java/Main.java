public class Main extends Thread
{
    //2 ways to create a thread:
    // --by extending the Thread class and overriding its run() method
    //--Another way to create a thread is to implement the Runnable interface
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
//The major difference is that when a class extends the Thread class, you cannot extend any other class,
// but by implementing the Runnable interface, it is possible to extend from another class as well, like: class MyClass extends OtherClass implements Runnable