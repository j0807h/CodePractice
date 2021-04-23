package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		두 정수 A와 B가 주어졌을 때,
//		A와 B를 비교하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		sc.close();
		
		//삼항 연산자 사용
		String str = (A>B)?">":((A<B)?"<":"==");
		System.out.println(str);
		
//		if(A > B) {
//			System.out.println(">");
//		}
//		if(A < B) {
//			System.out.println("<");
//		}
//		if(A == B) {
//			System.out.println("==");
//		}
	}

}
