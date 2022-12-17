package com.search_sort;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {10,2,35,90,65,22,1,0};
		int key = 100;
		boolean flag=false;
		//logic
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i])
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(key+"is found");
		}
		else {
			System.out.println(key+"is not found");
		}
	}
}
