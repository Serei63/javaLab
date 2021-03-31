package verify.exam00;

import java.io.InputStream;
import java.util.Scanner;

public class JuminCheck01 {

	// �ֹι�ȣ Ÿ�缺 �˻��ϴ� �޼ҵ�
	public boolean juminCheck(String jumin) {
		// �ۼ� ��ġ
		// 1. �ֹι�ȣ �� �ڸ��� �ش� ���ڸ� ���Ѵ�
		// 2. 1�� �������� 11�� ���� �������� ���Ѵ�
		// 3. 11���� ������ ���� �� �� üũ�� ��ȣ�� ��, ������ �ùٸ� �ֹι�ȣ, Ʋ���� Ʋ�� �ֹι�ȣ
		// int[] mul = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		int total = 0;

		for (int i = 0; i < 12; i++) {
			if (i <= 7) {
				total += Integer.parseInt(jumin.substring(i, i + 1)) * (i + 2);
			} else {
				total += Integer.parseInt(jumin.substring(i, i + 1)) * (i - 6);
			}
		}

		total %= 11;
		total = 11 - total;
		if (total >= 10) {
			total = total % 10;
		}

		if (total == Integer.parseInt(jumin.substring(12))) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JuminCheck01 jc = new JuminCheck01();

		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");
		String jumin1 = sc.next(); // 111111
		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");
		String jumin2 = sc.next(); // 1111011

		if (jumin1.length() != 6) {
			System.out.println("�ֹι�ȣ ���ڸ��� 6�ڸ� �Է�");
		} else if (jumin2.length() != 7) {
			System.out.println("�ֹι�ȣ ���ڸ��� 7�ڸ� �Է�");
		} else if (!jc.juminCheck(jumin1 + jumin2)) {
			System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
		} else {
			System.out.println("�ùٸ� �ֹι�ȣ �Դϴ�");
		}

	}

}
