package com.programs;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int org_num = 153;
		int reminder, n, num = org_num, sum = 0;
		// logic to find no. of digits
		for (n = 0; num != 0; n++) {
			num = num / 10;
		}
		// logic to calculate armstrong
		num = org_num;
		while (num != 0) {
			reminder = num % 10;
			sum = sum + power(reminder, n);
			num /= 10;
		}
		// check armstrong
		if (sum == org_num) {
			System.out.println("Armstrong number " + org_num);
		} else {
			System.out.println("Not armstrong number " + org_num);
		}

	}

//logic to calculate power of a number
	public static int power(int reminder, int n) {
		int result = 1, exponent = n, base = reminder;
//		System.out.println(exponent+" "+base);

		while (exponent != 0) {
			result = result * base;
			exponent -= 1;
		}
//		System.out.println(result);
		return result;
	}

}
