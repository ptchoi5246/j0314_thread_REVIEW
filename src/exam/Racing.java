package exam;

import java.util.Scanner;

//.repeat 1.8버전 사용 불가
/*class Horse extends Thread { //상속
	String horseName = ""; //말
	int bat = 0, cnt = 0; //배팅, 카운트
	
	int targetNum = 100;	// 전체 완주거리
	int sum = 0; //>> 찍어주는거
	String[] finalHorse = new String[5]; //5마리 말 배열
	
	public Horse(int bat, String horseName) {
		this.bat = bat; //배팅 - //배팅에 저장
		this.horseName = horseName; //말 선택 = //말 저장
	}
	
	@Override
	public void run() {
		String currentHorse = Thread.currentThread().getName();
		
		while(true) {
			sum += (int)(Math.random()*6) + 1; //랜덤하게 1-6까지
			if(sum < targetNum) { //targetNum = 100 //진행중인 말들이 들어온다.
				System.out.println(currentHorse + "완주율:" + sum + "% : " + ">".repeat(sum)); //sum 누적 //repeat 반복
			}
			else { //완주한 말들이 들어온다.
				sum = targetNum;
				System.out.println(currentHorse + "완주율:" + sum + "% : " + ">".repeat(sum) + "("+currentHorse+"도착)");
				finalHorse[cnt] = currentHorse;
				cnt++;
				break;
			}
			try { Thread.sleep(500); } catch (InterruptedException e) {}
		}
	}

	// 전체 순위와 배팅금액 계산하기
	public void total() {
		int baedangkum;
		String horseRank;
		
		System.out.println("================== 결  과 =================");
		for(int i=0; i<finalHorse.length; i++) {
			System.out.println((i+1)+"등 : " + finalHorse[i]);
		}

		if(horseName.equals(finalHorse[0])) {
			baedangkum = (int) (bat * 2.0);
			horseRank = "1등";
		}
		else if(horseName.equals(finalHorse[1])) {
			baedangkum = (int) (bat * 1.5);
			horseRank = "2등";
		}
		else if(horseName.equals(finalHorse[2])) {
			baedangkum = (int) (bat * 1.2);
			horseRank = "3등";
		}
		else if(horseName.equals(finalHorse[3])) {
			baedangkum = 0;
			horseRank = "4등";
		}
		else {
			baedangkum = 0;
			horseRank = "5등";
		}
		
		System.out.println();
		System.out.println("=======================================================");
		System.out.println("당신이 배팅한 말 : " + horseName + " , 배팅한금액 : " + bat + " , 순위 : " + horseRank);
		System.out.println("당첨금 : " + baedangkum + "원 입니다.");
		System.out.println("=======================================================");
	}
}

public class Racing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String horseName = "";
		int bat = 0;
		
		System.out.println("* 당첨금은 배팅한 금액의 : 1등은 200%, 2등은 150%, 3등은 120%, 4등과 5등은 없습니다.");
		System.out.print("배팅 금액을 입력하세요? ");
		bat = sc.nextInt();
		
		int choice = 0;
		while(true) {
			System.out.println("==> 경주마를 선택하세요? ");
			System.out.print("1번말:태양, 2번말:바람, 3번말:번개, 4번말:태권, 5번말:태풍 ==> ");
			choice = sc.nextInt();
			if(choice < 1 || choice > 5) System.out.println("경주마 번호를 다시 선택해 주세요....");
			else break;
		}
			
		switch(choice) {
			case 1:	horseName = "1번말(태양)"; break;
			case 2:	horseName = "2번말(바람)"; break;
			case 3:	horseName = "3번말(번개)"; break;
			case 4:	horseName = "4번말(태권)"; break;
			case 5:	horseName = "5번말(태풍)"; break;
		}
		
		// 일반스레드 5개
		Horse horse = new Horse(bat, horseName);
		Thread horse1 = new Thread(horse, "1번말(태양)");
		Thread horse2 = new Thread(horse, "2번말(바람)");
		Thread horse3 = new Thread(horse, "3번말(번개)");
		Thread horse4 = new Thread(horse, "4번말(태권)");
		Thread horse5 = new Thread(horse, "5번말(태풍)");
		horse1.start();
		horse2.start();
		horse3.start();
		horse4.start();
		horse5.start();
		
		// main스레드가 모든 스레드가 종료될때까지 기다려준다.
		try { 
			horse1.join();
			horse2.join();
			horse3.join();
			horse4.join();
			horse5.join();
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		horse.total();
		
		sc.close();
	}
}
*/
