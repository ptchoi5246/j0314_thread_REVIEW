package t1_BasicThread;

public class T2_MultiTreadREVIEW extends Thread {
	@Override
	public void run() {
		System.out.println("==============================");
		System.out.println("현재 클래스명 : T2_MultiTreadREVIEW");
		System.out.println("현재 실행중인 스레드 이름 : " + Thread.currentThread().getName());
		System.out.println("==============================");
		
	}
	
}
