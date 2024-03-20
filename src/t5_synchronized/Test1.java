package t5_synchronized;
//동기화 - 순차적으로 진행 - 내 작업이 끝날때까지 문 닫아놓고 내 작업이 끝나면 문 열어서 다른 작업 이어서 할 수 있게 하는 것
//멀티스레드는 동시에 진행하는 것이기 때문에 동기화는 순차적으로 진행이기 때문에 거의 사용하지 않는다.
// 일반 공유객체
class MyData {
	int data = 10;
	
	public void plusMothod() {
		int mydata = data;
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		data = mydata + 1;
	}
}

// 공유객체를 사용할 스레드 객체
class UseMyData extends Thread {
	MyData myData = new MyData();
	
	@Override
	public void run() {
		myData.plusMothod();
		System.out.println(getName() + "실행결과 : " + myData.data);
	}
}


public class Test1 {
	public static void main(String[] args) {
		// 공유객체를 각각 생성
		
		// #1 스레드
		Thread th1 = new UseMyData();
		th1.start();
		
		// #2 스레드
		Thread th2 = new UseMyData();
		th2.start();
		
	}
}
