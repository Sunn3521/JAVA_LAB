class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\t From Thread A: i=" + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\t From Thread B: i=" + j);
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("\t From Thread C: i=" + k);
        }
        System.out.println("Exit from C");
    }
}

public class ThreadPriority {
    public static void main(String[] args) throws Exception {
		A threadA=new A();
		B threadB=new B();
		C threadC=new C();
		threadC.setPriority(10);
		threadB.setPriority(5);
		threadA.setPriority(1);
		System.out.println("Started Thread A");
		threadA.start();
		System.out.println("Started Thread B");
		threadB.start();
		System.out.println("Started Thread C");
		threadC.start();
    }
} 
