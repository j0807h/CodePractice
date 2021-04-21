import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("첫 번재 숫자를 입력하세요.(0보다 크고 10보다 작은 수)");
		a = sc.nextInt();
		System.out.println("두 번재 숫자를 입력하세요.(0보다 크고 10보다 작은 수)");
		b = sc.nextInt();
		System.out.println(a + " + " + b + " = " + (a+b) );

	}

}
