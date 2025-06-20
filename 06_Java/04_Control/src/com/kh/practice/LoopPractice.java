package com.kh.practice;
import java.util.Arrays;
import java.util.Scanner;

import com.kh.practice.model.RockPaperScissor;
import com.kh.practice.view.RockPapaerScissorView;
class LoopPractice {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LoopPractice l = new LoopPractice();
        // l.method1();
        // l.method2();
        // l.method3();
        // l.method4();
        // l.method5();
        l.method6();
    }
    /*
        문제: 사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오.
        예: 사용자 입력 : 5
            5
            4
            3
            2
            1
     */
    public void method1() {
        System.out.print("사용자 입력 : ");
        int number = sc.nextInt();
        if (number < 1 || number > 100) {
            System.out.println("1~100 사이의 숫자만 입력하세요.");
            return;
        }
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
    /*
        문제: 1 + (-2) + 3 + (-4) + ... 과 같은 식으로 계속 더해나갔을 때,
        몇까지 더해야 총합이 100 이상 되는지 출력하시오.
     */
    public void method2() {
        int sum = 0;
        int num = 0;
        while(sum < 100) {
        	num++;
            if (num % 2 == 0) {
                sum -= num;
            } else {
                sum += num;
            }
            
            /*
            if(sum >= 100) {
            	System.out.println(num);
            	break;
            }
            */
        }
        System.out.println(num);
    }
    /*
        문제: 사용자로부터 문자열을 입력 받고, 검색할 문자를 입력 받아
        해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하시오.
        
        문자열 : banana
        문자 : a
        banana 안에 포함된 a 개수 : 3
        
     */
    public void method3() {
    	System.out.print("문자열 : ");
        String str = sc.nextLine();
        System.out.print("문자 : ");
        char ch = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
        	
            if(ch == str.charAt(i)) {
            	count++;
            }
        }
        System.out.println(str + " 안에 포함된 " + ch + " 개수 : " + count);
    }
    /*
        문제: 0이 나올 때까지 숫자를 출력하시오. (random 사용! 0 ~ 10)
        7
        3
        4
        2
        3
        4  
        0            
     */
    public void method4() {
       while(true) { 
    	int random = (int) (Math.random() * 11);
        System.out.println(random);
        if(random == 0) break;
       }
    }
    
    /*
        문제: 주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용!)
        예:
        1 : 3
        2 : 2
        3 : 1
        4 : 0
        5 : 4
        6 : 0
     */
    public void method5() {
    	int[] dice = new int[6]; // dice[0] : 1, dice[1] : 2, ... dice[5] : 6
    	
        for(int i = 0; i < 10; i++) {
        	int random = (int) (Math.random() * 6 + 1); // 1 ~ 6 -> 0 ~ 5
        	dice[random]++;        	
        }
        
        for(int i = 0; i < dice.length; i++) {
        	System.out.println((i+1) + " : " + dice[i]);        	
        }
    }
    /*
        문제: 사용자 이름을 입력하고 컴퓨터와 가위바위보를 하세요.
        컴퓨터가 랜덤하게 가위, 바위, 보 중 하나 선택.
        사용자가 이길 때까지 반복하며, 비긴 횟수, 진 횟수, 이긴 횟수 출력.
     */
    public void method6() {
    	
    	RockPapaerScissorView view = new RockPapaerScissorView();
    	view.gameStart();
    }
    
    
}

