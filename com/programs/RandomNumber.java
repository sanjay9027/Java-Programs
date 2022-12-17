package com.programs;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random rand= new Random();
		int res=rand.nextInt(100);//generate number less than 100
		System.out.println(res);
		double res1=rand.nextDouble(999);
		System.out.println(res1);
		
		//approach 2
		System.out.println(Math.random());
		
	}
}
