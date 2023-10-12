package isHas;

import java.util.HashSet;
import java.util.Set;

/*
 * is a
 */
class Human{
	String name;
	int age;
	int sex;
}

class Student extends Human{
	int number;
	String major;
}
// 학생은 사람이다.

class Gun{
	String name;
	int shot;
}

class Police{
	Gun gun;
}
// 경찰이 총을 가지고 있다.

public class IsHas {
	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>();
		
		a.add(7);
		System.out.println(a);
		a.add(5);
		System.out.println(a);
		a.add(5);
		System.out.println(a);
		a.remove(5);
		System.out.println(a);
		System.out.println(a.size());
		
		int a1 = 12, b = 5, sum = 2;
		b *= a1 /= 4;
		// 2     1
		sum += ++a1 * b-- / 4;
		//   3  1   2  4  2
		System.out.printf("%d", sum);
		
	}
}
