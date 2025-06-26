package com.kh.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.kh.set.A_HashSet;

public class Application {

	public static void main(String[] args) {
		int[] result = new int[4];
		// index: 0 - 2등, 1 - 3등, 2- 4등, 3 - 5등
		
		// 1등 당첨 기준이 로또 번호 6개
		// 둘 다 랜덤! 로또 번호는 1번!
		// 내 번호는 맞출때까지!! 1 ~ 45
		// 정렬이 딱 맞으면 equals로 비교 가능 <- 1등 당첨 확인!
		Set<Integer> lotto = new HashSet<>();
		// 반복문이 로또번호가 6개 될 때까지!
		
		// 만약 2등 당첨! 보너스 번호가 일치 + 5개가 같은 경우
		// 3등 당첨! 5개만 같은 경우
		// 4등 당첨! 4개만 같은 경우
		// 5등 당첨! 3개만 같은 경우
		
		while(lotto.size() < 7) {
			lotto.add((int) (Math.random() * 45) + 1);
		}
		
		List<Integer> lottoList = new ArrayList<>(lotto); // set -> list
		
		List<Integer> realLotto = lottoList.subList(0, 6);
		int bonus = lottoList.get(6);
		
		// ------------------------------------------------
		int count = 0;
		while(true) {
			count++;
			List<Integer> myLotto = new ArrayList<>();
			while(myLotto.size() < 6) {
				int number = (int) (Math.random() * 45) + 1;
				if(!myLotto.contains(number)) {
					myLotto.add(number);
				}
			}
			
			Collections.sort(realLotto);
			Collections.sort(myLotto);
			System.out.println("로또번호 : " + realLotto);
			System.out.println("내 번호 : " + myLotto);
			
			int check = 0;
			for(Integer number : realLotto) {
				if(myLotto.contains(number)) {
					check++;
				}
			}
			
			if(realLotto.equals(myLotto)) {
				System.out.println("1등 당첨! 횟수 : " + count);
				for(int i = 0; i < result.length; i++) {
					System.out.print((i+2) + "등 횟수 : " + result[i] + " ");
				}
				break;
			} else if(check == 5 && myLotto.contains(bonus)) { // 2등 당첨 : 5개가 같고 보너스 번호가 맞고!
				System.out.print("2등 당첨! 보너스 번호 : " + bonus + ", 횟수 : " + count);
				result[0]++;
			} else if(check == 5) {
				System.out.print("3등 당첨! 횟수 : " + count);
				result[1]++;
			} else if(check == 4) {
				System.out.print("4등 당첨! 횟수 : " + count);
				result[2]++;
			} else if(check == 3) {
				System.out.print("5등 당첨! 횟수 : " + count);
				result[3]++;
			}
		}
				
		
	}

}
