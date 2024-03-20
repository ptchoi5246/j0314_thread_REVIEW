package t1_BasicThread;
/*
 자바(Java)에서 스레드(Thread)는 프로그램 내에서 동시에 실행되는 작은 실행 단위를 말합니다. 이것은 프로그램의 실행 흐름을 나타내는데 사용됩니다.
 자바에서는 멀티스레딩(multithreading)을 지원하여 여러 작업을 동시에 처리할 수 있게 해줍니다.
스레드를 사용하면 여러 작업을 동시에 실행하거나 병렬로 실행할 수 있으므로, CPU 및 기타 리소스를 효율적으로 활용할 수 있습니다.
또한, 대화형 응용 프로그램에서는 사용자 입력을 받는 동안에도 백그라운드에서 작업을 계속할 수 있습니다.
자바에서는 스레드를 생성하고 제어하기 위해 Thread 클래스를 제공합니다.
Thread 클래스를 상속하거나 //extends Thread
Runnable 인터페이스를 구현함으로써 //implements Runnable 스레드를 생성할 수 있습니다.
일반적으로, Runnable 인터페이스를 구현하는 방법이 스레드를 생성하는 더 선호되는 방법입니다.
@Override
public void run(){
실행내용
}
그리고 Thread 클래스의 인스턴스를 생성하고 start() 메서드를 호출하여 스레드를 실행시킵니다. thread.start();
예를 들어, 다음은 Runnable 인터페이스를 구현하여 스레드를 생성하고 실행하는 간단한 자바 코드입니다.
  */
public class MultiThread implements Runnable {
  public void run() {
      System.out.println("This is a thread running.");
  }

  public static void main(String[] args) {
  		MultiThread multiThread = new MultiThread();
      Thread thread = new Thread(multiThread);
      thread.start();
  }
}
