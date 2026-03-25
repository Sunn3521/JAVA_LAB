class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\t From Thread A: i=" + i);
        }
        System.out.println("Exit from A");
    }
}



public class ThreadRunnableTest {
    public static void main(String[] args) throws Exception {
		A threadA=new A();
		Thread t=new Thread(threadA);
		t.start();	
    }
} 
