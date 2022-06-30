package com.javaproject.docker_jenkins_integration_sample;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.out.println("Hello world......");
		for(int i = 0; i < 10; i++) {
			int var = i < 10/2 ?  i : 10 - i;
			for (int j = 0; j <  10/2 - var; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <  var; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
