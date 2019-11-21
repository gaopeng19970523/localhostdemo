package com.tedu;

public class Test {
public static void main(String[] args) {
	int[] score= {8,2,5,4,3};
	int temp=score[0];
	for(int index=1;index<5;index++) {
		if(score[index]<temp) {
			temp=score[index];
		}
	}
	System.out.println(temp);
}
}
