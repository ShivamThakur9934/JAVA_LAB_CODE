class ThreadOne implements Runnable { 
@Override 
public void run() { 
try { 
while (true) { 
System.out.println("Thread1"); 
Thread.sleep(2000); // 2000 milliseconds = 2 seconds 
} 
} catch (InterruptedException e) { 
System.out.println("Thread1 interrupted."); 
} 
} 
} 
class ThreadTwo implements Runnable { 
@Override 
public void run() { 
try { 
while (true) { 
System.out.println("Thread2"); 
Thread.sleep(4000); 
} 
} catch (InterruptedException e) { 
System.out.println("Thread2 interrupted."); 
} 
} 
} 
public class TwoThreadsExample { 
public static void main(String[] args) { 
Thread t1 = new Thread(new ThreadOne()); 
Thread t2 = new Thread(new ThreadTwo()); 
t1.start(); 
t2.start(); 
} 
}
