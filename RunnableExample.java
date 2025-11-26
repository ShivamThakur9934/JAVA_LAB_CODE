class MyThread implements Runnable { 
private String threadName; 
MyThread(String name) { 
this.threadName = name; 
} 
@Override 
public void run() { 
for (int i = 1; i <= 5; i++) { 
System.out.println(threadName + " is running: " + i); 
try { 
Thread.sleep(500); // pause for 0.5 seconds 
} catch (InterruptedException e) { 
System.out.println(threadName + " interrupted."); 
} 
} 
System.out.println(threadName + " finished execution."); 
} 
} 
public class RunnableExample { 
public static void main(String[] args) { 
MyThread task1 = new 
MyThread("Thread-1"); 
MyThread task2 = new MyThread("Thread-2"); 
Thread t1 = new Thread(task1); 
Thread t2 = new Thread(task2); 
t1.start(); 
t2.start(); 
} 
}
