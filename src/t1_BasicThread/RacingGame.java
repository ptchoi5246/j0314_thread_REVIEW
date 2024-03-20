package t1_BasicThread;

import java.util.Random;

class Horse extends Thread {
    private String name;
    private int position;
    private final int finishLine = 50;

    public Horse(String name) {
        this.name = name;
        this.position = 0;
    }

    public void run() {
        Random random = new Random();
        while (position < finishLine) {
            int distance = random.nextInt(5) + 1; // 1에서 5까지의 거리를 무작위로 이동
            position += distance;
            System.out.println(name + "이(가) " + distance + "만큼 이동하여 위치: " + position);
            try {
                sleep(500); // 0.5초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + "이(가) 도착했습니다!");
    }
}

public class RacingGame {
    public static void main(String[] args) {
        int numHorses = 5;
        Horse[] horses = new Horse[numHorses];

        for (int i = 0; i < numHorses; i++) {
            horses[i] = new Horse("말 " + (i + 1));
        }

        System.out.println("경주를 시작합니다!");
        for (Horse horse : horses) {
            horse.start();
        }

        for (Horse horse : horses) {
            try {
                horse.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("경주가 종료되었습니다!");
    }
}
