package com.monocept.test;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LetsPlayPig {

	public static void main(String[] args) {
		int turn = 0 , totalScore = 0;
		System.out.println("Let's Play PIG !!");
		
		do {
			int turnScore = 0;
			turn++;
			System.out.println("..........................................");
			System.out.println("\nTURN "+turn);
			while(getUserChoice() == 'r') {
				int x = ThreadLocalRandom.current().nextInt(1, 7);
				System.out.println("Die : "+x);
				if(x == 1) {
					System.out.println("Turn Over. No Score :");
					turnScore = 0;
					break;
				}
				turnScore += x;
				if(turnScore+totalScore >= 20)break;
			}
			totalScore += turnScore;
			System.out.println("Turn Score :"+turnScore);
			System.out.println("Total Score :"+totalScore);
			
			
		}while(totalScore < 20);
		System.out.println("You Finishes in "+turn +" Turns");
		System.out.println("\n\nGame Over!!!!!");
		

	}

	public static char getUserChoice() {
		System.out.println("Roll or hold? (r/h) : ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		return ch;

	}

}
