package level1.calculator;

import java.util.Scanner;

/*
 * 추가 과제
 *
 * 계산기는 보통 사용자에게 "어떤" 연산을 할 건지 물어보는게 일반적이다.
 * 
 * 하지만 아래 코드는 모든 연산을 전부 해버리고 있다.
 * 
 * 사용자에게 "어떤" 연산을 받을지 물어보는 로직을 추가해보세요
 *
 */
public class CalculatorUserInputAnswer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num1 = 0;
		double num2 = 0;

		while (true) {
			System.out.print("첫 번째 숫자 입력: ");
			String input1 = scanner.nextLine();

			if (input1.equals("AC")) {
				num1 = 0;
				num2 = 0;
				continue; // continue가 나오면 코드의 실행이 while (true) 의 첫 부분부터 다시 실행된다.
			}

			try {
				num1 = Double.parseDouble(input1);
			} catch (NumberFormatException e) {
				System.out.println("잘못 된 입력 입니다. 숫자를 입력하거나 \"AC\" 를 입력해서 과정을 초기화하세요.");
				continue;
			}

			System.out.print("두 번째 숫자 입력: ");
			String input2 = scanner.nextLine();

			if (input2.equals("AC")) {
				num1 = 0;
				num2 = 0;
				continue;
			}

			try {
				num2 = Double.parseDouble(input2);
			} catch (NumberFormatException e) {
				System.out.println("잘못 된 입력 입니다. 숫자를 입력하거나 \"AC\" 를 입력해서 과정을 초기화하세요.");
				continue;
			}

			double sum = num1 + num2;
			double difference = num1 - num2;
			double product = num1 * num2;
			double quotient = num1 / num2;

			System.out.println("합: " + (int) sum);
			System.out.println("차: " + (int) difference);
			System.out.println("곱: " + (int) product);
			System.out.println("분: " + (int) quotient);
		}
	}
}
