package com.demo1;

public class StringToIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="12 23 34 45 35 25";
		String[] sa=s.split(" ");
		int[] arr=new int[sa.length];
		for(int i=0;i<sa.length;i++) {
			arr[i]=Integer.parseInt(sa[i]);
			System.out.println(arr[i]);
		}

	}

}
