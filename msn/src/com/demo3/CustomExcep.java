package com.demo3;

import java.util.Scanner;

class VoteExc extends Exception{
	public VoteExc(String msg) {
		super(msg);
	}
}

public class CustomExcep {

	public static void main(String[] args) { //throws VoteExc {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age<18) {
			 try {
				throw new VoteExc("u r not eligible for vote..");
			} catch (VoteExc e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
