package level1.calculator;

import java.util.Scanner;

/*
 * �߰� ����
 *
 * ����� ���� ����ڿ��� "�" ������ �� ���� ����°� �Ϲ����̴�.
 * 
 * ������ �Ʒ� �ڵ�� ��� ������ ���� �ع����� �ִ�.
 * 
 * ����ڿ��� "�" ������ ������ ����� ������ �߰��غ�����
 *
 */
public class CalculatorUserInputAnswer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num1 = 0;
		double num2 = 0;

		while (true) {
			System.out.print("ù ��° ���� �Է�: ");
			String input1 = scanner.nextLine();

			if (input1.equals("AC")) {
				num1 = 0;
				num2 = 0;
				continue; // continue�� ������ �ڵ��� ������ while (true) �� ù �κк��� �ٽ� ����ȴ�.
			}

			try {
				num1 = Double.parseDouble(input1);
			} catch (NumberFormatException e) {
				System.out.println("�߸� �� �Է� �Դϴ�. ���ڸ� �Է��ϰų� \"AC\" �� �Է��ؼ� ������ �ʱ�ȭ�ϼ���.");
				continue;
			}

			System.out.print("�� ��° ���� �Է�: ");
			String input2 = scanner.nextLine();

			if (input2.equals("AC")) {
				num1 = 0;
				num2 = 0;
				continue;
			}

			try {
				num2 = Double.parseDouble(input2);
			} catch (NumberFormatException e) {
				System.out.println("�߸� �� �Է� �Դϴ�. ���ڸ� �Է��ϰų� \"AC\" �� �Է��ؼ� ������ �ʱ�ȭ�ϼ���.");
				continue;
			}

			double sum = num1 + num2;
			double difference = num1 - num2;
			double product = num1 * num2;
			double quotient = num1 / num2;

			System.out.println("��: " + (int) sum);
			System.out.println("��: " + (int) difference);
			System.out.println("��: " + (int) product);
			System.out.println("��: " + (int) quotient);
		}
	}
}
