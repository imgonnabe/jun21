package jun21;

import java.util.*;

public class Thanos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();// 리스트 원소 개수 고르기

		ArrayList<Integer> arr = new ArrayList<>();
		while (arr.size() < input) {// 1~input까지 숫자 무작위로 뽑기
			arr.add((int) (Math.random() * input) + 1);
		}
		System.out.println(arr);

		if (input % 2 == 0) {// 리스트 원소가 짝수라면
			for (int i = 0; i < input / 2; i++) {// input 절반 개수 지우기
				int num = (int) (Math.random() * (input - i));
				arr.remove(num);
			}
			System.out.println(arr);
		} else {// 리스트 원소가 홀수라면
			int coinFlip = (int) (Math.random() * 2); // 0 또는 1 반환
			if (coinFlip == 0) {
				for (int i = 0; i < (input / 2 + 1); i++) {
					int num = (int) (Math.random() * (input - i));
					arr.remove(num);
				}
				System.out.println(arr);

			} else {
				for (int i = 0; i < input / 2; i++) {
					int num = (int) (Math.random() * (input - i));
					arr.remove(num);
				}
				System.out.println(arr);

			}
		}
	}
}
