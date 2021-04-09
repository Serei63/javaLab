package verity.exam05;

import java.util.function.IntBinaryOperator;

public class LambdaExample {

	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		// �ִ밪 ���
		int max = maxOrMin((x, y) -> {
			if (x >= y)
				return x;
			else
				return y;
		});
		System.out.println("�ִ밪: " + max);
		// �ּҰ� ���
		int min = maxOrMin(
				(x, y) -> {
					if(x<=y) return x;
					else return y;
				}
		);
		System.out.println("�ּҰ�: " + min);

	}

}